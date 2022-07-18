Feature: Escoger un tipo de cliente

  Background:
    Given El usuario ingresa a solidaria
    When el usuario ingresa el correo y confirma el correo y acepta terminos y condiciones
      | correo  | marck431@gmail.com |
      | correoC | marck431@gmail.com |
    Given el usuario escoge la ciudad "BARRANQUILLA - ATLANTICO"
    When el usuario da clic para seguir la cotizacion

  Scenario: Escoger tipo cliente
    Given el usuario escoge el tipo cliente
    When el usuario da clic para seguir con la siguiente pantalla
    Then el usuario deberia ver la pantalla de valor de enseres

