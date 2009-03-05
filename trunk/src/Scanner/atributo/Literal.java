/*
 * Este proyecto esta sujeto a licencia GPL
 * This project and code is uncer GPL license
 */

package Scanner.atributo;

import Scanner.Atributos;

/**
 *
 * @author Luis Ayuso
 */
public class Literal implements Atributos{
   String _cad;

    public Literal(String cad) {
        _cad  =cad;
    }
    
    public Literal(char[] cad) {
        _cad  = new String(cad);
    }
    

    @Override
    public String toString() {
        return _cad;
    }
    
    public String getValue() {
        return _cad;
    }
}
