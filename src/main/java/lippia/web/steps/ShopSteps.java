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
        ShopServices.clickShopBtn();
    }


    @And("El usuario clickea en el boton {string} del item  {string}")
    public void elUsuarioClickeaEnElBotonDelItem(String arg0, String arg1) {
        ShopServices.clickAddBkt();
    }


    @Then("El usuario visualiza solamente dicho item")
    public void elUsuarioVisualizaSolamenteDichoItem() {
        ShopServices.verificarLibro();
    }


    @And("verifica que se agrega el item al carrito")
    public void verificaQueSeAgregaElItemAlCarrito() {
        ShopServices.verificarCarrito();
    }

    @And("El usuario hace click en carrito y se dirige a la proxima pagina")
    public void elUsuarioHaceClickEnCarritoYSeDirigeALaProximaPagina() {
        ShopServices.clcCarrito();
    }

    @Then("la pagina muestra el resumen de compra")
    public void laPaginaMuestraElRemusenDeCompra() {
        ShopServices.verificarResumenCompra();
    }

    @Then("se verifica que los cargos son del {int}%")
    public void seVerificaQueLosCargosSonDel(int p) {
        ShopServices.verificarPorcentaje(p);

    }

    @And("el usuario selecciona India como Pais")
    public void elUsuarioSeleccionaIndiaComoPais() {
        ShopServices.setIndia();
    }

}