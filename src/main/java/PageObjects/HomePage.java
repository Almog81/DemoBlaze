package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(css = "show > .d-none")
    public WebElement show_myAccount;

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    public WebElement btn_register;

    @FindBy(linkText = "Login")
    public WebElement btn_login;
}
