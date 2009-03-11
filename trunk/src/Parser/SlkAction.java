package Parser;

import TablaSimbolos.TablaSimbolos;
import org.apache.log4j.Logger;

public class SlkAction {

    private TablaSimbolos _tablaDeSimbolos;

    /**Variable que lleva la cuenta del numero de argumentos(numeros enteros, reales, identificadores*/

    private static final Logger logger = Logger.getLogger(SlkAction.class);
    private boolean declaracion = false;
    public SlkAction(TablaSimbolos tabla) {
      _tablaDeSimbolos = tabla;
    }

	public void execute ( int number ){
		switch ( number ) {
     case 1:  unidadDeCompilacion1();  break;
    case 2:  unidadDeCompilacion2();  break;
    case 3:  unidadDeCompilacion3();  break;
    case 4:  CierraAmbito();  break;
    case 5:  Declaracion();  break;
    case 6:  tipoSimple();  break;
    case 7:  tipoSimple2();  break;
    case 8:  subrango();  break;
    case 9:  listaIdentificadores();  break;
    case 10:  vacio();  break;
    case 11:  variable();  break;
    case 12:  cierravariable();  break;
    case 13:  Marca();  break;
    case 14:  listaVariables();  break;
    case 15:  Begin();  break;
    case 16:  SentenciaAsignacion();  break;
    case 17:  Identificador();  break;
    case 18:  RestoSentenciaAsignacion();  break;
    case 19:  RestoSentenciaRestoAsignacion();  break;
    case 20:  Expresion();  break;
    case 21:  SentenciaWHILE();  break;
    case 22:  SentenciaREPEAT();  break;
    case 23:  SentenciaLOOP();  break;
    case 24:  SentenciaFOR();  break;
    case 25:  SentenciaWITH();  break;
    case 26:  SentenciaRETURN();  break;
    case 27:  ListaDeValores();  break;
    case 28:  RestoValores();  break;
    case 29:  ExpresionSimple();  break;
    case 30:  RestoExpresion();  break;
    case 31:  Signo();  break;
    case 32:  RestoExpresionSimple();  break;
    case 33:  termino();  break;
    case 34:  OperadorSumador();  break;
    case 35:  factor();  break;
    case 36:  numero();  break;
    case 37:  igual();  break;
    case 38:  distinto();  break;
    case 39:  distinto2();  break;
    case 40:  menor();  break;
    case 41:  menorIgual();  break;
    case 42:  mayor();  break;
    case 43:  mayorIgual();  break;
    case 44:  operadorIn();  break;
    case 45:  suma();  break;
    case 46:  resta();  break;
    case 47:  operadorOr();  break;
    case 48:  mult();  break;
    case 49:  division();  break;
    case 50:  divisionEntera();  break;
    case 51:  operadorModulo();  break;
    case 52:  ampersand();  break;
    case 53:  operadorAnd();  break;
    case 54:  operadorNot();  break;
    case 55:  operadorComplemento();  break;
    case 56:  numEntero();  break;
    case 57:  numReal();  break;
    case 58:  tipoPredefinido();  break;
    case 59:  bitset();  break;
    case 60:  booleano();  break;
    case 61:  cardinal();  break;
    case 62:  caracter();  break;
    case 63:  entero();  break;
    case 64:  longint();  break;
    case 65:  longreal();  break;
    case 66:  proc();  break;
    case 67:  real();  break;
    case 68:  verdadero();  break;
    case 69:  falso();  break;
    case 70:  nil();  break;
    case 71:  identificador();  break;
        }

	}

    private void Begin() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en begin. Encargado de no dejar declarar variables");
        }
    }

    private void CierraAmbito() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en cierra Ambito. ");
        }
    }

    private void Declaracion() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en declaracion");
        }
        Nodo nodo = new Nodo();
        nodo.setValor("#");
        PilaNodos.getInstancia().push(nodo);
    }

    private void Expresion() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en Expresion");
        }
    }

    private void ExpresionSimple() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en ExpresionSimple");
        }
    }

    private void Identificador() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en identificador; \n Suponiendo que esta en la tabla de simbolos");
        }
    }

    private void ListaDeValores() {
        System.out.println("---ListaDeValores---");
    }

    private void Marca() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en Marca. Introduciendo marca en la pila para saber el numero de variables que hay");
        }
        Nodo nodo = new Nodo();
        nodo.setValor("#");
        PilaNodos.getInstancia().push(nodo);
    }

    private void OperadorSumador() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en operadorSumador");
        }
    }

    private void RestoExpresion() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en restoExpresion");
        }
    }

    private void RestoExpresionSimple() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en restoExpresionSimple");
        }
    }

    private void RestoSentenciaAsignacion() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en restoSentenciaAsignacion");
        }
    }

    private void RestoSentenciaRestoAsignacion() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en restoSentenciRestoaAsignacion");
        }
    }

    private void RestoValores() {
        System.out.println("---RestoValores---");
    }

    private void SentenciaAsignacion() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en sentencia asignacion");
        }
        //Nodo nodo = stack.pop();
       /* if(logger.isDebugEnabled()){
            logger.debug("Asignando el tipo " + nodo.toString());
        }*/

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

    private void ampersand() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en ampersand");         }
    }

    private void bitset() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en bitset");
        }
        // Modificar tabla de símbolos
    }

    private void booleano() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en booleano");
        }
        // Modificar tabla de símbolos
    }

    private void caracter() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en caracter");
        }
        // Modificar tabla de símbolos
    }

    private void cardinal() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en cardinal");
        }
        // Modificar tabla de símbolos
    }

    private void cierravariable() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en cierravariable");         }
    }

    private void distinto() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en distinto");         }
    }

    private void distinto2() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en distinto2");         }
    }

    private void division() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en division");         }
    }

    private void divisionEntera() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en divisionEntera");         }
    }

    private void entero() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en entero");
        }
        // Modificar tabla de símbolos

    }

    private void factor() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en factor");
        }
    }

    private void falso() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en falso");         }
    }

    private void identificador() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en identificador");         }
    }

    private void igual() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en igual");         }
    }

    private void listaIdentificadores() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en listaIdentificadores");         }
    }

    private void listaVariables() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en listaVariables");
        }
        Nodo tipo = PilaNodos.getInstancia().pop();
        //quito la marca
        PilaNodos.getInstancia().pop();
        Nodo var = PilaNodos.getInstancia().pop();
        while(!var.getValor().equals("#")){
            //comprobar que esta en la tabla de simbolos
            //si existe en la tabla rellenarle el tipo
            var = PilaNodos.getInstancia().pop();
        }

    }

    private void longint() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en logint");         }
    }

    private void longreal() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en longreal");         }
    }

    private void mayor() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en mayor");         }
    }

    private void mayorIgual() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en mayorIgual");         }
    }

    private void menor() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en menor");         }
    }

    private void menorIgual() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en menorIgual");         }
    }

    private void mult() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en mult");         }
    }

    private void nil() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en nil");         }
    }

    private void numEntero() {
        if(logger.isDebugEnabled()){
            logger.debug("Introduciendo el tipo Entero");
        }
       /* Nodo nodo = new Nodo();
        nodo.concatRight("INTEGER");
        stack.push(nodo);*/
    }

    private void numReal() {
        if(logger.isDebugEnabled()){
            logger.debug("Introduciendo el tipo Real");
        }
        /*Nodo nodo = new Nodo();
        nodo.concatRight("REAL");
        stack.push(nodo);*/
    }

    private void numero() {
         if(logger.isDebugEnabled()){
            logger.debug("Entrando en numero");
        }

    }

    private void operadorAnd() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en operadorAnd");
        }
    }

    private void operadorComplemento() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en operadorComplemento");
        }
    }

    private void operadorIn() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en operadorIn");
        }
    }

    private void operadorModulo() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en operadorModulo");
        }
    }

    private void operadorNot() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en operadorNot");
        }
    }

    private void operadorOr() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en operadorOr");         }
    }

    private void proc() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en proc");         }
    }

    private void real() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en real");         }
    }

    private void resta() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en resta");         }
    }

    private void subrango() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en subrango");         }
    }

    private void suma() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en suma");         }
    }

    private void termino() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en termino");
        }
    }

    private void tipoPredefinido() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en tipoPredefinido");         }
    }

    private void tipoSimple() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en tipoSimple");         }
    }

    private void tipoSimple2() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en tipoSimple2");         }
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

    private void variable() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en variable");
        }

    }

    private void verdadero() {
        if(logger.isDebugEnabled()){
            logger.debug("Entrando en verdadero");         }
    }
}

