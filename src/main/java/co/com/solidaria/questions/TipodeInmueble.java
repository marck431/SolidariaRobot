package co.com.solidaria.questions;

import co.com.solidaria.userinterfaces.InmueblePage;
import co.com.solidaria.userinterfaces.TipoClientePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TipodeInmueble implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return InmueblePage.LBL_INMUEBLE.resolveFor(actor).isVisible();
    }
    public static TipodeInmueble paraCotizar() {
        return new TipodeInmueble();
    }

}
