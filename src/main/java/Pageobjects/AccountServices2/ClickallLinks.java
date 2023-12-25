package Pageobjects.AccountServices2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ClickallLinks {
    @FindBy(xpath = "//input[@name='username']")

    public WebElement usernametextfield;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordtextfield;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement Loginbutton;
    @FindBy(xpath="//div[@id='leftPanel']//ul//li")
     public List<WebElement> linkList;
    public ClickallLinks(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterusername(String Usernamedata){
        usernametextfield.sendKeys(Usernamedata);
    }
    public void enterpassword(String Passworddata) {
        passwordtextfield.sendKeys(Passworddata);
    }
    public void clicklogin(){
        Loginbutton.click();
    }
    public List<WebElement> setlinklist(){
        return  linkList;


}

}
