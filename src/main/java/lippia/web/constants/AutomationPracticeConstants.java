package lippia.web.constants;

public class AutomationPracticeConstants {

    public static final String BTN_MYACCOUNT_ID = "id:menu-item-50";
    public static final String INPUT_USERNAME_ID = "id:username";
    public static final String INPUT_PASSWORD_ID = "id:password";
    public static final String BTN_LOGIN_XPATH = "xpath://input[@value='Login']";
    public static final String BTN_LOGOUT_XPATH = "xpath://a[text()='Logout']";

    public static final String BTN_HOME_XPATH = "xpath://a[text()='Home']";
    public static final String HOME_ITEMS_XPATH ="xpath://div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']";
    public static final String MJE_ERROR_XPATH = "xpath://a[text()='Lost your password?']";

    public static final String IMG_LIBRO_XPATH = "xpath://img[@alt='Mastering HTML5 Forms']";

    public static final String BTN_SHOP_XPATH = "xpath://li[@id='menu-item-40']";

    public static final String BTN_ADD_HTML5_XPATH = "xpath://a[@href='/shop/?add-to-cart=181']";

    public static final String TXT_LIBRO_XPATH = "xpath://h1[text()='HTML5 Forms']";
    public static final String ITEM_DESCRIP_XPATH = "xpath://a[text()='Description']";
    public static final String BTN_ADD_ITEM_XPATH = "xpath://button[@class='single_add_to_cart_button button alt']";
    public static final String ITEM_ADD_XPATH = "xpath://span[@class='cartcontents']";
    public static final String ITEM_PRICE_XPATH = "xpath://span[text()='₹280.00']";
    public static final String BTN_VIEW_BKT_XPATH = "xpath://a[text()='View Basket']";

    public static final String SUBTOTAL_XPATH = "xpath://th[text()='Subtotal']";
    public static final String TOTAL_XPATH = "xpath://th[text()='Total']";

    public static final String CHKOUT_XPATH = "xpath://div[@class='wc-proceed-to-checkout']/a[text()]";

    public static final String TIT_BILLING_XPATH = "xpath://h3[text()='Billing Details']";
    public static final String TIT_ADD_INFO_XPATH = "xpath://h3[text()='Additional Information']";
    public static final String TIT_ORDER_XPATH = "xpath://h3[text()='Your order']";
    public static final String SELENIUM_XPATH = "xpath://img[@title='Selenium Ruby']";
    public static final String INPUT_FNAME_ID = "id:billing_first_name";
    public static final String INPUT_LNAME_ID = "id:billing_last_name";
    public static final String INPUT_EMAIL_ID = "id:billing_email";
    public static final String INPUT_CEL_ID = "id:billing_phone";
    public static final String INPUT_DIR_ID = "id:billing_address_1";
    public static final String INPUT_CITY_ID = "id:billing_city";
    public static final String INPUT_CP_ID = "id:billing_postcode";
    public static final String BTN_SELECT_STATE = "id:select2-chosen-2";
    public static final String INPUT_STATE_ID = "id:s2id_autogen2_search";
    public static final String INPUT_COMMENTS_ID = "id:order_comments";
    public static final String BTN_PLACE_ORDER_ID = "xpath://input[@class='button alt']";




    //****************TEST REGISTER**********

    public static final String INPUT_REG_USERNAME_ID = "id:reg_email";
    public static final String BTN_REGISTER_XPATH = "xpath://input[@value='Register']";
    public static final String TXT_ERROR_PASSNULL_XPATH ="xpath://li[text()=' Please enter an account password.']";

    public static final String INPUT_REG_PASS_ID = "id:reg_password";

    public static final String TXT_ERROR_EMAIL_XPATH ="xpath://li[text()=' Please provide a valid email address.']";



    //****************TEST SHOP**********
    public static final String BTN_CARRITO_ID = "id:wpmenucartli";
    public static final String TXT_MJE_TNK = "xpath://p[text()='Thank you. Your order has been received.']";
    public static final String TXT_MJE_ORDER = "xpath://h2[text()='Order Details']";
    public static final String TXT_MJE_TABLE = "xpath://table[@class='shop_table order_details']";

    public static final String SUBTOT_PRECIO = "xpath://span[@class='woocommerce-Price-amount amount']";

    public static final String TOTAL_PRECIO = "xpath://tr[@class='order-total']//span[@class='woocommerce-Price-amount amount']";

    public static final String TASA_PRECIO = "xpath:(//span[contains(@class,'woocommerce-Price-amount amount')])[3]";


    //****************TEST ACCOUNT**********

    public static final String A_PASS_ID = "id:password_current";
    public static final String A_PASS_NEW_ID = "id:password_1";
    public static final String A_PASS_CONFIRM_ID = "id:password_2";
}
