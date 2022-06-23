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
        waitVisibility("xpath://h3[text()='HTML5 Forms']");
        click(BTN_ADD_HTML5_XPATH);}

    public static void verificarLibro() {
        Assert.assertTrue(isVisible(TXT_LIBRO_XPATH));
    }

    public static void verificarCarrito(){


    }

    public static void clcCarrito(){
        isVisible(BTN_CARRITO_ID);
        click(BTN_CARRITO_ID);
    }


    public static void verificarResumenCompra(){
        waitVisibility(TXT_MJE_TNK);
        isVisible(TXT_MJE_TNK);
        isVisible(TXT_MJE_ORDER);
        isVisible(TXT_MJE_TABLE);
    }


 public static void verificarPorcentaje(int p){
        if (p == 5) {

            String tasa = getAttribute(TASA_PRECIO, "innerText").substring(1, 3);
            Assert.assertEquals(tasa,"14");

        } else if (p == 2) {
            waitPresence(TASA_PRECIO);
            String tasa = getAttribute(TASA_PRECIO, "innerText").substring(1, 4);
            Assert.assertEquals(tasa,"5.6");
        }

 }

    public static void setIndia(){
        click("id:select2-chosen-1");
        setInput("id:s2id_autogen1_search","India");
        click("xpath:(//div[contains(@id,'select2-result-label')])[2]");


    }


 }


