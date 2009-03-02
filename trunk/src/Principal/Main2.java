package Principal;
import java.io.FileReader;

import javax.swing.JOptionPane;

import GestorDeErrores.GestorErrores;
import Scanner.Scanner;
import TablaDeSimbolos.TablaDeSimbolos;
import Scanner.Token;

public class Main2 {

//	 MÃ©todo principal
	  public static void main(String[] args) {
		  GestorErrores gestor = new GestorErrores();
		  TablaDeSimbolos tablaSimbolos = new TablaDeSimbolos();
		  String fichero = JOptionPane.showInputDialog(null, "Introduce la ruta relativa del fichero a compilar", "Pruebas/prueba.mod");
		  
		  if (fichero != null) {

			  try {	    	  
		    	  Scanner lexer = new Scanner(new FileReader(fichero), gestor, tablaSimbolos);
		    	  System.out.println("Analizando fichero: " + System.getProperty("user.dir") + 
		    			  			 "/" + fichero);
		    	  long inicio = System.currentTimeMillis();
		    	  // Analiza token a token el fichero
		    	  Token sym;
		    	  
		    	  do{
		    		  
		    		  sym = lexer.get_token();
				      System.out.println("Token -> " + sym.toString());
		              
		          }while(sym._tipo != 0);
		    	  
		          // Muestra la lista de errores
			      gestor.muestraListaErrores();	
			      
			      System.out.println();
			      System.out.println("Tiempo de ejecución: " + (System.currentTimeMillis() - inicio) + " milisegundos");

		      }
		      catch (Exception e) {
		    	
		    	  if(fichero.length()>0) 
		    		  System.err.println("Problema durante el tratamiento del fichero de entrada");				     
		    	  else	
		    		  System.err.println("El fichero especificado no existe");				     
		    
		      }	
		  }
	  }
}