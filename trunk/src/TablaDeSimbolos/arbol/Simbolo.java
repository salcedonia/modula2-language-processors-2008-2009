package TablaDeSimbolos.arbol;

import java.util.ArrayList;

/**
 *
 * 
 * 
 * 
 * @author Luis Ayuso
 */
public interface Simbolo {
  
    public enum tipo{GENERALES, SUBPROGRAMA, ARRAY};
    
    public tipo tipo();

}
