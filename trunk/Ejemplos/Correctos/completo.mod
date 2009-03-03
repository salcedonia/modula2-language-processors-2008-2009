MODULE completo;

FROM InOut IMPORT WriteLn, WriteString, WriteInt;
FROM Storage IMPORT ALLOCATE, DEALLOCATE;

(* EXPORT QUALIFIED MIPROC;*)
(* el programa examina tipos de datos enteros, booleanos, reales, hexa y octa*)
(* hay algunas palabras clave como module procedure begin end..etc *)
(* palabra clave PROCEDURE *)

TYPE LISTA = POINTER TO NODO;
     NODO = RECORD
            info: INTEGER;
            siguiente: LISTA;
            END;

PROCEDURE MIPROC();
BEGIN
    WriteString(" Estamos en el procedimiento" );
END MIPROC;
TYPE colores = (rojo,verde,amarillo);
conjunto = SET OF colores;
CONST PI=3.1415;

VAR IntSum, IntDif, IntMul, IntDiv, IntRem : INTEGER;
    DATO                                   : BITSET;
    TIEMPO                                 : CARDINAL;
    A, B, I, J                             : INTEGER;
    IsIt, WillIt,MAYOR,MENOR               : BOOLEAN;
    OCT, HEXA                              : INTEGER;
    VECTOR                                 : ARRAY[1..8] OF REAL;
    NUMREAL                                : REAL;
    tmp                                    : LISTA;
    cadena                                 : CHAR;
    enterolargo                            : LONGINT;
    realargo  :LONGREAL;
    conj                                   :conjunto;
    BEGIN

    B:=MAX(INTEGER);
    A:=MIN(INTEGER);
    IF rojo IN conj THEN
      WriteString("contenido");
    END;
   ALLOCATE(tmp,SIZE(NODO));
   NEW(tmp);
   tmp^.info := 3;
   tmp^.siguiente := tmp;
   WITH tmp^ DO
      info := 3;
   END;
   tmp:=NIL;
   cadena := "H";
   cadena := 'z';
   WriteString(cadena);
   MIPROC;
   NUMREAL := 2.2E+3;
   A := 9;
   B := A + 4;
   DEC(A,2);
   INC(B,2);
   MAYOR := ODD(2);
   cadena := CAP("x");
   A := ORD("A");
   cadena := CHR(65);
   B := ABS(-12);
   NUMREAL := FLOAT(7);
   MAYOR := TRUE;
   MENOR := FALSE;
   IF MAYOR AND MENOR THEN
      WriteString("Estamos en el and ");
      WriteLn;
   ELSIF MENOR OR MAYOR THEN
      WriteString ("Estamos en el or ");
      WriteLn;
   END;
   WHILE (A<B) OR (A<8) DO
     B:=B+1;
   END;
   FOR J:=1 TO 9 DO
      A:=A+2;
   END;
   IntSum := A + B;
   IntDif := A - B;
   IntMul := A * B;
   IntDiv := B DIV A;
   IntRem := B MOD A;
   A := (A + B) DIV (3*B + 7);  (* Composite math statement  *)
   IsIt := A = 22;     (* TRUE    - equal to                    *)
   IsIt := A = 23;     (* FALSE   - equal to                    *)
   WillIt := A > B;    (* TRUE    - greater than                *)
   WillIt := A < B;    (* FALSE   - less than                   *)

   IsIt := B <= 12;    (* TRUE    - less than or equal          *)
   IsIt := B >= 4;     (* TRUE    - greater than or equal       *)
   IsIt := A # B;      (* FALSE   - not equal                   *)
   IsIt := A <> B;     (* TRUE    - not equal                   *)
   WriteString("Los valores son: ");
   WriteInt(IntSum,6);
   WriteInt(IntDif,6);
   WriteInt(IntMul,6);
   WriteInt(IntDiv,6);
   WriteInt(IntRem,6);
   WriteLn;
   WriteString("El valor es ");
   WriteInt(A,5);
   (* Las siguientes instrucciones son para los hexadecimales y octales *)
   OCT := 452B;
   HEXA:= 16H;
   WriteInt(OCT,2);
   WriteLn;
   WriteInt(HEXA,3);
   INC(A);
   DEC(A);
   INC(A,3);
   DEC(A,7);
   INC(A,B*2+4);
   (* para el array vector *)
   VECTOR[1] := 3.2;
   A := MIN(INTEGER);
   B := MAX(INTEGER);
   A := A DIV 2;
   LOOP
     IF A>3 THEN
      RETURN;
      EXIT;
     END;
     RETURN;
   END;
   B := 1;
   REPEAT
     B := B+1;
   UNTIL (B>2);
   B := 1;
   CASE B OF
       3: WriteString(" vale 3");|
       4: WriteString(" vale 4");
       ELSE WriteString(" vale otra cosa ");
   END;
   HALT;
   RETURN;
END completo.
