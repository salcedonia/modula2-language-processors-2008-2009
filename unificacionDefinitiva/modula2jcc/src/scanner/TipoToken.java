package scanner;

/**
 * Enumerado que define todos los tokens aceptados por nuestro compilador del
 * lenguaje de Modula-2.
 * 
 * @author Grupo1, Javier Salcedo Gomez.
 */
public enum TipoToken {

    EOF,
    PALABRA_RESERVADA,
    IDENTIFICADOR,
    NUMERO_ENTERO,
    NUMERO_REAL,
    CARACTER,
    CADENA,
    OPERADOR_SUMADOR,
    OPERADOR_MULTIPLICADOR,
    OPERADOR_UNITARIO,
    PUNTUACION,
    OPERADOR_COMPARADOR,
    OPERADOR_ASIGNACION,
    TIPO_SIMPLE,
    CONSTANTE_PREDEFINIDA,
    FUNCION_PREDEFINIDA,
    PROCEDIMIENTO_PREDEFINIDO
}