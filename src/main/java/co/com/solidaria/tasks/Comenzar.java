package co.com.solidaria.tasks;

import co.com.solidaria.userinterfaces.HomePage;
import co.com.solidaria.userinterfaces.ViviendaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.JavaScript;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.util.Map;

public class Comenzar implements Task {


    private Map<String, String> correo;

    public Comenzar(Map<String, String> correo) {
        this.correo = correo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.angularRequestsHaveFinished(),
                Scroll.to(HomePage.BTN_EMPECEMOS),
                Enter.theValue(correo.get("correo")).into(HomePage.INPUT_CORREO),
                Enter.theValue(correo.get("correoC")).into(HomePage.INPUT_CORREO_CONFIRMAR),
                JavaScriptClick.on(HomePage.CHECKBOX),
               JavaScriptClick.on(HomePage.BTN_EMPECEMOS)
        );
    }

    public static Comenzar laCotizacion(Map<String, String> correo) {
        return instrumented(Comenzar.class, correo);
    }
}
