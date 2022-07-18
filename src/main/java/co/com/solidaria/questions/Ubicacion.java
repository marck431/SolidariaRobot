package co.com.solidaria.questions;

import co.com.solidaria.userinterfaces.HomePage;
import co.com.solidaria.userinterfaces.ViviendaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Ubicacion implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return ViviendaPage.LBL_VIVIENDA.resolveFor(actor).isVisible();
    }


    public static Ubicacion deVivienda() {
        return new Ubicacion();
    }
}
