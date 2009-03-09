package Principal;

import Interfaz.VentanaPrincipal;

//***************************************************************************//
/**
 * Clase principal del compilador.
 */
public class Main {

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
}