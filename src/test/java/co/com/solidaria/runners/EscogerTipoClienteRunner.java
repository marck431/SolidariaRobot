package co.com.solidaria.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/escogerTipoDeCliente.feature",
        glue = "co.com.solidaria.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class EscogerTipoClienteRunner {

}
