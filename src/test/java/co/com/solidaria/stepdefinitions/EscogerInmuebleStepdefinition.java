package co.com.solidaria.stepdefinitions;


import co.com.solidaria.questions.DireccionCompleta;
import co.com.solidaria.tasks.DarclicEnSiguiente;
import co.com.solidaria.tasks.EscogerInmueble;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class EscogerInmuebleStepdefinition {
    @Given("el usuario escoge el inmueble")
    public void elUsuarioEscogeElInmueble() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EscogerInmueble.paraAsegurar()
        );
    }

    @When("el usuario da clic en el siguiente")
    public void elUsuarioDaClicEnElSiguiente() {
       OnStage.theActorInTheSpotlight().attemptsTo(
               DarclicEnSiguiente.enElBoton()
       );
    }

    @Then("el usuario debera ver la direccion completa")
    public void elUsuarioDeberaVerLaDireccionCompleta() {
        OnStage.theActorInTheSpotlight().should(seeThat(DireccionCompleta.deLaVivienda()));

    }



}
