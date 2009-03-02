/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grupo3.plg.lexico.tablaSimbolos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import org.apache.log4j.Logger;

/**
 *
 * @author Administrador
 */
public class TablaSimbolos {
    
        private String nombre;
        private Hashtable tabla;
        private ArrayList exportadas;
        private TablaSimbolos continente;
        private TablaSimbolos modPadre;
       

        private static final Logger logger = Logger.getLogger(TablaSimbolos.class);
    public TablaSimbolos()

    {      
    }

    public TablaSimbolos(String nombre)
    {
        this.nombre = nombre;
        this.tabla = new Hashtable();
        this.continente = null;
        this.modPadre = null;
        this.exportadas = new ArrayList();
    }
    public TablaSimbolos(String nombre, TablaSimbolos continente, TablaSimbolos modPadre)
    {
        this.nombre= nombre;
        this.continente= continente;
        this.modPadre = modPadre;
        this.exportadas  = new ArrayList();
        this.tabla = new Hashtable();
    }
    public void insertarExportada(String lexema){
        exportadas.add(lexema);
    }

    public TablaSimbolos accederAmbitoInf(String nombre)
    {
        Argumentos arg = (Argumentos) tabla.get(nombre);
        if(arg!= null)
        {
            return arg.getContenido();
        }
        else return null;
    }
    
    public String contenidoTabla(String excluir)
    {
        Collection valores = tabla.values();
        Enumeration valor =tabla.keys();
        Set keySet  = tabla.keySet();
        String salida ="---------Nombre tabla: " + this.getNombre()+"---------"+ '\n';
        for(Iterator i = keySet.iterator(); i.hasNext(); ) {
        Object key = i.next();
        Argumentos args = (Argumentos) tabla.get(key);
        if(!key.equals(excluir))
        {
            if(args!= null){
                TablaSimbolos tablaInt = args.getContenido();
                if(tablaInt!= null)
                {
                    salida = salida + key + " -->  " + tablaInt.getNombre()+ '\n';
                }
                else{
                    salida = salida + key+ '\n';
                }
            }
        }
        }     
        
        return salida;
        
    }
     public String contenidoTabla()
    {        
        Set keySet  = tabla.keySet();
        String salida ="---------Nombre tabla: " + this.getNombre()+"---------"+ '\n';
        for(Iterator i = keySet.iterator(); i.hasNext(); ) {
        Object key = i.next();
        Argumentos args = (Argumentos) tabla.get(key);
        if(args!= null){
                TablaSimbolos tablaInt = args.getContenido();
                if(tablaInt!= null)
                {
                    salida = salida + key + " -->  " + tablaInt.getNombre()+ '\n';
                    if(tablaInt.getExportadas().size()>0)
                    {
                        for(Iterator j = tablaInt.getExportadas().iterator(); j.hasNext(); )
                        {
                            salida = salida + "     " + j.next()+"  exportada de modulo " + tablaInt.getNombre()+ '\n';
                        }
                    }
                }
                else{
                    salida = salida + key+ '\n';
                }
            }
        }
        return salida;

    }
    public void insertarIdentificador(String lexema)
    {       
        if(tabla.containsKey(lexema) || nombre.equals(lexema))
        {
           logger.error("Ya esta definida la variable "+ lexema + " o la variable se llama = que el modulo");
        }
        else{
            logger.debug("Insertando identificador en la tabla del modulo "+ nombre + " y lexema " + lexema);
        tabla.put(lexema,new Argumentos());
        }
    }
     public void insertarIdentificador(String lexema, Argumentos contenido)
    {
        if(tabla.containsKey(lexema) || nombre.equals(lexema))
        {
           logger.error("Ya esta definida la variable "+ lexema + " o la variable se llama = que el modulo");
        }
        else{
            logger.debug("Insertando identificador en la tabla del modulo "+ nombre + " y lexema " + lexema);
        tabla.put(lexema,contenido);
        }
    }

    public String dameVariablesVisibles(String excluir)
    {
        String salida;
        salida = this.contenidoTabla(excluir);
        if(continente != null)
        {
            salida  = salida + continente.dameVariablesVisibles(nombre);
        }
        return salida;

    }
    
    public TablaSimbolos insertarModulo(String lexema)
    {
        if(tabla.contains(lexema) || nombre.equals(lexema))
        {
           logger.error("Ya esta definido el modulo "+ lexema);
           return this;
        }
        else{
        TablaSimbolos modulo = new TablaSimbolos(lexema,null, this);
        tabla.put(lexema,new Argumentos(modulo));
        logger.debug("Insertando modulo");
        return modulo;
        }
    }
    
    public TablaSimbolos insertarProcedimiento(String lexema)
    {
        if(tabla.contains(lexema) || nombre.equals(lexema))
        {
           logger.error("Ya esta definido el procedimiento "+ lexema);
           return this;
        }
        else{
            TablaSimbolos modulo = new TablaSimbolos(lexema,this, null);
            tabla.put(lexema,new Argumentos(modulo));
            logger.debug("insertando procedimiento");
            return modulo;        
        }
    }

    public boolean esta(String var)
    {
        boolean estaVar = tabla.containsKey(var);
        while(continente!= null)
        {
            estaVar =  estaVar || continente.esta(var);
        }
        return estaVar;
    }
    public String getNombre() {
        return nombre;
    }
    
    public TablaSimbolos getContinente() {
        return continente;
    }

    public ArrayList getExportadas() {
        return exportadas;
    }

    public TablaSimbolos getModPadre() {
        return modPadre;
    }

    public Hashtable getTabla() {
        return tabla;
    }

    public void obtenerExportadas() {
        for(Iterator it = exportadas.iterator(); it.hasNext(); ){
            String clave = (String) it.next();
            Argumentos reg = (Argumentos) tabla.get(clave);
            modPadre.insertarIdentificador(clave, reg);
        }
    }

    public void setContinente(TablaSimbolos continente) {
        this.continente = continente;
    }

    public void setExportadas(ArrayList exportadas) {
        this.exportadas = exportadas;
    }
    public void anadirVariableExportada(String lexema)
    {
        if(!exportadas.contains(lexema))
        {
            this.exportadas.add(lexema);
        }

    }

    public void setModPadre(TablaSimbolos modPadre) {
        this.modPadre = modPadre;
    }

    public void setTabla(Hashtable tabla) {
        this.tabla = tabla;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
        
        
}
