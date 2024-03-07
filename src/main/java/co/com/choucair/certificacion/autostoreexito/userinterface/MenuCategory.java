package co.com.choucair.certificacion.autostoreexito.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuCategory {
    public static final Target CATEGORY_TEGNOLOGIA = Target.the("clic button login").located(By.xpath("(//div[@data-link-content='true']/p)[3]"));
    public static final Target VER_TODO = Target.the("clic button login").located(By.xpath("//a[@data-ver-todo='true']"));
}
