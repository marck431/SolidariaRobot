package co.com.solidaria.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TipoClientePage {
    public static final Target LBL_CLIENTE = Target.the("label de ubicacion de la vivienda").located(By.xpath("//h1"));
    public static final Target CHECKBOX = Target.the("Check tipo de cliente").located(By.xpath("//input[@id='check2']/following-sibling::label/div/div"));
    public static final Target BTN_SIGUIENTE = Target.the("Boton para comenzar").located(By.xpath("(//app-button/button)[2]"));
    public static final Target DIV_ESPERA = Target.the("Select ciudades").located(By.xpath("//div[@class='d-flex justify-content-center ng-star-inserted']"));

}
