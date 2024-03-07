package co.com.choucair.certificacion.autostoreexito.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPage {
    public static final Target PRODUCT1 = Target.the("campo de producto").locatedBy(("(//ul[@data-fs-product-grid-type='tecnologia']/li)[{0}]//section//h3"));
    public static final Target BTN_AGREGAR = Target.the("boton agregar al carrito").locatedBy(("(//button[@class='DefaultStyle_default__vCozi '])[{0}]"));
    //public static final Target BTN_AGREGAR = Target.the("boton agregar al carrito").locatedBy(("((//ul[@data-fs-product-grid-type='tecnologia']/li)[{0}]//button)[2]"));
    public static final Target BTN_AGREGAR_MAS = Target.the("boton agregar al carrito").locatedBy(("//*[@id=\"__next\"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[{0}]/article/section/div[2]/div[2]/div/button[2]"));
    public static final Target BTN_CAR = Target.the("boton agregar al carrito").locatedBy(("//button[@aria-label='Cart toggle button']"));
}
