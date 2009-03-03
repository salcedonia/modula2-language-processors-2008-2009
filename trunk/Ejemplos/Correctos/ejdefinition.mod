DEFINITION MODULE ejdefinition;
  PROCEDURE saludo();
END ejdefinition.

IMPLEMENTATION MODULE ejdefinition;
FROM InOut IMPORT WriteString;
   PROCEDURE saludo()
   BEGIN
    WriteString ("hola");
   END saludo;
END ejdefinition.