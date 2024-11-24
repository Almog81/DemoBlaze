package SanityTests;

import Utilities.CommonOps;
import WorkFlows.WebFlow;
import org.testng.annotations.Test;

public class Test01 extends CommonOps {

    @Test
    public void test01_Login() throws InterruptedException {
        driver.get("https://www.demoblaze.com/");
        WebFlow.loginAction("automatedUser26@example.com","4r4nd0mp4ssw0rd");
        Thread.sleep(5000);
    }


}
