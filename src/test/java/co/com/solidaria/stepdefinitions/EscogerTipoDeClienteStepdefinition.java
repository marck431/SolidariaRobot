package co.com.solidaria.stepdefinitions;

import co.com.solidaria.questions.Enseres;
import co.com.solidaria.questions.TipoCliente;
import co.com.solidaria.tasks.DarclicEnSiguiente;
import co.com.solidaria.tasks.EscogerTipo;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class EscogerTipoDeClienteStepdefinition {
    @Given("el usuario escoge el tipo cliente")
    public void el_usuario_escoge_el_tipo_cliente() {
        OnStage.theActorInTheSpotlight().attemptsTo(

        EscogerTipo.deCliente()
        );


    }

    @When("el usuario da clic para seguir con la siguiente pantalla")
    public void el_usuario_da_clic_para_seguir_con_la_siguiente_pantalla() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DarclicEnSiguiente.enElBoton()
        );


    }

    @Then("el usuario deberia ver la pantalla de valor de enseres")
    public void el_usuario_deberia_ver_la_pantalla_de_valor_de_enseres() {
        OnStage.theActorInTheSpotlight().should(seeThat(Enseres.deVivienda()));
    }
}
