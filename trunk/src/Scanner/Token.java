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
	public TipoToken _tipo;
	public int _linea;
	public int _columna;
        
    /**
     * el simbolo asociado a este token
     */
    private Object _atr;
    
    private String _lexema;

    /**
     * 
     * 
     *@param linea
     *@param columna
     **/ 
    public Token(int linea , int columna) {
       _linea = linea;
       _columna = columna;
    }
    
    public Token(TipoToken tipo, int linea , int columna) {
       _linea = linea;
       _columna = columna;
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
    public Token(TipoToken tipo, int linea, int columna, Simbolo sim) {

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
    public Token(TipoToken tipo, int linea, int columna, Object valor) {

        _tipo = tipo;
        _linea = linea;
        _columna = columna;
       // _lexema = lexema;
        _atr = valor;
    }
//	***************************************************************************//
    /**
     * Constructor de la clase Token.
     * 
     * @param _tipo Tipo del token.
     * @param atributos Atributos del token.
     */
    public Token(TipoToken tipo) {
        _tipo = tipo;
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

        return _tipo;
    }
//	***************************************************************************//
    /**
     * Muestra la información de un token como un String.
     * 
     * @return El String correspondiente que representa la información del token.
     */
    public String toString() {

        String string = new String();
        string += "( " + _tipo.name();
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