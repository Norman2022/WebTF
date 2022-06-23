package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomePageServices;

import java.io.IOException;

public class HomePageSteps extends PageSteps {

    @Given("El usuario se encuentra en la web Automation Practice")
    public void elUsuarioSeEncuentraEnLaWebAutomationPractice() {
        HomePageServices.navegarWeb();
    }

    @When("^El usuario clickea el botón \"(.*)\" del menú$")
    public void elUsuarioClickeaElBotónDelMenú(String shopBtn) {
        HomePageServices.clickShopBtn();
    }

    @And("El usuario clickea el botón {string} del menu")
    public void elUsuarioClickeaElBotónDelMenu(String homeBtn) {
        HomePageServices.clickHomeBtn();
    }


    @And("Se verifica que solo se vea tres item")
    public void seVerificaQueSoloSeVeaTresItem() {
        HomePageServices.verificar3items();
    }


    @And("el usuario hace clic en el item {string}")
    public void elUsuarioHaceClicEnElItem(String libro) {
        HomePageServices.clcikHtmlItem(libro);
    }

    @And("verifica que se esta navegando en la pagina siguiente")
    public void verificaQueSeEstaNavegandoEnLaPaginaSiguiente() {
        HomePageServices.verificarPaginaSig();
    }

    @And("El usuario clickea el botón {string}")
    public void elUsuarioClickeaElBotón(String arg0) throws IOException {
        HomePageServices.clickAddToBasket();
    }

    @And("verifica que se agrega al carrito")
    public void verificaQueSeAgregaAlCarrito() {
        HomePageServices.verificarAddItem();
    }

    @And("El usuario hace click en {string}")
    public void elUsuarioHaceClickEn(String arg0) {
        HomePageServices.clickViewBasket();
    }

    @And("visualiza el precio subtotal  y total")
    public void visualizaElPrecioSubtotalYTotal() {
        HomePageServices.verSubAndTotal();
    }

    @And("el usuario hace click en Checkout")
    public void elUsuarioHaceClickEnCheckout() {
        HomePageServices.clickChkOutBtn();
    }

    @Then("el usuario puede encontrar facturación, pedido y detalles adicionales")
    public void elUsuarioPuedeEncontrarFacturaciónPedidoYDetallesAdicionales() {
        HomePageServices.verificarOrden();
    }

    @And("el usuario introduce todos los datos para finalizar la compra")
    public void elUsuarioIntroduceTodosLosDatosParaFinalizarLaCompra() {
        HomePageServices.datosCompras();
    }

    @And("el usuario termina la compra haciendo click  en {string}")
    public void elUsuarioTerminaLaCompraHaciendoClickEn(String arg0) {
        HomePageServices.clkPlaceOrder();
    }
}
