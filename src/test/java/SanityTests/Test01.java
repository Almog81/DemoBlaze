package SanityTests;

import Utilities.CommonOps;
import org.testng.annotations.Test;

public class Test01 extends CommonOps {

    @Test
    public void test01_Register() throws InterruptedException {
        driver.get("https://www.demoblaze.com/");
        Thread.sleep(5000);
    }


}
