package co.com.choucair.certificacion.autostoreexito.tasks;

import co.com.choucair.certificacion.autostoreexito.interactions.AddProducts;
import co.com.choucair.certificacion.autostoreexito.interactions.ListProd;
import co.com.choucair.certificacion.autostoreexito.models.ProductsLoombok;
import co.com.choucair.certificacion.autostoreexito.userinterface.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.ui.Select;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitWithTimeout;

import java.util.ArrayList;

public class ChoseProduct implements Task {

    ProductsLoombok productsLoombok;

    public ChoseProduct(ProductsLoombok productsLoombok) {
        this.productsLoombok = productsLoombok;
    }

    public static ChoseProduct chose(ProductsLoombok productsLoombok) {
        return Tasks.instrumented(ChoseProduct.class, productsLoombok);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(AddProducts.add());
        actor.attemptsTo(Click.on(ProductsPage.BTN_CAR));
    }
}
