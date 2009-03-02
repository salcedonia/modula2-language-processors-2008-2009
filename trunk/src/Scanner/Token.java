package Scanner;

//***************************************************************************//

import TablaDeSimbolos.arbol.Simbolo;

/**
 * Representa un Token léxico.
 * Almacena su tipo, linea, columna y sus atributos.
 * 
 * @author Grupo1.
 */
public class Token {
	
	// ATRIBUTOS
	public int _tipo;
	public int _linea;
	public int _columna;
        
    /**
     * el simbolo asociado a este token
     */
    private Object _atr;
    
    private String _lexema;
    
//	***************************************************************************//
    /**
     * Constructor de la clase Token.
     * 
     * @param tipo El tipo del token.
     * @param linea La línea asociada al token.
     * @param columna La columna asociada al token.
     * @param atributos Los atributos del token.
     */
    public Token(int tipo, int linea, int columna, Simbolo sim) {

        _tipo = tipo;
        _linea = linea;
        _columna = columna;
        _atr = (Object)sim;

        _lexema = sim.lexema();
    }
    //	***************************************************************************//
    /**
     * Constructor de la clase Token.
     * 
     * @param tipo El tipo del token.
     * @param linea La línea asociada al token.
     * @param columna La columna asociada al token.
     * @param atributos Los atributos del token.
     */
    public Token(int tipo, int linea, int columna, String lexema) {

        _tipo = tipo;
        _linea = linea;
        _columna = columna;
        _lexema = lexema;
    }
//	***************************************************************************//
    /**
     * Constructor de la clase Token.
     * 
     * @param _tipo Tipo del token.
     * @param atributos Atributos del token.
     */
    public Token(int tipo) {

        _tipo = tipo;
    }

    Token(TipoToken tipo, int yyline, int yycolumn, Object atr) {
       
    }

//	***************************************************************************//
    /**
     * Devuelve el campo _atributos del token transformado a String. Por defecto
     * al transformarlo a String nos devuelve [ATRIBUTO] por lo que quitamos 
     * los dos corchetes para devolver solamente ATRIBUTO. 
     * 
     * @return El campo _atributos del token transformado a String.
     */
    public String getAtributo() {

        String atribAux = _lexema;
        atribAux = atribAux.toString().replace("[", " ");
        atribAux = atribAux.toString().replace("]", " ");
        atribAux = atribAux.trim();

        return atribAux;
    }
//	***************************************************************************//
    /**
     * Devuelve el TipoToken correspondiente al entero que representa el _tipo.
     * 
     * @return El TipoToken correspondiente al entero que representa el _tipo.
     */
    public TipoToken getTipoToken() {

        switch (_tipo) {

            case 0:
                return TipoToken.EOF;
            case 1:
                return TipoToken.PALABRA_RESERVADA;
            case 2:
                return TipoToken.IDENTIFICADOR;
            case 3:
                return TipoToken.NUMERO_ENTERO;
            case 4:
                return TipoToken.NUMERO_REAL;
            case 5:
                return TipoToken.CARACTER;
            case 6:
                return TipoToken.CADENA;
            case 7:
                return TipoToken.OPERADOR_SUMADOR;
            case 8:
                return TipoToken.OPERADOR_MULTIPLICADOR;
            case 9:
                return TipoToken.OPERADOR_UNITARIO;
            case 10:
                return TipoToken.PUNTUACION;
            case 11:
                return TipoToken.OPERADOR_COMPARADOR;
            case 12:
                return TipoToken.OPERADOR_ASIGNACION;
            case 13:
                return TipoToken.FUNCION_PREDEFINIDA;
            case 14:
                return TipoToken.PROCEDIMIENTO_PREDEFINIDO;
        }

        return null;
    }
//	***************************************************************************//
    /**
     * Muestra la información de un token como un String.
     * 
     * @return El String correspondiente que representa la información del token.
     */
    public String toString() {

        String string = new String();
        string += "( " + TipoToken.values()[_tipo];
        if (getAtributo().matches("")) {
            string += ", NULL )";
        } else {
            string += ", " + getAtributo() + " )";
        }
        string += " -> Línea: " + _linea;
        string += ", Columna: " + _columna;
        return string;
    }
}