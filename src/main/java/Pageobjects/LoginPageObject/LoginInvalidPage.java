package Pageobjects.LoginPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginInvalidPage {
    @FindBy(xpath = "//input[@name='username']")

    public WebElement usernametextfield;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordtextfield;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement Loginbutton;
    public  LoginInvalidPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enternousername(String Usernamedata){
        usernametextfield.sendKeys(Usernamedata);
    }
    public void enternopassword(String Passworddata) {
        passwordtextfield.sendKeys(Passworddata);
    }
    public void clicklogin(){
        Loginbutton.click();
    }

}
