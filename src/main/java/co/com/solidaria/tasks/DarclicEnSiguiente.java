package co.com.solidaria.tasks;

import co.com.solidaria.userinterfaces.ViviendaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class DarclicEnSiguiente implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(ViviendaPage.BTN_SIGUIENTE)
        );
    }
    public static DarclicEnSiguiente enElBoton() {
        return Tasks.instrumented(DarclicEnSiguiente.class);

    }
}
