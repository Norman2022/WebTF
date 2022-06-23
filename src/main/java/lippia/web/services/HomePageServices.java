package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.sql.DriverManager;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.AutomationPracticeConstants.*;

public class HomePageServices extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickShopBtn() {
        click(BTN_SHOP_XPATH);}
    public static void clickHomeBtn() {
        click(BTN_HOME_XPATH);}

    public static void verificar3items(){

        Assert.assertEquals(getElement(HOME_ITEMS_XPATH).getAttribute("childElementCount"),"3", "No hay 3 Arrivals");
    }

    public static void clcikHtmlItem(String libro){
       if (libro.equals("HTML5 Forms"))
        click(IMG_LIBRO_XPATH);
           else if (libro.equals("Selenium")){
           click(SELENIUM_XPATH);
       }
    }
    public static void verificarPaginaSig(){
        Assert.assertTrue(isVisible(ITEM_DESCRIP_XPATH));
    }
    public static void clickAddToBasket() {
        Assert.assertTrue(isVisible(BTN_ADD_ITEM_XPATH,"No se encuentra el Boton ADD"));
        click(BTN_ADD_ITEM_XPATH);
    }
    public static void verificarAddItem(){

                Assert.assertEquals(getAttribute(ITEM_ADD_XPATH,"innerText"),"1 Item"); ;

    }
    public static void clickViewBasket(){
        click(BTN_VIEW_BKT_XPATH);
    }

    public static void verSubAndTotal(){

        isVisible(SUBTOTAL_XPATH);
        isVisible(TOTAL_XPATH);
    }
    public static void clickChkOutBtn(){
        click(CHKOUT_XPATH);
    }

    public static void verificarOrden(){

       isVisible(TIT_BILLING_XPATH);
       isVisible(TIT_ADD_INFO_XPATH);
       isVisible(TIT_ORDER_XPATH);
    }
    public static void datosCompras(){
        setInput(INPUT_FNAME_ID, "Tutanka");
        setInput(INPUT_LNAME_ID, "mon" );
        setInput(INPUT_EMAIL_ID, "tutanka@gmail.com");
        setInput(INPUT_CEL_ID,"379452639");
        setInput(INPUT_DIR_ID,"siempre viva 123");
        setInput(INPUT_CITY_ID, "Ctes");
        setInput(INPUT_CP_ID,"3400");
        click(BTN_SELECT_STATE);
        setInput(INPUT_STATE_ID,"Corrientes"+ Keys.ENTER);
       setInput(INPUT_COMMENTS_ID,"Tocar timbre 3, Tres veces");

    }

    public static void clkPlaceOrder(){
        Assert.assertTrue(isEnabled(BTN_PLACE_ORDER_ID));
        click("id:place_order");
    }
}
