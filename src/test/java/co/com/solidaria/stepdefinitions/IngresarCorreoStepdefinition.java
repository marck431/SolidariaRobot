package co.com.solidaria.stepdefinitions;

import co.com.solidaria.interactions.Abrir;
import co.com.solidaria.questions.Ubicacion;
import co.com.solidaria.tasks.Comenzar;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.Map;

public class IngresarCorreoStepdefinition {

    @Given("El usuario ingresa a solidaria")
    public void elUsuarioIngresaElCorreoC() {
        OnStage.theActorCalled("Marcos").wasAbleTo(
                Abrir.elNavegador()
        );
    }

    @When("el usuario ingresa el correo y confirma el correo y acepta terminos y condiciones")
    public void elUsuarioCorreoConfirmaAcepta(Map<String,String>correo) {
        System.out.println("datos-->"+correo);
    OnStage.theActorInTheSpotlight().attemptsTo(
            Comenzar.laCotizacion(correo)
    );

    }

    @Then("el deberia poder pasar a la primera pantalla de la cotizacion")
    public void elDeberiaPoderPasarALaPrimeraPantallaDeLaCotizacion() {
        OnStage.theActorInTheSpotlight().should(seeThat(Ubicacion.deVivienda()));

    }

}
