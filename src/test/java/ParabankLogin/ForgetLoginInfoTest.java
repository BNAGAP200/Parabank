package ParabankLogin;

import Pageobjects.LoginPageObject.ForgetLoginInfopage;
import Pageobjects.Regpage.FillingValidData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ForgetLoginInfoTest {
    WebDriver driver;

    @BeforeTest
    public void LinkLaunch() {
        driver = new EdgeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void testForgetLogin() {
        ForgetLoginInfopage forgetlogin = new ForgetLoginInfopage(driver);
        forgetlogin.setForgetinfolink();
        forgetlogin.setConsumerdetailpanel();
        forgetlogin.setFirstname();
        forgetlogin.setLastname();
        forgetlogin.setAddressstreet();
        forgetlogin.setAddresscity();
        forgetlogin.setAddressstate();
        forgetlogin.setAddresszipcode();
        forgetlogin.setSsn();
    }
}