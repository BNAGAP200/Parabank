package FooterLinks;

import Pageobjects.FooterPageObject.FooterAllLinks;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class FooterAllLinksClicks {
    WebDriver driver;


    @BeforeTest
    public void init() {
        driver = new EdgeDriver();
        driver.get("https://parabank.parasoft.com/parabank/about.htm");
    }

    @Test
    public void checkinglinks() {
        FooterAllLinks aboutUsLinks = new FooterAllLinks(driver);



        Actions actions = new Actions(driver);
        for (int i = 0; i < aboutUsLinks.Links().size(); i++) {
            actions.keyDown(Keys.CONTROL).click(aboutUsLinks.Links().get(i)).keyUp(Keys.CONTROL).build().perform();
            ArrayList<String> linksstore = new ArrayList<>(driver.getWindowHandles());
          driver.switchTo().window(linksstore.get(i));
            String PageTitle = driver.getTitle();
            System.out.println(PageTitle);
        }
    }
}
