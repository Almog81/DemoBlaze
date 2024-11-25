package WorkFlows;

import Utilities.CommonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;


public class WebFlow extends CommonOps {
    public static void loginAction(String user, String pass ) {
        DemoBlazeHomePage.btn_login.click();
        DemoBlazeLoginPage.txt_userName.sendKeys(user);
        DemoBlazeLoginPage.txt_password.sendKeys(pass);
        DemoBlazeLoginPage.btn_login.click();
    }
    //@Step("Verify Text In Element")
    public static void verifyTextInElement(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }
}
