package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id = "loginusername")
    public WebElement txt_userName;

    @FindBy(id = "loginpassword")
    public WebElement txt_password;

    @FindBy(xpath = "//button[@onclick='logIn()']")
    public WebElement btn_login;
}
