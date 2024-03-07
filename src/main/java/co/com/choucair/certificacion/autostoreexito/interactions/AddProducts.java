package co.com.choucair.certificacion.autostoreexito.interactions;

import co.com.choucair.certificacion.autostoreexito.userinterface.ProductsPage;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import java.util.ArrayList;



public class AddProducts implements Interaction {

    String prod = "";

    ArrayList productos = new ArrayList();
    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T t) {

        for (int i = 0; i < 5; i++) {

            prod = String.valueOf((int) (Math.random() * 44 )+1);

            t.attemptsTo(Scroll.to(ProductsPage.PRODUCT1.of(prod)).andAlignToBottom());
            Thread.sleep(2000);
            productos.add(Text.of(ProductsPage.PRODUCT1.of(prod)).answeredBy(t));
            t.attemptsTo(Click.on(ProductsPage.BTN_AGREGAR.of(prod)));
            Thread.sleep(1000);


            /*int canProd = (int)(Math.random()*10+1)-1;
            System.out.println(canProd);
            for (int j = 0; j < canProd; j++) {
                t.attemptsTo(Click.on(ProductsPage.BTN_AGREGAR_MAS.of(prod)));
                System.out.println(j);
                Thread.sleep(3000);
            }*/
        }

        t.remember("list",productos);


    }

    public static AddProducts add() {
        return Tasks.instrumented(AddProducts.class);
    }
}
