package ParabankLogin;

import Pageobjects.LoginPageObject.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

    public WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new EdgeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void testLoginWithCorrectDetails() {
        String Usernamedata = "abc01";
        String Passworddata = "AbcXyz002";
        Login login = new Login(driver);
        login.enterusername(Usernamedata);
        login.enterpassword(Passworddata);
        login.clicklogin();
        Assert.assertEquals("ParaBank | Accounts Overview", driver.getTitle());
    }
}