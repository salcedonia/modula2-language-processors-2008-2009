package Parser;

import TablaSimbolos.TablaSimbolos;
import java.util.ArrayList;

public class SlkAction {

    private TablaSimbolos _tablaDeSimbolos;
    
    public SlkAction(TablaSimbolos tabla) {
      _tablaDeSimbolos = tabla;
    }

	public void execute ( int number ){
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
    case 23:  numEntero();  break;
    case 24:  numReal();  break;
        }
		
	}

    private void Expresion() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void ExpresionSimple() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void ListaDeValores() {
        System.out.println("---ListaDeValores---");
    }

    private void RestoExpresion() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void RestoExpresionSimple() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void RestoSentenciaAsignacion() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void RestoSentenciaRestoAsignacion() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void RestoValores() {
        System.out.println("---RestoValores---");
    }

    private void SentenciaAsignacion() {
        throw new UnsupportedOperationException("Not yet implemented");
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

    private void factor() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void numEntero() {
        System.out.println("---numEntero---");
        Nodo entero = new Nodo();
        ArrayList array = entero.getArray();
        array.add("Integer");
        entero.setTipo(array);
    }

    private void numReal() {
        System.out.println("---numReal---");
        Nodo entero = new Nodo();
        ArrayList array = entero.getArray();
        array.add("Real");
        entero.setTipo(array);
    }

    private void numero() {
        System.out.println("---numero---");
        Nodo numero = new Nodo();
    }

    private void termino() {
        throw new UnsupportedOperationException("Not yet implemented");
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
}
	
