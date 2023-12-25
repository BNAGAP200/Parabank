package ParabankReg;

import Pageobjects.Regpage.RegPageNodata;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class RegPageNoDataTest{
    WebDriver driver;

    @BeforeTest
    public void LinkLaunch1() {
        driver = new EdgeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=C4F1D02F39B6F22D3ADCFB6C7C9D478D");
    }

    @Test
    public void FillingDetails1() {
        RegPageNodata regno = new RegPageNodata(driver);
        regno.setRegLinkclick();
        regno.setFirstname();
        regno.setLastname();
        regno.setAddress();
        regno.setCity();
        regno.setState();
        regno.setZipcode();
        regno.setPhonenumber();
        regno.setSsn();
        regno.setUsername();
        regno.setPassword();
        regno.setRepeatedpassword();
        regno.setRegclickbutton();
       regno.seterrormsg();
        List<WebElement>  errormsg =regno.seterrormsg();
        for(WebElement msg : errormsg){
            String text = msg.getText();
            System.out.println(text);
       }
    }


    }



