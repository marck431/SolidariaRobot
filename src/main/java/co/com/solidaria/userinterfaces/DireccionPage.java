package co.com.solidaria.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DireccionPage {
    public static final Target LBL_DIRECCION = Target.the("label de dirección").located(By.xpath("//h1"));
    public static final Target INPUT_DIRECCION = Target.the("Input").located(By.id("nomenclatura_direccion"));
    public static final Target INPUT_PRIMER = Target.the("Input ").located(By.id("first_number"));
    public static final Target SELECT_DIR = Target.the("Select ciudades").located(By.xpath("//app-select//mat-form-field"));
    public static final Target INPUT_BUSCAR_DIR = Target.the("TIPO DE CALLE").located(By.xpath("//input[@placeholder='Buscar...']"));
    public static final Target INPUT_DIRECCION_2 = Target.the("Input").located(By.id("numero_direccion"));

}
