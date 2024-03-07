package co.com.choucair.certificacion.autostoreexito.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarShopping {
    public static final Target PRODUC_SHOP = Target.the("carro de compras").locatedBy("(//span[@data-molecule-product-detail-name-span='true'])[{0}]");

}
