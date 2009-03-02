package TablaDeSimbolos.arbol;

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
