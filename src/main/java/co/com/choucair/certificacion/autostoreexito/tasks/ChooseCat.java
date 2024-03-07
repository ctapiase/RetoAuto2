package co.com.choucair.certificacion.autostoreexito.tasks;

import co.com.choucair.certificacion.autostoreexito.userinterface.HomePage;
import co.com.choucair.certificacion.autostoreexito.userinterface.MenuCategory;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class ChooseCat implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(HomePage.MENU_BUTTON),
                Click.on(MenuCategory.CATEGORY_TEGNOLOGIA),
                Click.on(MenuCategory.VER_TODO));


    }

    public static ChooseCat enterCategory() {
        return Tasks.instrumented(ChooseCat.class);
    }
}
