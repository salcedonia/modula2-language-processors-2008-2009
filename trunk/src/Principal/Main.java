package Principal;

import java.io.FileReader;

import javax.swing.JOptionPane;

import GestorDeErrores.GestorErrores;
import Parser.SlkAction;
import Parser.SlkError;
import Parser.SlkLog;
import Parser.SlkParser;
import Parser.SlkToken;
import Scanner.Scanner;
import TablaDeSimbolos.TablaDeSimbolos;
import grupo3.plg.lexico.tablaSimbolos.TablaSimbolos;

//***************************************************************************//
/**
 * Clase principal del compilador.
 */
public class Main {

//	***************************************************************************//
	/**
	 * M�todo main del compilador.
	 * 
	 * @param args Argumentos de entrada al compilador.
	 */
	public static void main(String[] args) {
		
		GestorErrores gestorDeErrores = new GestorErrores();
		TablaDeSimbolos tablaSimbolos = new TablaDeSimbolos();
		String fichero = JOptionPane.showInputDialog(null,
						"Introduce la ruta relativa del fichero a compilar",
						"Pruebas/BIGREC.mod");
		
		if (fichero != null) {

			try {

				Scanner scanner = new Scanner(new FileReader(fichero), gestorDeErrores, tablaSimbolos);
				
				long inicio = System.currentTimeMillis();
				System.out.println("Analizando fichero: " + System.getProperty("user.dir") + "/" + fichero + "\n");
				
				SlkToken tokens = new SlkToken(scanner);
				SlkLog log = new SlkLog();
				SlkError error = new SlkError(tokens, log, gestorDeErrores);
				
				System.out.println(" Lista de TOKENS recibidos: ");
				System.out.println("---------------------------- ");
							
				// Analiza la entrada a nivel sint�ctico
                TablaSimbolos tabla = new TablaSimbolos();
                SlkParser slk = new SlkParser();
				slk.parse(1, new SlkAction(), tokens, error, log , (short) 0, tabla );

				// Muestra la lista de errores (Si los hay)
				gestorDeErrores.muestraListaErrores();
				
				System.out.println("\n--> Tiempo de ejecuci�n: " + (System.currentTimeMillis() - inicio) + " milisegundos");
			} 
			catch (Exception e) {

				if (fichero.length() > 0)
					System.err.println(e.getMessage());
				else
					System.err.println("Error en proceso E/S con el fichero: no hay par�metro");
			}
		}
	}
}