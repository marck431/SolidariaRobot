package co.com.solidaria.tasks;

import co.com.solidaria.userinterfaces.DireccionPage;
import co.com.solidaria.userinterfaces.ViviendaPage;
import co.com.solidaria.utils.ConstantesDireccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class DigitarDirDos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.angularRequestsHaveFinished(),
                Enter.theValue(ConstantesDireccion.NUMERO_DIRECCION).into(DireccionPage.INPUT_DIRECCION),
                Enter.theValue(ConstantesDireccion.NUMERO_DIRECCION).into(DireccionPage.INPUT_DIRECCION_2)
        );

    }
    public static DigitarDirDos losCamposFaltantes(){
    return Tasks.instrumented(DigitarDirDos.class);
    }

}
