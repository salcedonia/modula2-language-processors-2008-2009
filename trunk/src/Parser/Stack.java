/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Parser;


import java.util.ArrayList;
import org.apache.log4j.Logger;

/**
 *
 * @author margarita
 */
public class Stack {

    /** Arraylist que representa la pila*/
    private ArrayList stackArray;

    private static final Logger logger = Logger.getLogger(Stack.class);

    public Stack(){
        stackArray = new ArrayList();
    }

    public void push(Nodo nodo){
        if(logger.isDebugEnabled()){
            logger.debug("Introduciendo en la pila el nodo " + nodo);
        }
        stackArray.add(nodo);
    }

    public Nodo pop(){
        Nodo nodo = (Nodo) stackArray.get(stackArray.size()-1);
        stackArray.remove(stackArray.size()-1);
        if(logger.isDebugEnabled()){
            logger.debug("Sacando de la pila el nodo " + nodo);
        }
        return nodo;
    }
}
