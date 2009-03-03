MODULE hexadecimales;
FROM InOut IMPORT WriteString, WriteInt, WriteLn, Write;

VAR  NUMHEXA   :INTEGER;

BEGIN

     WriteString("Numero hexadecimal ");
     NUMHEXA := 1FFH;
     WriteLn;
     WriteInt(NUMHEXA,2);

END hexadecimales.