package co.com.choucair.certificacion.autostoreexito.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target MENU_BUTTON = Target.the("menu button").located(By.xpath("//div[@data-fs-menu-icon-container='true']"));

}
