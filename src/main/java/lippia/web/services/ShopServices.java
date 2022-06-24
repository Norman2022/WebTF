package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static com.crowdar.core.actions.WebActionManager.waitTabOpening;
import static lippia.web.constants.AutomationPracticeConstants.*;

public class ShopServices extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }



    public static void clickShopBtn() {
        click(BTN_SHOP_XPATH);}

    public static void clickAddBkt() {
         click(BTN_ADD_HTML5_XPATH);}

    public static void verificarLibro() {
        Assert.assertTrue(isVisible(TXT_LIBRO_XPATH),"No se encuentra el libro: "+TXT_LIBRO_XPATH);
    }

    public static void verificarCarrito(){


    }

    public static void clcCarrito(){
       Assert.assertTrue(isVisible(BTN_CARRITO_ID),"No esta presente el boton de Carrito");
        click(BTN_CARRITO_ID);
    }


    public static void verificarResumenCompra(){
        waitVisibility(TXT_MJE_TNK);
        Assert.assertTrue(isVisible(TXT_MJE_TNK),"No esta presente el texto Gracias por la compra");
        Assert.assertTrue(isVisible(TXT_MJE_ORDER),"No esta presente el titulo Detalle de Ordenes");
        Assert.assertTrue(isVisible(TXT_MJE_TABLE),"No se ve el detalle de la compra");

    }


 public static void verificarPorcentaje(int p){
        if (p == 5) {

            String tasa = getAttribute(TASA_PRECIO, "innerText").substring(1, 3);
            Assert.assertEquals(tasa,"14", "La tasa no es igual al 14%");

        } else if (p == 2) {
            waitPresence(TASA_PRECIO);
            String tasa = getAttribute(TASA_PRECIO, "innerText").substring(1, 4);
            Assert.assertEquals(tasa,"5.6", "La tasa no es igual al 14%");
        }

 }

    public static void setIndia(){


        click("id:select2-chosen-1");
        setInput("id:s2id_autogen1_search","India");
        click("xpath:(//div[contains(@id,'select2-result-label')])[2]");


    }


 }


