package WorkFlows;

import Utilities.CommonOps;


public class WebFlow extends CommonOps {
    public static void loginAction(String user, String pass ) {
        DemoBlazeHomePage.btn_login.click();
        DemoBlazeLoginPage.txt_userName.sendKeys(user);
        DemoBlazeLoginPage.txt_password.sendKeys(pass);
        DemoBlazeLoginPage.btn_login.click();
    }
}
