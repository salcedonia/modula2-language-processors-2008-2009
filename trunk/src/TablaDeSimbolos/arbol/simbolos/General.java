/*
 * Este proyecto esta sujeto a licencia GPL
 * This project and code is uncer GPL license
 */

package TablaDeSimbolos.arbol.simbolos;

import TablaDeSimbolos.TipoSemantico;
import TablaDeSimbolos.arbol.Simbolo;
import TablaDeSimbolos.arbol.TablaSimbolosNodo;

/**
 * Exactamente como define la transparencia 3 del tema 3.1
 *    
 * @author Luis Ayuso
 */
public class General implements Simbolo{

    
    private String _lexema;
    private TablaSimbolosNodo _ambito;
    private TipoSemantico _tipoSemantico;
    private long _memoria;
   
    /**
     * 
     * un simbolo general es del tipo GENERAL
     * 
     * @return GENERAL
     */
    public tipo tipo() {
        return Simbolo.tipo.GENERALES;
    }

    
}
