package co.com.solidaria.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InmueblePage {
    public static final Target LBL_INMUEBLE = Target.the("label Inmueble").located(By.xpath("//h1"));
    public static final Target SELECT_INMUEBLE= Target.the("Select ciudades").located(By.xpath("//app-select//mat-form-field"));
    public static final Target INPUT_BUSCAR_INMUEBLE = Target.the("Vivienda ciudad").located(By.xpath("//input[@placeholder='Buscar...']"));
}
