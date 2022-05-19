package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.AutomationPracticeServices;

import static lippia.web.constants.AutomationPracticeConstants.*;

public class AutomationPracticeSteps extends PageSteps {

    @Given("El usuario se encuentra en la web Automation Practice")
    public void elUsuarioSeEncuentraEnLaWebAutomationPractice() {
        AutomationPracticeServices.navegarWeb();
    }

    @When("^El usuario clickea el botón \"(.*)\" del menú$")
    public void elUsuarioClickeaElBotónDelMenú(String myAccountButton) {
        AutomationPracticeServices.clickMyAccount();
    }

    @And("^El usuario ingresa su username \"(.*)\"$")
    public void elUsuarioIngresaSuUsername(String username) {
        AutomationPracticeServices.completarUserName(username);
    }

    @And("^El usuario ingresa su password \"(.*)\"$")
    public void elUsuarioIngresaSuPasword(String password) {

        AutomationPracticeServices.completarPassword(password);
    }

    @And("^El usuario clickea el boton \"(.*)\"$")
    public void elUsuarioClickeaElBotón(String loginButton) {
        AutomationPracticeServices.clickLoginBtn();
    }

    @Then("El usuario verifica que ingreso correctamente a la web")
    public void elUsuarioVerificaQueIngresoCorrectamenteALaWeb() {
        AutomationPracticeServices.verificarLogin();
    }

    @Then("El usuario visualiza mensaje de error en la web")
    public void elUsuarioVerificaIngresoIncorrectamenteALaWeb() {
        AutomationPracticeServices.verificarLoginFallido();
    }


    @When("El usuario clickea el Boton {string}")
    public void elUsuarioClickeaElBotónShop(String botonShop) {
        AutomationPracticeServices.click(BTN_SHOP_XPATH);
    }
    @And("El usuario clickea en el item  {string}")
    public void elUsuarioClickeaEnElItem(String arg0) {
        AutomationPracticeServices.clickImagenLk();
    }

    @Then("El usuario visualiza solamente dicho item")
    public void elUsuarioVisualizaSolamenteDichoItem() {
        AutomationPracticeServices.verificarLibro();
    }

    @And("^El usuario clickea en la categoria \"(.*)\"$")
    public void elUsuarioClickeaEnCatSelenium(String arg0) {
        AutomationPracticeServices.clickSeleniumLk();
    }


    @Then("El usuario visualiza solamente dichos items")
    public void elUsuarioVisualizaSolamenteDichosItems() {

        AutomationPracticeServices.verificarLibros();
    }



    //***********TEST DE REGISTRACION***********
    @When("El usuario hace clic en  el Boton {string} del menu")
    public void elUsuarioHaceClicEnElBotonDelMenu(String arg0) {

        AutomationPracticeServices.clickMyAccount();
    }

    @And("El usuario ingresa un email valido {string}")
    public void elUsuarioIngresaUnEmailValido(String reg_username) {
        AutomationPracticeServices.completarRegUserName(reg_username);
    }

    @And("El usuario hace clic en el boton {string}")
    public void elUsuarioHaceClicEnElBoton(String arg0) {
        AutomationPracticeServices.clickRegisterBtn() ;
    }


    @Then("El usuario visualiza el error {string}")
    public void elUsuarioVisualizaElError(String arg0) {
        AutomationPracticeServices.verificarPassNull();
    }

//***********caso2********
    @And("El usuario ingresa un email invalido {string}")
    public void elUsuarioIngresaUnEmailInvalido(String reg_username) {
        AutomationPracticeServices.setInput(INPUT_REG_USERNAME_ID,reg_username);
    }

    @And("El usuario ingresa un password valido {string}")
    public void elUsuarioIngresaUnPasswordValido(String reg_pass) {
        AutomationPracticeServices.completarRegPassword(reg_pass);

    }

    @Then("El usuario visualiza el error de email {string}")
    public void elUsuarioVisualizaElErrorDeEmail(String arg0) {
        AutomationPracticeServices.verificarlInvalidEmail();

    }
}
