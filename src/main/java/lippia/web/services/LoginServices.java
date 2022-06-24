package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;
import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.AutomationPracticeConstants.*;

public class LoginServices extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickMyAccount() {
        click(BTN_MYACCOUNT_ID);}

    public static void ingresarCredenciales(String name,String pass){
       setInput(INPUT_USERNAME_ID,name);

        setInput(INPUT_PASSWORD_ID,pass);}


    public static void clickLoginBtn() {
        click(BTN_LOGIN_XPATH);}

    public static void verificarNoLogin() {
        Assert.assertTrue(isVisible(INPUT_USERNAME_ID), "No se visualiza la pantalla de inicio");
    }
    public static void verificarLoginFallido() {
        Assert.assertTrue(isVisible(MJE_ERROR_XPATH));
    }
    public static void setUser(){
    setInput(INPUT_USERNAME_ID,"nano@gmail.com".toUpperCase());

    setInput(INPUT_PASSWORD_ID,"Testing2022*/");
    }

    public static void logout(){
        isVisible(BTN_LOGOUT_XPATH);
        click(BTN_LOGOUT_XPATH);
    }

    public static void irAtras(){
        navigateTo("http://practice.automationtesting.in/my-account/#google_vignette");
    }

    public static void verificarEditCta(){

        Assert.assertTrue(isVisible(A_PASS_ID),"No se visualiza el campo password");
        Assert.assertTrue(isVisible(A_PASS_NEW_ID),"No se visualiza campo new password");
        Assert.assertTrue(isVisible(A_PASS_CONFIRM_ID), "No se visualiza la opcion de cambio de pass");

    }
    public static void seLoguea() {
        Assert.assertTrue(WebActionManager.isVisible(DASHBOARD_XPATH), "No se ve el Dashboard");
    }
    public static void clcAccountDetails() {
        WebActionManager.click(ACCOUNT_DETAILS_XPATH);
    }

}



