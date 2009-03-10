package Parser;

import TablaSimbolos.TablaSimbolos;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class SlkAction {

    private TablaSimbolos _tablaDeSimbolos;
    /** Pila que contiene la informacion de los tipos */
    private Stack stack = new Stack();
    /**Variable que lleva la cuenta del numero de argumentos(numeros enteros, reales, identificadores*/

    private static final Logger logger = Logger.getLogger(SlkAction.class);
    public SlkAction(TablaSimbolos tabla) {
      _tablaDeSimbolos = tabla;
    }

	public void execute ( int number ){
<<<<<<< .mine
		switch ( number ) {
     case 1:  unidadDeCompilacion1();  break;
    case 2:  unidadDeCompilacion2();  break;
    case 3:  unidadDeCompilacion3();  break;
    case 4:  SentenciaAsignacion();  break;
    case 5:  Identificador();  break;
    case 6:  RestoSentenciaAsignacion();  break;
    case 7:  RestoSentenciaRestoAsignacion();  break;
    case 8:  Expresion();  break;
    case 9:  SentenciaWHILE();  break;
    case 10:  SentenciaREPEAT();  break;
    case 11:  SentenciaLOOP();  break;
    case 12:  SentenciaFOR();  break;
    case 13:  SentenciaWITH();  break;
    case 14:  SentenciaRETURN();  break;
    case 15:  ListaDeValores();  break;
    case 16:  vacio();  break;
    case 17:  RestoValores();  break;
    case 18:  ExpresionSimple();  break;
    case 19:  RestoExpresion();  break;
    case 20:  Signo();  break;
    case 21:  RestoExpresionSimple();  break;
    case 22:  OperadorSumador();  break;
    case 23:  termino();  break;
    case 24:  factor();  break;
    case 25:  numero();  break;
    case 26:  numEntero();  break;
    case 27:  numReal();  break;
        }
=======
		  switch ( number ) {
		    case 1:  unidadDeCompilacion1();  break;
		    case 2:  unidadDeCompilacion2();  break;
		    case 3:  unidadDeCompilacion3();  break;
		    case 4:  SentenciaAsignacion();  break;
		    case 5:  RestoSentenciaAsignacion();  break;
		    case 6:  RestoSentenciaRestoAsignacion();  break;
		    case 7:  Expresion();  break;
		    case 8:  SentenciaWHILE();  break;
		    case 9:  SentenciaREPEAT();  break;
		    case 10:  SentenciaLOOP();  break;
		    case 11:  SentenciaFOR();  break;
		    case 12:  SentenciaWITH();  break;
		    case 13:  SentenciaRETURN();  break;
		    case 14:  ListaDeValores();  break;
		    case 15:  vacio();  break;
		    case 16:  RestoValores();  break;
		    case 17:  RestoExpresion();  break;
		    case 18:  ExpresionSimple();  break;
		    case 19:  RestoExpresionSimple();  break;
		    case 20:  termino();  break;
		    case 21:  factor();  break;
		    case 22:  numero();  break;
		    case 23:  multiplicadorPor();  break;
		    case 24:  multiplicadorDivision();  break;
		    case 25:  multiplicadorDIV();  break;
		    case 26:  multiplicadorMOD();  break;
		    case 27:  multiplicadorAMPERSAND();  break;
		    case 28:  multiplicadorAND();  break;
		    case 29:  operdadorNOT();  break;
		    case 30:  TipFormalARRAY();  break;
		    case 31:  numEntero();  break;
		    case 32:  numReal();  break;
		    case 33:  listaElementos();  break;
		    case 34:  Elementos();  break;
		    case 35:  tipoPredefinido();  break;
		    case 36:  Identificador();  break;
		  }
>>>>>>> .r30
		
	}

    private void Expresion() {
<<<<<<< .mine
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en Expresion");
        }
=======
 	   System.out.println("---not yet implemented---");
>>>>>>> .r30
    }

    private void ExpresionSimple() {
<<<<<<< .mine
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en ExpresionSimple");
        }
=======
 	   System.out.println("---not yet implemented---");
>>>>>>> .r30
    }

    private void Identificador() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en identificador; \n Suponiendo que esta en la tabla de simbolos");
        }
    }

    private void ListaDeValores() {
        System.out.println("---ListaDeValores---");
    }

    private void OperadorSumador() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en operadorSumador");
        }
    }

    private void RestoExpresion() {
<<<<<<< .mine
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en restoExpresion");
        }
=======
 	   System.out.println("---not yet implemented---");
>>>>>>> .r30
    }

    private void RestoExpresionSimple() {
<<<<<<< .mine
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en restoExpresionSimple");
        }
=======
 	   System.out.println("---not yet implemented---");
>>>>>>> .r30
    }

    private void RestoSentenciaAsignacion() {
<<<<<<< .mine
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en restoSentenciaAsignacion");
        }
=======
 	   System.out.println("---not yet implemented---");
>>>>>>> .r30
    }

    private void RestoSentenciaRestoAsignacion() {
<<<<<<< .mine
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en restoSentenciRestoaAsignacion");
        }
=======
 	   System.out.println("---not yet implemented---");
>>>>>>> .r30
    }

    private void RestoValores() {
        System.out.println("---RestoValores---");
    }

    private void SentenciaAsignacion() {
<<<<<<< .mine
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en sentencia asignacion");
        }
        Nodo nodo = stack.pop();
        if(logger.isDebugEnabled()){
            logger.debug("Asignando el tipo " + nodo.toString());
        }
        
=======
 	   System.out.println("---not yet implemented---");
>>>>>>> .r30
    }

    private void SentenciaFOR() {
        System.out.println("---SentenciaFOR---");
    }

    private void SentenciaLOOP() {
        System.out.println("---SentenciaLOOP---");
    }

    private void SentenciaREPEAT() {
        System.out.println("---SentenciaREPEAT---");
    }

    private void SentenciaRETURN() {
        System.out.println("---SentenciaRETURN---");
    }

    private void SentenciaWHILE() {
        System.out.println("---SentenciaWHILE---");
        Nodo sentWHILE = new Nodo();
    }

    private void SentenciaWITH() {
        System.out.println("---SentenciaWITH---");
    }

    private void Signo() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en signo");
        }
    }

    private void factor() {
<<<<<<< .mine
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en factor");
        }
=======
    	   System.out.println("---not yet implemented---");
>>>>>>> .r30
    }

    private void numEntero() {
        if(logger.isDebugEnabled()){
            logger.debug("Introduciendo el tipo Entero");
        }
        Nodo nodo = new Nodo();
        nodo.concatRight("INTEGER");
        stack.push(nodo);
    }

    private void numReal() {
        if(logger.isDebugEnabled()){
            logger.debug("Introduciendo el tipo Real");
        }
        Nodo nodo = new Nodo();
        nodo.concatRight("REAL");
        stack.push(nodo);
    }

    private void numero() {
         if(logger.isDebugEnabled()){
            logger.debug("Entrando en numero");
        }
        
    }

    private void termino() {
<<<<<<< .mine
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en termino");
        }
=======
 	   System.out.println("---not yet implemented---");
>>>>>>> .r30
    }

    private void unidadDeCompilacion1() {
        System.out.println("---ModuloPrograma---");
    }

    private void unidadDeCompilacion2() {
        System.out.println("---ModuloDefinicion---");
    }

    private void unidadDeCompilacion3() {
        System.out.println("---ModuloImplementacion---");
    }

    private void vacio() {
        System.out.println("---Vacio---");
    }
    
    private boolean esUnico(String id){
        return _tablaDeSimbolos.esta(id);
    }

/*****************************************************************/
//REGLAS ANTONIO DE MIGUEL 
    
private void multiplicadorPor(){
    System.out.println("---regla multiplicacion POR---");
	
}
private void multiplicadorDivision(){
    System.out.println("---regla multiplicacion Division---");
	
}
private void multiplicadorDIV(){
	System.out.println("---regla multiplicacion DIV---");
}
private void multiplicadorMOD(){
	System.out.println("---regla multiplicacion MOD---");
}
private void multiplicadorAMPERSAND(){
	System.out.println("---regla multiplicacion AMPERSAND---");
}
private void multiplicadorAND(){
	System.out.println("---regla multiplicacion AND---");
}
private void operdadorNOT(){
	System.out.println("---regla NOT---");
}
private void TipFormalARRAY(){
	System.out.println("---regla tipo formal array---");
}
private void listaElementos() {
	System.out.println("---regla lista elementos---");
} 
private void Elementos() {
	System.out.println("---regla elementos---");
}
private void tipoPredefinido() {
	System.out.println("---regla tipo predefinido---");
}
private void Identificador() {
	System.out.println("---regla identificador---");
}  
//**************************************************/    
    
}
	
