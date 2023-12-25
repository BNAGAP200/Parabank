package Pageobjects.AccountServices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckingLinks {
    @FindBy(xpath ="//div[@id='leftPanel']//ul//li")
    public List<WebElement> listoflinks;

    public  CheckingLinks(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public List<WebElement> setlistoflinks(){
        return  listoflinks;
        }
    }
