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
public class Real implements Atributos{
    private double _num;

    public Real(int num) {
        _num = num;
    }
    
    public Real(long num) {
        _num = num;
    }
    
     public Real(float num) {
        _num = num;
    }
    
    public Real(double num) {
        _num = num;
    }  
    
    public Real(String num) {
        _num = Integer.parseInt(num);
    }
    
    @Override
    public String toString() {
        return Double.toString( _num);
    }
    
    public double getValue(){
        return _num;
    }
}
