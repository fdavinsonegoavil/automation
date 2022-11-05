# language: es

@Cucumber
Característica: Busqueda en dogpile
  este feature se trata de hacer una o multiples busquedas en dogpile y revisar los resultados obtenidos
  de esas busquedas.

  Escenario: Buscar resultados relevantes
    Dado Que el usuario entra en dogpile
    Cuando El usuario realiza una busqueda de: rock argentino
    Entonces El usuario deberia poder ver resultados que contengan la palabra: rock

  Esquema del escenario: : Verificar que los resultados con texto relevante al titulo
    Dado Que el usuario entra en dogpile
    Cuando El usuario realiza una busqueda de: argentine rock
    Entonces El usuario deberia ver un texto: <texto> relevante con el titulo: <titulo>

    Ejemplos:
      |Descripcion  | titulo                          | texto                           |
      | wikipedia   | Argentine rock - Wikipedia      | known locally as rock nacional  |
      | forest      | Argentine Rock - FOREST LOOKOUTS| has recently been transformed   |
      | artistas    | Top argentine rock artists      | rock group from Buenos Aires    |