package co.com.solidaria.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static final Target BTN_COTIZA = Target.the("Boton para comenzar").located(By.xpath("(//app-button/button)[1]"));
    public static final Target INPUT_CORREO = Target.the("Correo").located(By.id("email"));
    public static final Target INPUT_CORREO_CONFIRMAR = Target.the("Correo").located(By.id("confirm-email"));
    public static final Target CHECKBOX = Target.the("Terminos y condiciones").located(By.xpath("//input[@id='check2']/following-sibling::label/div/div"));
    public static final Target BTN_EMPECEMOS = Target.the("Boton para comenzar").located(By.xpath("//*[@id=\"formulario-cotizacion\"]/app-cotizacion/form/div/div[6]/div/app-button/button"));
}
