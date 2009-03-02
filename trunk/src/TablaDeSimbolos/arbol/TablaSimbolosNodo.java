package TablaDeSimbolos.arbol;

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

    
    public TablaSimbolosNodo ambitoPadre() throws Exception{
        if (_padre == null)
            throw new 
        return _padre;
    }
    
}
