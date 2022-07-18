package co.com.solidaria.stepdefinitions;

import co.com.solidaria.questions.TipodeInmueble;
import co.com.solidaria.questions.Ubicacion;
import co.com.solidaria.tasks.Comenzar;
import co.com.solidaria.tasks.DarclicEnSiguiente;
import co.com.solidaria.tasks.DigitarDir;
import co.com.solidaria.tasks.DigitarDirDos;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class DigitaDireccionStepdefinition {
    @Given("el usuario digita la direccion")
    public void elUsuarioDigitaLaDireccion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DigitarDir.deVivienda(),
                DarclicEnSiguiente.enElBoton()
        );
    }

    @When("El usuario da clic para seguir con la siguiente pantalla de la segunda parte de la direccion")
    public void elusuarioDaClicParaSeguirConLaSiguientePantallaDeLaSegundaParteDeLaDireccion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DigitarDirDos.losCamposFaltantes(),
                DarclicEnSiguiente.enElBoton()
        );
    }

    @Then("El usuario deber ver el titulo de la siguiente pantalla inmueble")
    public void elUsuarioDeberVerElTituloDeLaSiguienteParteDeLaDireccion() {
        OnStage.theActorInTheSpotlight().should(seeThat( TipodeInmueble.paraCotizar()));


    }

}
