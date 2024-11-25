package SanityTests;

import PageObjects.HomePage;
import Utilities.CommonOps;
import WorkFlows.WebFlow;
import org.testng.annotations.Test;

public class Test01 extends CommonOps {

    @Test
    public void test01_Login() throws InterruptedException {
        String user =  "automatedUser26@example.com";
        String pass = "4r4nd0mp4ssw0rd";
        driver.get("https://www.demoblaze.com/");
        WebFlow.loginAction(user,pass);
        WebFlow.verifyTextInElement(DemoBlazeHomePage.nameOfUser, "Welcome " + user);
    }


}
