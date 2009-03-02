/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grupo3.plg.lexico.tablaSimbolos;

import java.util.ArrayList;
import org.apache.log4j.Logger;

/**
 *
 * @author Administrador
 */
public class Argumentos {

        private String tipo;
        private Object valor;
        private int numArgs;   
        private TablaSimbolos contenido;
        private ArrayList tiposArgumentos;
        private ArrayList pasoArgumentos;
        private static final Logger logger = Logger.getLogger(Argumentos.class);
        
    public Argumentos(){
        contenido = null;
    }
    public Argumentos(TablaSimbolos contenido)
    {
        this.contenido = contenido;
        logger.debug("Creando la tabla con puntero  " + contenido.getNombre());
    }
    public TablaSimbolos getContenido() {
        return contenido;
    }
    
    public int getNumArgs() {
        return numArgs;
    }

    public ArrayList getPasoArgumentos() {
        return pasoArgumentos;
    }

    public String getTipo() {
        return tipo;
    }

    public ArrayList getTipoArgumentos() {
        return tiposArgumentos;
    }

    public Object getValor() {
        return valor;
    }

    public void setNumArgs(int numArgs) {
        this.numArgs = numArgs;
    }

    public void setPasoArgumentos(ArrayList pasoArgumentos) {
        this.pasoArgumentos = pasoArgumentos;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTipoArgumentos(ArrayList tipoArgumentos) {
        this.tiposArgumentos = tipoArgumentos;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public void setContenido(TablaSimbolos contenido) {
        this.contenido = contenido;
    }
        
        
}
