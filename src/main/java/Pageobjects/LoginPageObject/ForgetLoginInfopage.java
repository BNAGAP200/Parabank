package Pageobjects.LoginPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetLoginInfopage {
    @FindBy(xpath="//a[normalize-space()='Forgot login info?']")
    public WebElement forgetinfolink;

    @FindBy(xpath = "//div[@id='rightPanel']")
    public WebElement consumerdetailpanel;

    @FindBy(id="firstName")
    public WebElement firstname;

    @FindBy(id="lastName")
    public WebElement lastname;

    @FindBy(id="address.street")
    public WebElement addressstreet;

    @FindBy(id="address.city")
    public  WebElement addresscity;

    @FindBy(id="address.state")
    public WebElement addressstate;

    @FindBy(id="address.zipCode")
    public WebElement addresszipcode;

    @FindBy(id="ssn")
    public WebElement ssn;

    public ForgetLoginInfopage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    public void setForgetinfolink(){
        forgetinfolink.click();
    }
    public void setConsumerdetailpanel(){
        System.out.println(consumerdetailpanel.getText());
    }

    public void setFirstname(){
        firstname.sendKeys("abc");
    }
    public void setLastname(){
        lastname.sendKeys("xyz");
    }
    public void setAddressstreet(){
        addressstreet.sendKeys("LakeStreet");
    }
    public void setAddresscity(){
        addresscity.sendKeys("LN");
    }
    public void setAddressstate(){
        addressstate.sendKeys("CA");
    }

    public void setAddresszipcode(){
        addresszipcode.sendKeys("123456");
    }
    public void setSsn(){
        ssn.sendKeys("xyw");
    }
}
