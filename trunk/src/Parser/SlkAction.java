package Parser;

import TablaSimbolos.TablaSimbolos;

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
            // Grupo 3 - Daniel Martín
            case 4:  SentenciaWHILE();  break;
            case 5:  SentenciaREPEAT();  break;
            case 6:  SentenciaLOOP();  break;
            case 7:  SentenciaFOR();  break;
            case 8:  SentenciaWITH();  break;
            case 9:  SentenciaRETURN();  break;
            case 10:  ListaDeValores();  break;
            case 11:  vacio();  break;
            case 12:  RestoValores();  break;
            // Siguiente persona
        }
		
	}

    private void ListaDeValores() {
        System.out.println("---ListaDeValores---");
    }

    private void RestoValores() {
        System.out.println("---RestoValores---");
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
    }

    private void SentenciaWITH() {
        System.out.println("---SentenciaWITH---");
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
	
