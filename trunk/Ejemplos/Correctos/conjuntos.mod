MODULE conjuntos;

FROM InOut IMPORT WriteLn, WriteString, WriteInt;

TYPE colores = (rojo,verde,amarillo);
conjunto = SET OF colores;

VAR 

    IntSum, IntDif, IntMul, IntDiv, IntRem : INTEGER;
    DATO                                   : BITSET;
    TIEMPO                                 : CARDINAL;
    A, B, I, J                             : INTEGER;
    IsIt, WillIt,MAYOR,MENOR               : BOOLEAN;
    OCT, HEXA                              : INTEGER;
    VECTOR                                 : ARRAY[1..8] OF REAL;
    NUMREAL                                : REAL;
    tmp                                    : LISTA;
    cadena                                 : CHAR;
    enterolargo                            :LONGINT;
    realargo                               :LONGREAL;
    conj                                   :conjunto;

BEGIN

    IF rojo IN conj THEN
        WriteString("contenido");
    END;

END conjuntos.