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
public class Operador implements Atributos{

    String _cad;

    public Operador(String cad) {
        _cad  =cad;
    }
    

    @Override
    public String toString() {
        return _cad;
    }
    
    public String getValue() {
        return _cad;
    }
}
