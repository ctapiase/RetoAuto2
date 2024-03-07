package autostoreexito.stepdefinitions;


import co.com.choucair.certificacion.autostoreexito.models.ProductsLoombok;
import co.com.choucair.certificacion.autostoreexito.questions.ValidateProducts;
import co.com.choucair.certificacion.autostoreexito.tasks.ChooseCat;
import co.com.choucair.certificacion.autostoreexito.tasks.ChoseProduct;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.choucair.certificacion.autostoreexito.utils.GlobalData.ACTOR;
import static co.com.choucair.certificacion.autostoreexito.utils.GlobalData.URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class StoreStepDefinitions {
    @Given("The user are in the page Exito")
    public void theUserAreInThePageExito() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }

    @When("the user choose a category")
    public void theUserChooseACategory() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChooseCat.enterCategory());
    }

    @When("the user chosse five producs")
    public void theUserChosseFiveProducs(DataTable table) {
        OnStage.theActorInTheSpotlight().attemptsTo(ChoseProduct.chose(ProductsLoombok.setData(table).get(0)));
    }

    @Then("The name of the added products must be the same as in the cart")
    public void theNameOfTheAddedProductsMustBeTheSameAsInTheCart() {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateProducts.validate()));
    }

}
