package Pageobjects.Regpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FillingValidData {
    @FindBy(xpath = "//table[@class='form2']//tr//td[1]")
    public WebElement FormTitles;
    @FindBy(xpath = "//a[normalize-space()='Register']")
    public WebElement RegLinkclick;

    @FindBy(id = "customer.firstName")
    public WebElement Firstname;
    @FindBy(id = "customer.lastName")
    public WebElement Lastname;
    @FindBy(id = "customer.address.street")
    public WebElement address;

    @FindBy(id = "customer.address.city")
    public WebElement city;
    @FindBy(id = "customer.address.state")
    public WebElement state;
    @FindBy(id = "customer.address.zipCode")
    public WebElement zipcode;
    @FindBy(id = "customer.phoneNumber")
    public WebElement phonenumber;
    @FindBy(id = "customer.ssn")
    public WebElement ssn;
    @FindBy(id = "customer.username")
    public WebElement username;
    @FindBy(id = "customer.password")
    public WebElement password;

    @FindBy(id = "repeatedPassword")
    public WebElement repeatedpassword;

    @FindBy(xpath = "//input[@value='Register']")
    public WebElement regclickbutton;

    public FillingValidData(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void formtitles() {
        FormTitles.click();
    }

    public void setRegLinkclick() {
        RegLinkclick.click();
    }

    public void setFirstname() {
        Firstname.sendKeys("abc");

    }

    public void setLastname() {
        Lastname.sendKeys("xyz");
    }
    public void setAddress() {
        address.sendKeys("LakeStreet");
    }
    public void setCity() {
        city.sendKeys("LN");
    }
    public void setState() {
        state.sendKeys("CA");
    }
    public void setZipcode() {
       zipcode.sendKeys("123456");
    }
    public void setPhonenumber() {
        phonenumber.sendKeys("123456789");
    }
    public void setSsn() {
        ssn.sendKeys("xyw");
    }
    public void setUsername() {
        username.sendKeys("abc01");
    }
    public void setPassword() {
        password.sendKeys("AbcXyz002");
    }
    public void setRepeatedpassword() {
        repeatedpassword.sendKeys("AbcXyz002");
    }
    public void setRegclickbutton() {
        regclickbutton.click();
    }
}

