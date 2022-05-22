package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.RegistrationServices;

import static lippia.web.constants.AutomationPracticeConstants.*;


public class RegistrationSteps extends PageSteps {
    //***********TEST DE REGISTRACION***********
    @Given("El Usuario se encuentra en la web Automation Practice")
    public void elUsuarioSeEncuentraEnLaWebAutomationPractice() {
        RegistrationServices.navegarWeb();
    }


    @When("El usuario hace clic en  el Boton {string} del menu")
    public void elUsuarioHaceClicEnElBotonDelMenu(String arg0) {
        RegistrationServices.clickMyAccount();
    }

    @And("El usuario ingresa un email valido {string}")
    public void elUsuarioIngresaUnEmailValido(String reg_username) {
        RegistrationServices.completarRegUserName(reg_username);
    }

    @And("El usuario hace clic en el boton {string}")
    public void elUsuarioHaceClicEnElBoton(String arg0) {
        RegistrationServices.clickRegisterBtn() ;
    }


    @Then("El usuario visualiza el error {string}")
    public void elUsuarioVisualizaElError(String arg0) {
        RegistrationServices.verificarPassNull();
    }

//***********caso2********
    @And("El usuario ingresa un email invalido {string}")
    public void elUsuarioIngresaUnEmailInvalido(String reg_username) {
        RegistrationServices.setInput(INPUT_REG_USERNAME_ID,reg_username);
    }

    @And("El usuario ingresa un password valido {string}")
    public void elUsuarioIngresaUnPasswordValido(String reg_pass) {
        RegistrationServices.completarRegPassword(reg_pass);

    }

    @Then("El usuario visualiza el error de email {string}")
    public void elUsuarioVisualizaElErrorDeEmail(String arg0) {
        RegistrationServices.verificarlInvalidEmail();

    }
}
