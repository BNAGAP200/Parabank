package Pageobjects.FooterPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FooterAllLinks {
    @FindBy(xpath = "//div[@id='footermainPanel']//li")
    public List<WebElement> checkingalllinks;
    public FooterAllLinks(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }




    public List<WebElement> Links() {
        return checkingalllinks;
    }
}





