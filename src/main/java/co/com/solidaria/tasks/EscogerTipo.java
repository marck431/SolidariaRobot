package co.com.solidaria.tasks;

import co.com.solidaria.userinterfaces.TipoClientePage;
import co.com.solidaria.userinterfaces.ViviendaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EscogerTipo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {



            actor.attemptsTo(
                    WaitUntil.angularRequestsHaveFinished(),

                    JavaScriptClick.on(TipoClientePage.CHECKBOX),
                    JavaScriptClick.on(ViviendaPage.BTN_SIGUIENTE)

            );

    }
    public static EscogerTipo  deCliente(){
        return Tasks.instrumented(EscogerTipo.class);
    }
}
