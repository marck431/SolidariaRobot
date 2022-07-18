package co.com.solidaria.questions;

import co.com.solidaria.userinterfaces.TipoClientePage;
import co.com.solidaria.userinterfaces.ViviendaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TipoCliente implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TipoClientePage.LBL_CLIENTE.resolveFor(actor).isVisible();
    }
    public static TipoCliente deCotizacion() {
        return new TipoCliente();
    }

}
