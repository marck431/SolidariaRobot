package co.com.solidaria.stepdefinitions;

import co.com.solidaria.tasks.DarclicEnSiguiente;
import co.com.solidaria.questions.TipoCliente;
import co.com.solidaria.tasks.Escoger;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class EscogerCiudadStepDefinition {

    @Given("el usuario escoge la ciudad {string}")
    public void elUsuarioEscogeLaCiudad(String ciudad) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Escoger.laCiudad(ciudad)
        );
    }

    @When("el usuario da clic para seguir la cotizacion")
    public void elUsuarioDaClicParaSeguirLaCotizacion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DarclicEnSiguiente.enElBoton()
        );
    }

    @Then("el debera poder pasar a la pantalla de propietario")
    public void elDeberaPoderPasarALaPantallaDePropietario() {
    OnStage.theActorInTheSpotlight().should(seeThat(TipoCliente.deCotizacion()));
    }
}
