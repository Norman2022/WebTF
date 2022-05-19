package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;
import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.AutomationPracticeConstants.*;

public class AutomationPracticeServices extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickMyAccount() {
        click(BTN_MYACCOUNT_ID);}


    public static void completarUserName(String username) {
        setInput(INPUT_USERNAME_ID,username);
    }
    public static void completarPassword(String pass) {
        setInput(INPUT_PASSWORD_ID,pass);}

    public static void clickLoginBtn() {
        click(BTN_LOGIN_XPATH);}

    public static void verificarLogin() {
        Assert.assertTrue(isVisible(BTN_LOGOUT_XPATH));
    }
    public static void verificarLoginFallido() {
        Assert.assertTrue(isVisible(MJE_ERROR_XPATH));
    }


    public static void clickShopBtn() {
        click(BTN_SHOP_XPATH);}

    public static void clickImagenLk() {
        click(IMG_LIBRO_XPATH);}

    public static void verificarLibro() {
        Assert.assertTrue(isVisible( TXT_LIBRO_XPATH));
    }

    public static void clickSeleniumLk() {
        click(CAT_SELENIUM_XPATH);}


    public static void verificarLibros() {
        Assert.assertTrue(isVisible(TXT_SELENIUM_XPATH));
    }

//**********REGISTER***********

    public static void completarRegUserName(String reg_username) {
        setInput(INPUT_REG_USERNAME_ID,reg_username);
    }
    public static void completarRegPassword(String reg_pass) {
        setInput(INPUT_REG_PASS_ID,reg_pass);
    }

    public static void clickRegisterBtn() {
        click(BTN_REGISTER_XPATH);}

    public static void verificarPassNull() {
        Assert.assertTrue(isVisible(TXT_ERROR_PASSNULL_XPATH ));

        //*****caso 2********
    }
    public static void verificarlInvalidEmail() {
        Assert.assertTrue(isVisible(TXT_ERROR_EMAIL_XPATH));
    }


}
