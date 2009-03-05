/*
 * Este proyecto esta sujeto a licencia GPL
 * This project and code is uncer GPL license
 */

package Scanner.atributo;

import Scanner.Atributos;
import Scanner.TipoPuntuacion;

/**
 *
 * @author Luis Ayuso
 */
public class Puntuacion implements Atributos{

    TipoPuntuacion _puntuacion;
    public Puntuacion(TipoPuntuacion p) {
        _puntuacion = p;
    }

    @Override
    public String toString() {
        return _puntuacion.name();
    }
    
    

}
