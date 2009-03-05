/*
 * Este proyecto esta sujeto a licencia GPL
 * This project and code is uncer GPL license
 */

package TablaDeSimbolos.arbol.simbolos;

import TablaDeSimbolos.arbol.Simbolo;
import java.util.Vector;

/**
 *
 * @author Luis Ayuso
 */
public class Array extends  General{

    
    private int _dimensiones;
    Vector<Integer> _componentes;        
    
    public Array(String cad) {
        super(cad);
    }
    
    @Override
    public Simbolo.tipo tipo() {
        return Simbolo.tipo.ARRAY;
    }  
    
    
}
