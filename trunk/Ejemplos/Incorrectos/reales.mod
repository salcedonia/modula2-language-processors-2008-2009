MODULE reales;
VAR

   NUMREAL	: REAL;

BEGIN
   
   NUMREAL := .23; (*CORRECTO LEXICAMENTE*)
   NUMREAL := 2.2E+3ds; (*ERROR*)
   NUMREAL := 12.2E; (*ERROR*)
   NUMREAL := 12.a; (*ERROR*)

END reales.