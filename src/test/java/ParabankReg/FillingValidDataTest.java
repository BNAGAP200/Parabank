package ParabankReg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.Regpage.FillingValidData;

public class FillingValidDataTest {
    WebDriver driver;

    @BeforeTest
    public void LinkLaunch() {
        driver = new EdgeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void FillRegistrationForm() {
        FillingValidData regPage = new FillingValidData(driver);
        //regPage.formtitles();
        regPage.setRegLinkclick();
        regPage.setFirstname();
        regPage.setLastname();
        regPage.setAddress();
        regPage.setCity();
        regPage.setState();
        regPage.setZipcode();
        regPage.setPhonenumber();
        regPage.setSsn();
        regPage.setUsername();
        regPage.setPassword();
        regPage.setRepeatedpassword();
        regPage.setRegclickbutton();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}









