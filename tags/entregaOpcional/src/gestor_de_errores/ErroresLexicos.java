package gestor_de_errores;

/**
 * Enumerado que define todos los posibles errores producidos por el 
 * analizador lexico.
 * 
 * @author Grupo1, Javier Salcedo Gómez
 */
public enum ErroresLexicos {
	
	ERROR_LEXICO_CARACTER_NO_VALIDO_EN_ESTE_CONTEXTO,
	ERROR_LEXICO_COMENTARIO_MAL_FORMADO,
	ERROR_LEXICO_CADENA_O_CARACTER_MAL_FORMADO,
	ERROR_LEXICO_CARACTER_NO_VALIDO_EN_IDENTIFICADOR,
	ERROR_LEXICO_FORMATO_DE_IDENTIFICADOR_NO_VALIDO,
	ERROR_LEXICO_NUMERO_REAL_MAL_FORMADO,
	ERROR_LEXICO_NUMERO_HEXADECIMAL_MAL_FORMADO,
	ERROR_LEXICO_NUMERO_OCTAL_MAL_FORMADO,
	ERROR_LEXICO_CARACTER_EN_OCTAL_MAL_FORMADO
}