package ParabankLogin;

import Pageobjects.LoginPageObject.LoginInvalidPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginInvalidTest {
    public WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new EdgeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void testLogininvalid() {
        String Usernamedata = "";
        String Passworddata = "";
        LoginInvalidPage logininv = new LoginInvalidPage(driver);
        logininv.enternousername(Usernamedata);
        logininv.enternopassword(Passworddata);
        logininv.clicklogin();
        Assert.assertEquals("Please enter a username and password.", driver.findElement(By.xpath("//p[@class='error']")).getText());
    }
}

