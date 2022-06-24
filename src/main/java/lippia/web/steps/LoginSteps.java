package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.internal.net.http.common.Log;
import lippia.web.constants.AutomationPracticeConstants;
import lippia.web.services.LoginServices;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginSteps extends PageSteps {


    @When("El usuario clickea el botón My Account del menu")
    public void elUsuarioClickeaElBotónMyAccountDelMenu() {
        LoginServices.clickMyAccount();
    }



    @And("el usuario ingresa username{string} y password{string} en mayusculas")
    public void elUsuarioIngresaUsernameUsernameYPasswordPasswordEnMayusculas(String name, String pass) {
        LoginServices.ingresarCredenciales(name.toUpperCase(),pass.toUpperCase());
    }
    @And("el usuario presiona el boton Login")
    public void elUsuarioPresionaElBotonLogin() {
        LoginServices.clickLoginBtn();
    }

    @Then("visualiza error por password incorrecto")
    public void visualizaErrorPorPasswordIncorrecto() {
        LoginServices.verificarLoginFallido();
    }

    @And("el usuario ingresa username en mayusculas")
    public void elUsuarioIngresaUsernameEnMayusculas() {
        LoginServices.setUser();

    }

    @And("el usuario se desloguea y presiona Atras")
    public void elUsuarioSeDeslogueaYPresionaAtras() {
        LoginServices.logout();
        LoginServices.irAtras();
    }

    @Then("el usuario debe ver el formulario de Login")
    public void elUsuarioDebeVerElFormularioDeLogin() {
        LoginServices.verificarNoLogin();
    }


    @And("el usuario ingresa username{string} y password{string}")
    public void elUsuarioIngresaUsernameUsernameYPasswordPassword(String name, String pass) {
        LoginServices.ingresarCredenciales(name,pass);


    }

    @Then("el usuario se loguea exitosamente")
    public void elUsuarioSeLogueaExitosamente() {
        LoginServices.seLoguea();

    }

    @And("el usuario hace clic en {string}")
    public void elUsuarioHaceClicEnAccountDetails(String args0) {
        LoginServices.clcAccountDetails();

    }

    @Then("el usuario ve los detalles de su cuenta y puede cambiar su password")
    public void elUsuarioVeLosDetallesDeSuCuentaYPuedeCambiarSuPassword() {
        LoginServices.verificarEditCta();
    }

    @And("el usuario hace clic en el  boton {string}")
    public void elUsuarioHaceClicEnElBotonLogout(String args0) {
        LoginServices.logout();
    }

    @Then("el usuario se desloguea exitosamente")
    public void elUsuarioSeDeslogueaExitosamente() {
        LoginServices.verificarNoLogin();
    }
}

