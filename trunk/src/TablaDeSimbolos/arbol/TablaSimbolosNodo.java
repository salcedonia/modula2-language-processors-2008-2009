package TablaDeSimbolos.arbol;

import TablaDeSimbolos.arbol.simbolos.General;
import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * La tabla de simbolos se organiza en forma de arbol, de forma que 
 * todos los nodos tienen un ambito superior, hasta llegar al global.
 * 
 * 
 * @author Luis Ayuso
 */
public class TablaSimbolosNodo {

    /**
     * el ambito padre, al que pertence este nivel
     */
    private TablaSimbolosNodo _padre;
    /**
     * tabla que contiene los simbolos en este nivel
     */
    private Hashtable<String, Simbolo> _tabla;
    /**
     * al abrir nuevos ambitos aumenta el anidamiento
     */
    private int _nivel;
    /**
     * ambitos hijos de este
     */
    private Vector<TablaSimbolosNodo> _hijos;

    /**
     * expande un nivel de la tabla de simbolos, anida, de forma
     * que el ambito es hijo del anterior
     * 
     * @param padre, el padre es el ambito de nivel superior.
     */
    public TablaSimbolosNodo(TablaSimbolosNodo padre) {
        _hijos = new Vector<TablaSimbolosNodo>();
        _tabla = new Hashtable<String, Simbolo>();
        if (padre == null) {
            _nivel = 0;
            _padre = null;
        } else {
            _nivel = padre._nivel;
            _padre = padre;
        }
    }

    /**
     * genera el nivel raiz de la tabla de simbolos, esto es, el ambito
     * gobal.
     * 
     */
    public TablaSimbolosNodo() {
        _hijos = new Vector<TablaSimbolosNodo>();
        _tabla = new Hashtable<String, Simbolo>();

        _nivel = 0;
        _padre = null;
    }
    
    /**
     * comprueba la existencia de un simbolo ya en la tabla de forma recursiva
     * por las ramas del arbol hasta la raíz.
     * 
     * @param id el identificador a buscar
     * @return false si no lo encontramos
     * @throws TablaDeSimbolos.arbol.SimboloEncontrado si lo encontramos se eleva
     * una excepción con la referencia al simbolo. de esta forma no hay que repetir la
     * busqueda.
     */
    public boolean estaInsertada(String id) throws SimboloEncontrado{
        
        if (_tabla.containsKey(id)) throw new SimboloEncontrado(_tabla.get(id));
        
        if (this._nivel == 0)
            return false;
        else
            return this._padre.estaInsertada(id);
    }
    
    /**
     * sube un nivel en el arbol, creando un ambito nuevo
     * @return el ambito anidado.
     */
    public TablaSimbolosNodo anidaAmbito(){
        TablaSimbolosNodo t = new TablaSimbolosNodo(this);
        _hijos.add(t);
        return t;
    }
    
       /**
     * recupera el ambito padre, esto es, el ambito que emgloba a este
     * 
     * @return el ambito de orden inmediatamente inferior a este
     * @throws TablaDeSimbolos.arbol.TablaSimbolosExcepcion si estamos en la raiz
     */
    public TablaSimbolosNodo ambitoPadre() throws TablaSimbolosExcepcion{
        if (_padre == null)
            throw new  TablaSimbolosExcepcion();
        return _padre;
    } 
    
    public Simbolo addSimboloGeneral(String cad){
        Simbolo s =  new General(cad);
        this._tabla.put(cad, s);
        return s;
        
    }
}
