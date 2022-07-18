package co.com.solidaria.questions;

import co.com.solidaria.userinterfaces.EnseresPage;
import co.com.solidaria.userinterfaces.ViviendaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Enseres implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return EnseresPage.LBL_ENSERES.resolveFor(actor).isVisible();
    }


    public static Enseres deVivienda() {
        return new Enseres();
    }
}
