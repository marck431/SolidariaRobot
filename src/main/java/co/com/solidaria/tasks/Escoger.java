package co.com.solidaria.tasks;

import co.com.solidaria.userinterfaces.ViviendaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Escoger implements Task {
    String ciudad;

    public Escoger(String ciudad) {
        this.ciudad = ciudad;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            WaitUntil.angularRequestsHaveFinished(),
            Click.on(ViviendaPage.SELECT_CIUDAD),
            WaitUntil.angularRequestsHaveFinished(),
            Enter.theValue(ciudad).into(ViviendaPage.INPUT_BUSCAR_CIUDAD).thenHit(Keys.ENTER)

    );

    }

    public static Escoger laCiudad(String ciudad) {
        return Tasks.instrumented(Escoger.class, ciudad);

    }


}
