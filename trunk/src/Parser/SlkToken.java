package Parser;



import GestorDeErrores.ErroresLexicos;
import GestorDeErrores.GestorErrores;
import GestorDeErrores.TErrorLexico;
import Scanner.Scanner;
import Scanner.Token;

//***************************************************************************//
/**
 * Clase que controla los tokens generados por la herramienta Slk as� como su
 * integraci�n con los otros componentes de la aplicaci�n.
 * 
 * @author Javier Salcedo G�mez
 */
public class SlkToken {

	// ATRIBUTOS
	Token _token;
	Scanner _analizadorLexico;
	
	//private JTextArea sol; //para la parte gr�fica

//	***************************************************************************//
	/**
	 * Constructor de la clase SlkToken.
	 */
	public SlkToken(Scanner analizadorLexico) {

		_analizadorLexico = analizadorLexico;
		
	}
    public String getLexema(){
        return _token.getAtributo();
    }


//	***************************************************************************//
	/**
	 * 
	 * @param level
	 * @return
	 */
	public short peek(int level) {
		
		return 0;
	}

//	***************************************************************************//
	/**
	 * Devuelve un short que representa el token correspondiente. Para ello 
	 * usando nuestro analizador l�xico obtenemos el token y devolvemos un
	 * short correspondiente a una de las constantes Slk generadas por la 
	 * herramienta.
	 * 
	 * @return El short correspondiente a la transformaci�n del token le�do de
	 * nuestro analizador l�xico anterior.
	 */
	public short get() {
		
		_token = new Token(11, 0);
		
		try {
			
			_token = _analizadorLexico.get_token();
			System.out.println("Token -> " + _token.toString());
			
		} 
		catch (Exception e) {}
		
		switch (_token.getTipoToken()) {
			
			case EOF:
				return SlkConstants.END_OF_SLK_INPUT_;

			case PALABRA_RESERVADA:
				
				if(_token.getAtributo().equals("ARRAY")){
					return SlkConstants.ARRAY_;
				}
				
				else if(_token.getAtributo().equals("BEGIN")){
					return SlkConstants.BEGIN_;
				}
				
				else if(_token.getAtributo().equals("BITSET")){
					return SlkConstants.BITSET_;
				}
				
				else if(_token.getAtributo().equals("BOOLEAN")){
					return SlkConstants.BOOLEAN_;
				}

				else if(_token.getAtributo().equals("BY")){
					return SlkConstants.BY_;
				}

				else if(_token.getAtributo().equals("CARDINAL")){
					return SlkConstants.CARDINAL_;
				}
				
				else if(_token.getAtributo().equals("CASE")){
					return SlkConstants.CASE_;
				}
				
				else if(_token.getAtributo().equals("CHAR")){
					return SlkConstants.CHAR_;
				}

				else if(_token.getAtributo().equals("CONST")){
					return SlkConstants.CONST_;
				}
				
				else if(_token.getAtributo().equals("DEFINITION")){
					return SlkConstants.DEFINITION_;
				}

				else if(_token.getAtributo().equals("DO")){
					return SlkConstants.DO_;
				}

				else if(_token.getAtributo().equals("ELSE")){
					return SlkConstants.ELSE_;
				}
				
				else if(_token.getAtributo().equals("ELSIF")){
					return SlkConstants.ELSIF_;
				}
	
				else if(_token.getAtributo().equals("END")){
					return SlkConstants.END_;
				}
				
				else if(_token.getAtributo().equals("EXIT")){
					return SlkConstants.EXIT_;
				}
				
				else if(_token.getAtributo().equals("EXPORT")){
					return SlkConstants.EXPORT_;
				}
				
				else if(_token.getAtributo().equals("FALSE")){
					return SlkConstants.FALSE_;
				}
				
				else if(_token.getAtributo().equals("FOR")){
					return SlkConstants.FOR_;
				}
				
				else if(_token.getAtributo().equals("FROM")){
					return SlkConstants.FROM_;
				}
				
				else if(_token.getAtributo().equals("IF")){
					return SlkConstants.IF_;
				}
				
				else if(_token.getAtributo().equals("IMPLEMENTATION")){
					return SlkConstants.IMPLEMENTATION_;
				}
				
				else if(_token.getAtributo().equals("IMPORT")){
					return SlkConstants.IMPORT_;
				}

				else if(_token.getAtributo().equals("INTEGER")){
					return SlkConstants.INTEGER_;
				}

				else if(_token.getAtributo().equals("LONGINT")){
					return SlkConstants.LONGINT_;
				}
				
				else if(_token.getAtributo().equals("LONGREAL")){
					return SlkConstants.LONGREAL_;
				}
				
				else if(_token.getAtributo().equals("LOOP")){
					return SlkConstants.LOOP_;
				}
				
				else if(_token.getAtributo().equals("MODULE")){
					return SlkConstants.MODULE_;
				}

				else if(_token.getAtributo().equals("NIL")){
					return SlkConstants.NIL_;
				}
				
				else if(_token.getAtributo().equals("OF")){
					return SlkConstants.OF_;
				}
				
				else if(_token.getAtributo().equals("POINTER")){
					return SlkConstants.POINTER_;
				}
				
				else if(_token.getAtributo().equals("PROC")){
					return SlkConstants.PROC_;
				}
				
				else if(_token.getAtributo().equals("PROCEDURE")){
					return SlkConstants.PROCEDURE_;
				}
				
				else if(_token.getAtributo().equals("QUALIFIED")){
					return SlkConstants.QUALIFIED_;
				}
				
				else if(_token.getAtributo().equals("REAL")){
					return SlkConstants.REAL_;
				}
				
				else if(_token.getAtributo().equals("RECORD")){
					return SlkConstants.RECORD_;
				}
				
				else if(_token.getAtributo().equals("REPEAT")){
					return SlkConstants.REPEAT_;
				}
				
				else if(_token.getAtributo().equals("RETURN")){
					return SlkConstants.RETURN_;
				}
				
				else if(_token.getAtributo().equals("SET")){
					return SlkConstants.SET_;
				}
				
				else if(_token.getAtributo().equals("THEN")){
					return SlkConstants.THEN_;
				}
				
				else if(_token.getAtributo().equals("TO")){
					return SlkConstants.TO_;
				}

				else if(_token.getAtributo().equals("TRUE")){
					return SlkConstants.TRUE_;
				}
				
				else if(_token.getAtributo().equals("TYPE")){
					return SlkConstants.TYPE_;
				}
				
				else if(_token.getAtributo().equals("VAR")){
					return SlkConstants.VAR_;
				}

				else if(_token.getAtributo().equals("UNTIL")){
					return SlkConstants.UNTIL_;
				}
				
				else if(_token.getAtributo().equals("WHILE")){
					return SlkConstants.WHILE_;
				}

				else if(_token.getAtributo().equals("WITH")){
					return SlkConstants.WITH_;
				}
					
			case IDENTIFICADOR: return SlkConstants.IDENTIFICADOR_;
							
			case NUMERO_ENTERO: return SlkConstants.NUMEROENTERO_;
			
			case NUMERO_REAL: return SlkConstants.NUMEROREAL_;
			
			case CARACTER: return SlkConstants.CARACTER_;
				
			case CADENA: return SlkConstants.CADENA_;
				
			case OPERADOR_SUMADOR: 
				
				if(_token.getAtributo().equals("SUMA")){
					return (short)'+';
				}
				else if(_token.getAtributo().equals("RESTA")){
					return (short)'-';
				}
				else if(_token.getAtributo().equals("OR")){
					return SlkConstants.OR_;
				}
				
			case OPERADOR_MULTIPLICADOR: 
				
				if(_token.getAtributo().equals("MULTIPLICACION")){
					return (short)'*';
				}
				else if(_token.getAtributo().equals("DIVISION")){
					return (short)'/';
				}
				else if(_token.getAtributo().equals("DIVISION_ENTERA")){
					return SlkConstants.DIV_;
				}
				else if(_token.getAtributo().equals("MOD")){
					return SlkConstants.MOD_;
				}
				else if(_token.getAtributo().equals("MOD")){
					return SlkConstants.MOD_;
				}
				else if(_token.getAtributo().equals("AND")){
						return SlkConstants.AND_;
				}
							
			case PUNTUACION: 
		
				if(_token.getAtributo().equals("PUNTO")){
					return (short)'.';
				}
				
				else if(_token.getAtributo().equals("COMA")){
					return (short)',';
				}
				
				else if(_token.getAtributo().equals("PUNTO_Y_COMA")){
					return (short)';';
				}
				
				else if(_token.getAtributo().equals("DOS_PUNTOS")){
					return (short)':';
				}
				
				else if(_token.getAtributo().equals("PARENTESIS_IZQUIERDO")){
					return (short)'(';
				}
				
				else if(_token.getAtributo().equals("PARENTESIS_DERECHO")){
					return (short)')';
				}
				
				else if(_token.getAtributo().equals("CORCHETE_IZQUIERDO")){
					return (short)'[';
				}
				
				else if(_token.getAtributo().equals("CORCHETE_DERECHO")){
					return (short)']';
				}
				
				else if(_token.getAtributo().equals("PUNTERO")){
						return (short)'^';
				}
				
				else if(_token.getAtributo().equals("BARRA_VERTICAL")){
					return (short)'|';
				}
				else if(_token.getAtributo().equals("PUNTO_PUNTO")){
					return SlkConstants.DOT_DOT_;
				}
				
			case OPERADOR_COMPARADOR: 
				
				if(_token.getAtributo().equals("MAYOR")){
					return (short)'>';
				}
				else if(_token.getAtributo().equals("MENOR")){
					return (short)'<';
				}
				else if(_token.getAtributo().equals("MENOR_IGUAL")){
					return SlkConstants.LESS_EQUAL_;
				}
				else if(_token.getAtributo().equals("MAYOR_IGUAL")){
					return SlkConstants.GREATER_EQUAL_;
				}
				else if(_token.getAtributo().equals("IGUAL")){
					return (short)'=';
				}
				else if(_token.getAtributo().equals("DISTINTO")){
					return SlkConstants.LESS_GREATER_;
				}
				else if(_token.getAtributo().equals("ALMOHADILLA")){
					return (short)'#';
				}
				else if(_token.getAtributo().equals("IN")){
					return SlkConstants.IN_;
				}
				
			case OPERADOR_UNITARIO:
				
				if(_token.getAtributo().equals("NOT")){
					return SlkConstants.NOT_;
				}
				else if(_token.getAtributo().equals("NEGACION")){
					return (short) '~';
				}
			case OPERADOR_ASIGNACION: return SlkConstants.COLON_EQUAL_;
				
			case FUNCION_PREDEFINIDA: 
				
				if (_token.getAtributo().equals("ABS")) 
					return SlkConstants.ABS_;
				
				else if (_token.getAtributo().equals("CAP")) 
					return SlkConstants.CAP_;
				
				else if (_token.getAtributo().equals("CHR")) 
					return SlkConstants.CHR_;
				
				else if (_token.getAtributo().equals("FLOAT")) 
					return SlkConstants.FLOAT_;
								
				else if (_token.getAtributo().equals("HIGH")) 
					return SlkConstants.HIGH_;
				
				else if (_token.getAtributo().equals("MAX")) 
					return SlkConstants.MAX_;
				
				else if (_token.getAtributo().equals("MIN")) 
					return SlkConstants.MIN_;
				
				else if (_token.getAtributo().equals("ODD")) 
					return SlkConstants.ODD_;
				
				else if (_token.getAtributo().equals("ORD")) 
					return SlkConstants.ORD_;
		
				else if (_token.getAtributo().equals("SIZE")) 
					return SlkConstants.SIZE_;
				
				else if (_token.getAtributo().equals("TRUNC")) 
					return SlkConstants.TRUNC_;
				
				else if (_token.getAtributo().equals("VAL")) 
					return SlkConstants.VAL_;
				
			case PROCEDIMIENTO_PREDEFINIDO:
				
				if (_token.getAtributo().equals("DEC")) 
					return SlkConstants.DEC_;
				
				else if (_token.getAtributo().equals("HALT")) 
					return SlkConstants.HALT_;
				
				else if (_token.getAtributo().equals("INC")) 
					return SlkConstants.INC_;
				
				else if (_token.getAtributo().equals("INCL")) 
					return SlkConstants.INCL_;
				
				else if (_token.getAtributo().equals("EXCL")) 
					return SlkConstants.EXCL_;
								
				else if (_token.getAtributo().equals("ALLOCATE")) 
					return SlkConstants.ALLOCATE_;
				
				else if (_token.getAtributo().equals("DEALLOCATE")) 
					return SlkConstants.DEALLOCATE_;
				
				else if (_token.getAtributo().equals("NEW")) 
					return SlkConstants.NEW_;
				
				else if (_token.getAtributo().equals("DISPOSE")) 
					return SlkConstants.DISPOSE_;
				
				else if (_token.getAtributo().equals("WriteLn")) 
					return SlkConstants.WRITELN_;
				
				else if (_token.getAtributo().equals("WriteInt")) 
					return SlkConstants.WRITEINT_;
				
				else if (_token.getAtributo().equals("WriteCard")) 
					return SlkConstants.WRITECARD_;
		
				else if (_token.getAtributo().equals("WriteChar")) 
					return SlkConstants.WRITECHAR_;
				
				else if (_token.getAtributo().equals("WriteReal")) 
					return SlkConstants.WRITEREAL_;
				
				else if (_token.getAtributo().equals("WriteString")) 
					return SlkConstants.WRITESTRING_;
				
				else if (_token.getAtributo().equals("ReadChar")) 
					return SlkConstants.READCHAR_;
				
				else if (_token.getAtributo().equals("ReadString")) 
					return SlkConstants.READSTRING_;
				
				else if (_token.getAtributo().equals("ReadReal")) 
					return SlkConstants.READREAL_;
				
				else if (_token.getAtributo().equals("ReadInt")) 
					return SlkConstants.READINT_;
				
				else if (_token.getAtributo().equals("ReadCard")) 
					return SlkConstants.READCARD_;
		}
		
		return SlkConstants.END_OF_SLK_INPUT_;
	}

//	***************************************************************************//
	/**
	 * Transforma un ascii en car�cter.
	 * 
	 * @param lexema Ascii a transformar.
	 * 
	 * @return El car�cter correspondiente al ascii.
	 */
	public Character asciiToChar(String lexema) {
		
		// Nos quedamos con el c�digo
		String cad = lexema.substring(1);
		
		// Lo convertimos a entero
		Integer num = Integer.parseInt(cad); 
		
		// Si es un c�digo incorrecto
		if ((num > 127) || (num < 0)) { 
			
			// A�adimos el error correspondiente
 			GestorErrores.getInstancia().insertaErrorLexico(new TErrorLexico(ErroresLexicos.ERROR_LEXICO_CARACTER_NO_VALIDO_EN_ESTE_CONTEXTO, "", _token._linea, _token._columna)); 
			return null; // generamos token error
		} 
		else{ 
			
			// Si es correcto
			
			// Lo transformamos a string
			String Cha = new Character((char) (Integer.parseInt(cad))).toString(); 			char ch = Cha.charAt(0);
			return (new Character(ch)); // devolvemos el token caracter
		}
	}
}
