package TablaDeSimbolos.arbol;

import Scanner.Atributos;
import java.util.ArrayList;

/**
 *
 * 
 * 
 * 
 * @author Luis Ayuso
 */
public abstract class Simbolo implements Atributos{
  
    public enum tipo{GENERALES, SUBPROGRAMA, ARRAY};

    public abstract String lexema();
    
    public abstract tipo tipo();

}
