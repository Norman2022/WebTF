package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LoginServices;

import static lippia.web.constants.AutomationPracticeConstants.*;

public class LoginSteps extends PageSteps {

    @Given("El usuario se encuentra en la web Automation Practice")
    public void elUsuarioSeEncuentraEnLaWebAutomationPractice() {
        LoginServices.navegarWeb();
    }

    @When("^El usuario clickea el botón \"(.*)\" del menú$")
    public void elUsuarioClickeaElBotónDelMenú(String myAccountButton) {
        LoginServices.clickMyAccount();
    }

    @And("^El usuario ingresa su username \"(.*)\"$")
    public void elUsuarioIngresaSuUsername(String username) {
        LoginServices.completarUserName(username);
    }

    @And("^El usuario ingresa su password \"(.*)\"$")
    public void elUsuarioIngresaSuPasword(String password) {

        LoginServices.completarPassword(password);
    }

    @And("^El usuario clickea el boton \"(.*)\"$")
    public void elUsuarioClickeaElBotón(String loginButton) {
        LoginServices.clickLoginBtn();
    }

    @Then("El usuario verifica que ingreso correctamente a la web")
    public void elUsuarioVerificaQueIngresoCorrectamenteALaWeb() {
        LoginServices.verificarLogin();
    }

    @Then("El usuario visualiza mensaje de error en la web")
    public void elUsuarioVerificaIngresoIncorrectamenteALaWeb() {
        LoginServices.verificarLoginFallido();
    }





}
