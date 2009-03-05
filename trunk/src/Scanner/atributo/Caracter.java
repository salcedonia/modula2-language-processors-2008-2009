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
public class Caracter implements Atributos {
    private char _c;

    public Caracter(char c) {
        _c = c;
    }
   
    public Caracter(String c) {
        _c = c.charAt(0);
    }
    
    @Override
    public String toString() {
        return Character.toString( _c);
    }
    
    public char getValue(){
        return _c;
    }
}
