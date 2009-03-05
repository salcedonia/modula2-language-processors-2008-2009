/*
 * Este proyecto esta sujeto a licencia GPL
 * This project and code is uncer GPL license
 */

package Scanner.atributo;

import Scanner.Atributos;
import java.io.IOException;

/**
 *
 * @author Luis Ayuso
 */
public class Entero implements Atributos {

    private long _num;

    public Entero(int num) {
        _num = num;
    }
    
    public Entero(long num) {
        _num = num;
    }
    
    public Entero(String num) {
        _num = Integer.parseInt(num);
    }
    
    @Override
    public String toString() {
        return Long.toString( _num);
    }
    
    public long getValue(){
        return _num;
    }
}
