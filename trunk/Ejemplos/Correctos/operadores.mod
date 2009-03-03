MODULE operadores;

FROM InOut IMPORT WriteLn, WriteString, WriteInt;

VAR IntSum, IntDif, IntMul, IntDiv, IntRem : INTEGER;
    A, B	                           : INTEGER;
   
BEGIN

    B:=MIN(INTEGER);
    A:=MAX(INTEGER);
    B:=3;
    A:=2;
    IntSum := A + B;
    IntDif := A - B;
    IntMul := A * B;
    IntDiv := B DIV A;
    IntRem := B MOD A;
    
    WHILE (A<B) OR (A<8) DO
       B:=B+1;
       HALT;
    END;

    REPEAT
       B := B+1;
    UNTIL (B>2);
   
    CASE B OF
       3: WriteString(" vale 3");|
       4: WriteString(" vale 4");
       ELSE WriteString(" vale otra cosa ");
            LOOP
 
               IF A>3 THEN
                  RETURN;
               EXIT;
            END;
    
            RETURN;
       END;
    END;

END operadores.