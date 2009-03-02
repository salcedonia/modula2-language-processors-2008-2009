package TablaDeSimbolos;

import TablaDeSimbolos.arbol.Simbolo;
import TablaDeSimbolos.arbol.SimboloEncontrado;
import TablaDeSimbolos.arbol.TablaSimbolosExcepcion;
import TablaDeSimbolos.arbol.TablaSimbolosNodo;
import java.util.ArrayList;
import java.util.Hashtable;

//***************************************************************************//
/**
 * Esta clase implementa la tabla de símbolos necesitada por cualquier compilador.
 * Gestiona diferentes tipos de ámbitos y palabras reservadas.
 * 
 * @author Grupo1.
 */
public class TablaDeSimbolos{
	
	// ATRIBUTOS
	private Hashtable<String, ArrayList<Object>> _palabrasReservadas;
//	private ArrayList<Hashtable<String, ArrayList<Object>>> _listaAmbitos;
//	private Hashtable<Integer, Integer>	_tablaOrganizador;
    
	private TablaSimbolosNodo _ambitoActual;
	private boolean	_insercionesPermitidas;

//	***************************************************************************//
	/**
	 * Constructor de la clase TablaDeSimbolos.
	 * 
	 * Initializes all the resources needed later on and opens the main scope.
	 */
	public TablaDeSimbolos(){
		
		// Inicializa el flag de Inserciones Permitidas
		_insercionesPermitidas = true; //TODO ESTO ES FALSE, PERO CUANDO SE ANADA EL SINTACTICO
		
		// Actualiza el puntero a dicho ámbito
		_ambitoActual = new TablaSimbolosNodo();
	
		// Añade las palabras reservadas a las tablas
                _palabrasReservadas = new Hashtable<String, ArrayList<Object>>();
		generaListaReservadas();
	}
	
//	***************************************************************************//
	/**
	 * Inicializa la tabla de palabras reservadas de la clase PalabrasReservadas.
	 */
	private void generaListaReservadas(){
	
		PalabrasReservadas[] reserved = PalabrasReservadas.values();
		for (PalabrasReservadas word : reserved ) {
			
			ArrayList<Object> atributos = new ArrayList<Object>();
			//atributos.add(new Integer(word.ordinal()));
			atributos.add(new String(word.toString()));
			_palabrasReservadas.put(word.toString(), atributos);
		}
	}
	
//	***************************************************************************//
	/**
	 * Busca una palabra en la tabla de palabras reservadas. 
	 * 
	 * @param identificador Identificador a buscar.
	 *  
	 * @return Verdadero si el identificador dado es una palabra reservada y
	 * falso en caso contrario.
	 *  
	 * @see #estaInsertada(String) 
	 */
	public boolean esPalabraReservada(String identificador){
		
		return _palabrasReservadas.containsKey(identificador.toUpperCase());
	}
	
//	***************************************************************************//
	/**
	 * Devuelve la palabra reservada asociada a identificador.
	 * 
	 * @param identificador Identificador asociado.
	 * 
	 * @return La palabra reservada asociada a identificador.
	 */
	public ArrayList<Object> getPalabraReservada(String identificador){
		return _palabrasReservadas.get(identificador.toUpperCase());
	}
	
//	***************************************************************************//
	/**
	 * Trata de insertar un nuevo identificador en la tabla.
	 * 
	 *  @param identificador Identificador a insertar.
	 *  @return	<li>Un puntero a la nueva entrada.
	 *  		<li>Un puntero a la entrada previa, si el identificador 
	 *  		estaba ya previamente definido o era una palabra reservada.
	 *  		<li>Un puntero a <i>null</i> si las inserciones no están permitidas 
	 */
	public Simbolo insertaIdentificador(String identificador){
		
		Integer iAmbitoTemporal;
		iAmbitoTemporal = new Integer(0);
		
		// Si ya existe se devuelve un puntero a la entrada previamente generada.
		try{
                    _ambitoActual.estaInsertada(identificador);
                }catch(SimboloEncontrado s){
                    return s.simbolo;
                }
		
		// Si no se permiten inserciones retorna null
		if (!_insercionesPermitidas) return null;
		
		/* 
		 * Si no es reservada ni existe previamente se inserta y se devuelve 
		 * un puntero a dicha entrada.
		 */
		//ArrayList<Object> atributos = new ArrayList<Object>();
		//atributos.add(new String(identificador));
                
                // Retorna el puntero a la entrada insertada
                return _ambitoActual.addSimboloGeneral(identificador);
	}
	
//	***************************************************************************//
	/**
	 * Añade un nuevo ámbito a la tabla y actualiza todos los recursos relacionados. 
	 * 
	 * @see #CierraAmbito()
	 */
	public void abreAmbito(){
		_ambitoActual = _ambitoActual.anidaAmbito();
	}
	
//	***************************************************************************//
	/**
	 * Devuelve la palabra reservada asociada a contenido.
	 * 
	 * @param contenido Palabra reservada asociada a contenido.
	 * 
	 * @return La palabra reservada asociada a contenido. 
	 */
	public Object obtenerPalabraReservada(Object contenido){
		
		return _palabrasReservadas.get(contenido);
	}
	
//	***************************************************************************//
	/**
	 * Cierra el ámbito actual y devuelve el ámbito actual al padre.
	 *
	 * @see #abreAmbito()
	 */
	public void CierraAmbito(){
	    
            try{
            _ambitoActual = _ambitoActual.ambitoPadre();
            } catch (TablaSimbolosExcepcion ex){
                // DO NOTHING:
                // el ambito actual es la raiz del arbol
            }
	}
	
//	***************************************************************************//
	/**
	 * Devuelve el flag privado para permitir las inserciones.
	 * 
	 * @return Verdadero Si las inserciones están permitidas y falso en 
	 * caso contrario.
	 * 
	 * @see #getInsercionesPermitidas()
	 */
	public boolean getInsercionesPermitidas(){
		
		return _insercionesPermitidas;
	}
	
//	***************************************************************************//
	/**
	 * Establece el flag privado para permitir las inserciones.
	 * 
	 * @param nuevoValor Nuevo valor del flag.
	 * 
	 * @see #getInsercionesPermitidas()
	 */
	public void setInsercionesPermitidas(boolean nuevoValor){
		
		_insercionesPermitidas = nuevoValor;
	}	
}
