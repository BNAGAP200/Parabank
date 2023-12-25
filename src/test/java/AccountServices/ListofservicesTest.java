package AccountServices;


import Pageobjects.AccountServices.ListOfServices;
import Pageobjects.LoginPageObject.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ListofservicesTest {
    WebDriver driver;


    @Test
    public void checkingservices1() {
        driver = new EdgeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        String Username = "abc01";
        String Password = "AbcXyz002";
    ListOfServices liststext =new ListOfServices(driver);
    liststext.enterusername(Username);
        liststext.enterpassword(Password);
        liststext.clicklogin();
        List<WebElement> lists =liststext.getserviceslisttext();
        for (WebElement servicelists : lists) {
            String value = servicelists.getText();
            System.out.println(value);

     /*  List<WebElement> Lists = driver.findElements(By.xpath("//div[@id='leftPanel']//ul//li"));
        for (WebElement servicelists : Lists) {
            String value = servicelists.getText();
            System.out.println(value)
*/
        }


    }}



