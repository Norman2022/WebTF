package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.AutomationPracticeConstants.*;

public class ShopServices extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }



    public static void clickShopBtn() {
        click(BTN_SHOP_XPATH);}

    public static void clickImagenLk() {
        click(IMG_LIBRO_XPATH);}

    public static void verificarLibro() {
        Assert.assertTrue(isVisible(TXT_LIBRO_XPATH));
    }

    public static void clickSeleniumLk() {
        click(CAT_SELENIUM_XPATH);}


    public static void verificarLibros() {
        Assert.assertTrue(isVisible(TXT_SELENIUM_XPATH));
    }


}
