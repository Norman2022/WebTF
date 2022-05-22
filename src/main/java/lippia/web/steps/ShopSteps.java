package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ShopServices;

import static lippia.web.constants.AutomationPracticeConstants.*;

public class ShopSteps extends PageSteps {

    @Given("El usuario se encuentra en la Web Automation Practice")
    public void elUsuarioSeEncuentraEnLaWebAutomationPractice() {
        ShopServices.navegarWeb();
    }

 

    @When("El Usuario clickea el Boton {string}")
    public void elUsuarioClickeaElBotónShop(String botonShop) {
        ShopServices.click(BTN_SHOP_XPATH);
    }
    @And("El usuario clickea en el item  {string}")
    public void elUsuarioClickeaEnElItem(String arg0) {
        ShopServices.clickImagenLk();
    }

    @Then("El usuario visualiza solamente dicho item")
    public void elUsuarioVisualizaSolamenteDichoItem() {
        ShopServices.verificarLibro();
    }

    @And("^El usuario clickea en la categoria \"(.*)\"$")
    public void elUsuarioClickeaEnCatSelenium(String arg0) {
        ShopServices.clickSeleniumLk();
    }


    @Then("El usuario visualiza solamente dichos items")
    public void elUsuarioVisualizaSolamenteDichosItems() {

        ShopServices.verificarLibros();
    }



   
}
