/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Parser;

import java.util.Stack;

/**
 *
 * @author margarita
 */
public class PilaNodos extends Stack<Nodo> {

    private static PilaNodos pilaNodos = null;

    public static PilaNodos getInstancia() {
        if (pilaNodos == null) {
            pilaNodos = new PilaNodos();
        }
        return pilaNodos;
    }
}
