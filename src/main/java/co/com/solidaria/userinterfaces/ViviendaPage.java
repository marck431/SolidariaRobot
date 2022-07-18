package co.com.solidaria.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ViviendaPage {
    public static final Target BTN_SIGUIENTE = Target.the("Boton para comenzar").located(By.xpath("(//app-button/button)[2]"));
    public static final Target LBL_VIVIENDA = Target.the("label de ubicacion de la vivienda").located(By.xpath("//h1"));
    public static final Target SELECT_CIUDAD = Target.the("Select ciudades").located(By.xpath("//app-select//mat-form-field"));
    public static final Target INPUT_BUSCAR_CIUDAD = Target.the("Vivienda ciudad").located(By.xpath("//input[@placeholder='Buscar...']"));
}
