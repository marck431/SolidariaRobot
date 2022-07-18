Feature: Escoger ciudad para poder seguir cotización

  Background:
    Given El usuario ingresa a solidaria
    When el usuario ingresa el correo y confirma el correo y acepta terminos y condiciones
      | correo  | marck431@gmail.com |
      | correoC | marck431@gmail.com  |

Scenario: Escoger ciudad
  Given el usuario escoge la ciudad "BARRANQUILLA - ATLANTICO"
  When el usuario da clic para seguir la cotizacion
  Then el debera poder pasar a la pantalla de propietario



