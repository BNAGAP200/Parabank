package ParabankLogin;

import Pageobjects.LoginPageObject.ProfileVerify;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ProfileVerifyTestPage extends LoginTest {

    @BeforeTest
    public void setupbrowser() {

    }

    @Test
    public void msgchecker() {
        ProfileVerify profile = new ProfileVerify(driver);
        String welcomeMsg = profile.getWelcomeMsg();
        Assert.assertEquals("Welcome abc xyz", welcomeMsg);

        // Example: Verify the header
        String headerText = profile.getHeader();
        Assert.assertEquals("Accounts Overview", headerText);

        // Example: Print and verify table text
        String tableText = profile.getTableText();
        System.out.println(tableText);


        // Example: Print and verify balance numbers
        List<WebElement> balanceNos = profile.getBalanceNos();
        for (WebElement amount : balanceNos) {
            String value = amount.getText();
            System.out.println(value);
            // Add your assertion logic for each balance number
        }
    }
}