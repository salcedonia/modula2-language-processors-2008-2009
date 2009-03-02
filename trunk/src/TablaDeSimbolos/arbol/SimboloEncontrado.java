/*
 * Este proyecto esta sujeto a licencia GPL
 * This project and code is uncer GPL license
 */

package TablaDeSimbolos.arbol;

/**
 * durante la busqueda en el arbol de un simbolo, podemos encontrarle
 * por lo que se elevara en ese momento una excepción, evitando asi
 * el recorrido de la tabla de nuevo.
 * 
 * @author Luis Ayuso
 */
public class SimboloEncontrado extends Throwable{

    public Simbolo simbolo;
    
    public SimboloEncontrado(Simbolo s) {
        simbolo = s;
    }
}
