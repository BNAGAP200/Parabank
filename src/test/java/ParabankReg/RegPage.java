package ParabankReg;

import Pageobjects.Regpage.InitializationRegpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegPage {
    WebDriver driver;



    @BeforeTest
    public void setup() {
        driver = new EdgeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        Assert.assertEquals("ParaBank | Welcome | Online Banking", driver.getTitle());
    }

    @Test
    public void verfiyRegLink() {
        InitializationRegpage reg = new InitializationRegpage(driver);
        reg.RegPageLink();
        driver.findElement(By.partialLinkText("Register")).click();
        String expectedRegPageTitle = "ParaBank | Register for Free Online Account Access";
        String actualPageTitle = driver.getTitle();

        Assert.assertTrue(actualPageTitle.contains(expectedRegPageTitle),
                "Expected title: " + expectedRegPageTitle + ", Actual title: " + actualPageTitle);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}


