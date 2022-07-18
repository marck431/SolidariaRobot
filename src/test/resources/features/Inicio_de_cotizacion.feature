Feature: Iniciar cotización en solidaria

  Scenario: Iniciar cotización ingresando el correo
  Given El usuario ingresa a solidaria
    When el usuario ingresa el correo y confirma el correo y acepta terminos y condiciones
      | correo  | marck431@gmail.com |
      | correoC | marck431@gmail.com  |
    Then el deberia poder pasar a la primera pantalla de la cotizacion

