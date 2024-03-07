package co.com.choucair.certificacion.autostoreexito.interactions;

import co.com.choucair.certificacion.autostoreexito.userinterface.CarShopping;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;

public class ViewProducts implements Interaction {
    Boolean resp;

    public ViewProducts(Boolean resp) {
        this.resp = resp;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        String productos;
        Boolean res = true;
        ArrayList record = new ArrayList();

        record.add(t.recall("list"));
        productos = record.get(0).toString();

        for (int i = 0; i < 5; i++) {
            String prod = String.valueOf(i + 1);
            if (productos.contains((Text.of(CarShopping.PRODUC_SHOP.of(prod)).answeredBy(t)))) {

            } else {
                res = false;
                break;
            }
        }

    }

    public static ViewProducts view(Boolean result) {
        return Tasks.instrumented(ViewProducts.class);
    }
}
