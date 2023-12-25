package AccountServices;

import Pageobjects.AccountServices.CheckingLinks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckingLinksTest extends ListofservicesTest {
    @BeforeTest
    public void calltologin(){
        checkingservices1();

    }
    @Test
    public void checkinglinks(){
        CheckingLinks checklinks = new CheckingLinks(driver);
        List<WebElement> checkingservicelinks = checklinks.setlistoflinks();

       for (int i=0;i<checkingservicelinks.size();i++){
           Actions actions = new Actions(driver);
           actions.keyDown(Keys.CONTROL).click(checkingservicelinks.get(i)).keyUp(Keys.CONTROL).build().perform();

           ArrayList<String>clicklinks = new ArrayList<>(driver.getWindowHandles());
        //   int lastIndex = clicklinks.size() - 1;
           driver.switchTo().window(clicklinks.get(i));

           String PageTitle = driver.getTitle();
           System.out.println(PageTitle);
       }


        }
        @Test
        public void teardown(){
        driver.quit();



        }
}
