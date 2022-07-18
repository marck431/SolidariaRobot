package co.com.solidaria.tasks;

import co.com.solidaria.userinterfaces.DireccionPage;
import co.com.solidaria.utils.ConstantesDireccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class DigitarDir  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.angularRequestsHaveFinished(),
                Click.on(DireccionPage.SELECT_DIR),
                Enter.theValue(ConstantesDireccion.EMPIENZA_DIRECCION).into(DireccionPage.INPUT_BUSCAR_DIR).thenHit(Keys.ENTER),
                Enter.theValue(ConstantesDireccion.NUMERO_DIRECCION).into(DireccionPage.INPUT_PRIMER)
        );
    }
    public static DigitarDir deVivienda(){
        return Tasks.instrumented(DigitarDir.class);
    }
}
