Feature: Direccion

  Background:
    Given El usuario ingresa a solidaria
    When el usuario ingresa el correo y confirma el correo y acepta terminos y condiciones
      | correo  | marck431@gmail.com |
      | correoC | marck431@gmail.com |
    Given el usuario escoge la ciudad "BARRANQUILLA - ATLANTICO"
    When el usuario da clic para seguir la cotizacion
    Given el usuario escoge el tipo cliente
    When el usuario da clic para seguir con la siguiente pantalla
    Given el usuario digita el valor de enseres "10000000"
    When el usuario da clic para seguir con la siguiente pantalla de direccion

Scenario:
Given el usuario digita la direccion
When El usuario da clic para seguir con la siguiente pantalla de la segunda parte de la direccion
Then El usuario deber ver el titulo de la siguiente pantalla inmueble
