package co.com.choucair.certificacion.autostoreexito.questions;

import co.com.choucair.certificacion.autostoreexito.interactions.ViewProducts;
import co.com.choucair.certificacion.autostoreexito.userinterface.CarShopping;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;

public class ValidateProducts implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String productos;
        Boolean res = true;
        ArrayList record = new ArrayList();

        record.add(actor.recall("list"));

        productos = record.get(0).toString();

        for (int i = 0; i < 5; i++) {

            String prod = String.valueOf(i + 1);
            if (productos.contains((Text.of(CarShopping.PRODUC_SHOP.of(prod)).answeredBy(actor)))) {
                res= true;
            } else {
                res = false;
                break;
            }
        }

        return res;
    }

    public static ValidateProducts validate() {
        return new ValidateProducts();
    }
}
