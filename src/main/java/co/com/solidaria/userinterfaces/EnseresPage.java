package co.com.solidaria.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnseresPage {
    public static final Target LBL_ENSERES = Target.the("label de Enseres").located(By.xpath("//h1"));
    public static final Target INPUT_ENSERES = Target.the("Input de enseres").located(By.id("search"));
}
