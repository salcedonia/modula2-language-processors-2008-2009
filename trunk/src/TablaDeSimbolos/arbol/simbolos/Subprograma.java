/*
 * Este proyecto esta sujeto a licencia GPL
 * This project and code is uncer GPL license
 */

package TablaDeSimbolos.arbol.simbolos;

import TablaDeSimbolos.arbol.Simbolo;
import java.util.Vector;

/**
 * 
 * Utiliza el tipo del simbolo genérico como valor de retorno
 *
 * @author Luis Ayuso
 */
public class Subprograma extends General{

    public enum modo{VALOR, REFERENCIA}
    
    private Vector<Simbolo> _argumentos; 
    private Vector<modo>    _modos;

    public Subprograma(String cad) {
        super(cad);
    }
            
    @Override
    public Simbolo.tipo tipo() {
        return Simbolo.tipo.SUBPROGRAMA;
    }    
}
