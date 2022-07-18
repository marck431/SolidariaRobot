package co.com.solidaria.tasks;

import co.com.solidaria.userinterfaces.InmueblePage;
import co.com.solidaria.userinterfaces.ViviendaPage;
import co.com.solidaria.utils.ConstantesInmueble;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class EscogerInmueble implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
   actor.attemptsTo(
           WaitUntil.angularRequestsHaveFinished(),
           Click.on(ViviendaPage.SELECT_CIUDAD),
           WaitUntil.angularRequestsHaveFinished(),
           Enter.theValue(ConstantesInmueble.TIPO_INMUEBLE).into(InmueblePage.INPUT_BUSCAR_INMUEBLE).thenHit(Keys.ENTER)
   );


    }
    public static EscogerInmueble paraAsegurar(){
        return Tasks.instrumented(EscogerInmueble.class);
    }
}
