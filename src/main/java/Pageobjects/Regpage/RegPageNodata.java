package Pageobjects.Regpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegPageNodata {

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
    @FindBy(xpath = "//form[@id='customerForm']//tr//td[3]")
    public List< WebElement> errormsg;

    public RegPageNodata(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void formtitles() {
        FormTitles.click();
    }

    public void setRegLinkclick() {
        RegLinkclick.click();
    }

    public void setFirstname() {
        Firstname.sendKeys("");

    }

    public void setLastname() {
        Lastname.sendKeys("");
    }

    public void setAddress() {
        address.sendKeys("");
    }

    public void setCity() {
        city.sendKeys("");
    }

    public void setState() {
        state.sendKeys("");
    }

    public void setZipcode() {
        zipcode.sendKeys("");
    }

    public void setPhonenumber() {
        phonenumber.sendKeys("");
    }

    public void setSsn() {
        ssn.sendKeys("");
    }

    public void setUsername() {
        username.sendKeys("");
    }

    public void setPassword() {
        password.sendKeys("");
    }

    public void setRepeatedpassword() {
        repeatedpassword.sendKeys("");
    }

    public void setRegclickbutton() {
        regclickbutton.click();
    }


       public List<WebElement> seterrormsg(){
        return errormsg;
    }

}