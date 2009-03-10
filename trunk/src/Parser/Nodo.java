/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Parser;

/**
 *
 * La clase Nodo contiene los atributos heredados y/o sintetizados
 * de cada una de los símbolos de producción.
 * 
 * Si necesitas un nuevo atributo, agrégalo pero pon un comentario
 * indicando claramente para qué sirve. Quizá otra persona necesite
 * hacer uso del mismo.
 *
 * @author Daniel
 */
public class Nodo {
    private String tipo; // Tipo semántico del objeto

    public Nodo() {
        // Constructora por defecto
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
