package co.com.solidaria.questions;

import co.com.solidaria.userinterfaces.DireccionPage;
import co.com.solidaria.userinterfaces.EnseresPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Direccion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return DireccionPage.LBL_DIRECCION.resolveFor(actor).isVisible();
    }
    public static Direccion deVivienda() {
        return new Direccion();
    }
}

