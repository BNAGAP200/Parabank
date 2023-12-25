package AccountServices2;

import Pageobjects.AccountServices2.ClickallLinks;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ClickallLinksTest {
    WebDriver driver;

    @BeforeTest
    public void LinkLaunch() {
        driver = new EdgeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }
    @Test
    public void testonLinks(){
        ClickallLinks clicks = new ClickallLinks(driver);
        String Usernamedata = "abc01";
        String Passworddata = "AbcXyz002";
        clicks.enterusername(Usernamedata);
        clicks.enterpassword(Passworddata);
        clicks.clicklogin();
        List<WebElement> links = clicks.setlinklist();


        for (int i=0;i<clicks.setlinklist().size();i++){
            Actions act = new Actions(driver);
            act.keyDown(Keys.CONTROL).click(links.get(i)).keyUp(Keys.CONTROL).build().perform();
            ArrayList<String> ararylinks = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(ararylinks.get(i));
            String PageTitle = driver.getTitle();
            System.out.println(PageTitle);
        }
    }
}
