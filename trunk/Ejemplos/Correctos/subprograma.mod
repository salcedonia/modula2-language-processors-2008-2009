MODULE subprograma;

FROM InOut IMPORT WriteString, WriteInt, WriteLn;

TYPE  ArrayDef   = ARRAY[12..25] OF INTEGER;
      CharDef    = ARRAY[0..27] OF CHAR;
      RealArray  = ARRAY[-17..42] OF REAL;
      DogFood    = ARRAY[1..6] OF BOOLEAN;
      Airplane   = ARRAY[1..12] OF DogFood;
      Boat       = ARRAY[1..12],[1..6] OF BOOLEAN;

VAR   Index,Counter : CARDINAL;
      Stuff         : ArrayDef;
      Stuff2        : ArrayDef;
      Stuff3        : ARRAY[12..25] OF INTEGER;
      Puppies       : Airplane;
      Kitties       : Boat;
      i,valor       : INTEGER;

PROCEDURE QuadOfSum(Number1, Number2 : INTEGER) : INTEGER;
BEGIN

   RETURN(4*(Number1 + Number2));

END QuadOfSum;

BEGIN
   
   valor:= Quadofsum(3,2);
   valor:= valor + 3;
   i:=12;
   FOR Index := 1 TO 12 DO
      FOR Counter := 1 TO 6 DO
         Puppies[Index,Counter] := TRUE;
         Kitties[Index,Counter] := NOT Puppies[Index,Counter];
         WriteString("El valor es ");
         WriteInt(i,5);
         i:=i+1;
         WriteLn;
      END;
   END;

   FOR Index := 12 TO 25 DO
      Stuff[Index] := Index*4 + 13;
   END;

   Stuff2 := Stuff;   

END subprograma.