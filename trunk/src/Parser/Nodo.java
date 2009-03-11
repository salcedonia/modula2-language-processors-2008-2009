/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Parser;

import Scanner.TipoToken;
import java.util.ArrayList;

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
    private ArrayList tipos = null; // Tipo semántico del objeto

    private String valor;

    public ArrayList getTipos() {
        return tipos;
    }

    public void setTipos(ArrayList tipos) {
        this.tipos = tipos;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }


    public Nodo() {
        // Constructora por defecto
        tipos = new ArrayList();
    }

    public ArrayList getTipo() {
        return this.tipos;
    }

    public void setTipo(ArrayList tipos) {
        this.tipos = tipos;
    }

    public ArrayList getArray() {
        return tipos;
    }

    public void concatRight(TipoToken type){
        if(tipos == null){
            tipos = new ArrayList();
        }
        tipos.add(type);
    }

    @Override
    public String toString(){
        StringBuilder trace = new StringBuilder("Nodo{tipo: ");
        trace.append(tipos);
        trace.append("; tipo.size: ");
        if(tipos != null){
            trace.append(tipos.size());
        }
        else{
            trace.append("0");
        }
        trace.append("}");
        return trace.toString();
    }

}
