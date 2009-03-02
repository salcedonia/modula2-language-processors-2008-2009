package GestorDeErrores;

import java.util.ArrayList;

//***************************************************************************//
/**
 * Clase que se encarga de gestionar todos los errores propios de la fase 
 * de an�lisis (l�xico, sint�ctico, sem�ntico) de nuestro compilador del 
 * lenguaje de M�dula-2.
 * 
 * @author Grupo1.
 */
public class GestorErrores {
	
	// ATRIBUTOS
	private ArrayList<TErrorLexico> _listaErroresLexicos;
	private ArrayList<TErrorSintactico> _listaErroresSintacticos;
	private boolean _flagErrores;
	
//	***************************************************************************//
	/**
	 * Constructor de la clase GestorErrores.
	 * Crea las listas de errores correspondientes a cada an�lisis y establece
	 * el flag para mostrar los errores a falso (porque no hay errores que 
	 * mostrar por el momento).
	 */
	public GestorErrores() {
		
		_listaErroresLexicos = new ArrayList<TErrorLexico>();
		_listaErroresSintacticos = new ArrayList<TErrorSintactico>();
		_flagErrores = false;
	}
	
//	***************************************************************************//
	/**
	 * Devuelve la instancia de la clase.
	 * 
	 * @return La instancia de la clase GestorErrores.
	 */
	public static GestorErrores getInstancia(){
		
		return new GestorErrores();
	}
	
//	***************************************************************************//
	/**
	 * Devuelve la lista de errores l�xicos producidos durante el an�lisis 
	 * l�xico.
	 * 
	 * @return La lista de errores l�xicos producidos durante el an�lisis 
	 * l�xico.
	 */
	public ArrayList<TErrorLexico> getErroresLexicos() {
		
		return _listaErroresLexicos;
	}
	
//	***************************************************************************//
	/**
	 * Establece la lista de errores l�xicos a valor <b>errores</b>.
	 * 
	 * @param errores La lista de errores l�xicos.
	 */
	public void setErroresLexicos(ArrayList<TErrorLexico> errores) {
		
		_listaErroresLexicos = errores;
	}
	
//	***************************************************************************//
	/**
	 * Devuelve la lista de errores sint�cticos producidos durante el an�lisis 
	 * sint�ctico.
	 * 
	 * @return La lista de errores sint�cticos producidos durante el an�lisis 
	 * sint�ctico.
	 */
	public ArrayList<TErrorSintactico> getErroresSintacticos() {
		
		return _listaErroresSintacticos;
	}
	
//	***************************************************************************//
	/**
	 * Establece la lista de errores sint�cticos a valor <b>errores</b>.
	 * 
	 * @param errores La lista de errores sint�cticos.
	 */
	public void setErroresSintacticos(ArrayList<TErrorSintactico> errores) {
		
		_listaErroresSintacticos = errores;
	}

//	***************************************************************************//
	/**
	 * Inserta un error de _tipo l�xico.
	 * 
	 * @param error El error l�xico. 
	 */
	public void insertaErrorLexico(TErrorLexico error){
		
		_listaErroresLexicos.add(error);
		setFlagErrores(true);
	}
		
//	***************************************************************************//
	/**
	 * Inserta un error de _tipo sint�ctico.
	 * 
	 * @param error El error sint�ctico. 
	 */
	public void insertaErrorSintactico(TErrorSintactico error){
			
		_listaErroresSintacticos.add(error);
		setFlagErrores(true);
	}
	
//	***************************************************************************//
	/**
	 * Muestra toda la lista de errores asociados al an�lisis del fichero de
	 * entrada por parte de los 3 analizadores.
	 */
	public void muestraListaErrores(){
		
		TErrorLexico listaLexicos;
		TErrorSintactico listaSintacticos;
		
		if (_flagErrores){
			
			System.out.println("\n Errores L�xicos:  ");
			System.out.println("------------------");
			
			for (int i = 0; i<_listaErroresLexicos.size();i++){
				listaLexicos = _listaErroresLexicos.get(i);
				System.out.println(listaLexicos.toString());
			}
			
			System.out.println("\n Errores Sint�cticos:  ");
			System.out.println("----------------------");
			
			for (int i = 0; i<_listaErroresSintacticos.size();i++){
				listaSintacticos = _listaErroresSintacticos.get(i);
				System.out.println(listaSintacticos.toString());
			}
		}
		else System.out.println("\nNo hay errores.");
	}

    public StringBuffer dameListaErrores(){
        StringBuffer salida = new StringBuffer();
        TErrorLexico listaLexicos;
		TErrorSintactico listaSintacticos;

		if (_flagErrores){

			salida.append("\n Errores L�xicos:  ");
			salida.append("------------------");

			for (int i = 0; i<_listaErroresLexicos.size();i++){
				listaLexicos = _listaErroresLexicos.get(i);
				salida.append(listaLexicos.toString());
			}

			salida.append("\n Errores Sint�cticos:  ");
			salida.append("----------------------");

			for (int i = 0; i<_listaErroresSintacticos.size();i++){
				listaSintacticos = _listaErroresSintacticos.get(i);
				salida.append(listaSintacticos.toString());
			}
		}
		else salida.append("\nNo hay errores.");
        return salida;
	}


//	***************************************************************************//
	/**
	 * Establece el flag de mostrar errores a valor <b>valor</b>.
	 * 
	 * @param valor Nuevo valor a establecer.
	 */
	public void setFlagErrores(boolean valor) {
		
		_flagErrores = valor;
	}
}
