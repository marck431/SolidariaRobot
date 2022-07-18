package co.com.solidaria.stepdefinitions;

import co.com.solidaria.questions.Direccion;
import co.com.solidaria.questions.Ubicacion;
import co.com.solidaria.tasks.DarclicEnSiguiente;
import co.com.solidaria.tasks.Digitar;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class DigitaValorEnseresStepdefinition {
    @Given("el usuario digita el valor de enseres {string}")
    public void elUsuarioDigitaElValorDeEnseres(String valor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Digitar.losEnseres(valor)
        );
    }

    @When("el usuario da clic para seguir con la siguiente pantalla de direccion")
    public void elUsuarioDaClicParaSeguirConLaSiguientePantallaDeDireccion() {
    OnStage.theActorInTheSpotlight().attemptsTo(
            DarclicEnSiguiente.enElBoton()
    );
    }

    @Then("el usuario deberia ver la pantalla de direccion")
    public void elUsuarioDeberiaVerLaPantallaDeDireccion() {
        OnStage.theActorInTheSpotlight().should(seeThat(Direccion.deVivienda()));
    }
}
