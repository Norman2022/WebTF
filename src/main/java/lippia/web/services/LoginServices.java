package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.sql.DriverAction;
import java.sql.DriverManager;

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
        Assert.assertTrue(isVisible(INPUT_USERNAME_ID));
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

    public static void clickBtnAtras(){
        navigateTo("http://practice.automationtesting.in/my-account/#google_vignette");
    }

    public static void verificarEditCta(){

        isVisible(A_PASS_ID);
        isVisible(A_PASS_NEW_ID);
        Assert.assertTrue(isVisible(A_PASS_CONFIRM_ID), "No se visualiza la opcion de cambio de pass");

    }


}



