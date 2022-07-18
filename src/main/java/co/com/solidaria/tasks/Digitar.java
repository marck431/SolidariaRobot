package co.com.solidaria.tasks;

import co.com.solidaria.userinterfaces.EnseresPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Digitar implements Task {

    public Digitar(String valor) {
        this.valor = valor;
    }

    String valor;


    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
        WaitUntil.angularRequestsHaveFinished(),
        Enter.theValue(valor).into(EnseresPage.INPUT_ENSERES)
);
    }

    public static Digitar losEnseres( String valor){
        return Tasks.instrumented(Digitar.class,valor);
    }
}
