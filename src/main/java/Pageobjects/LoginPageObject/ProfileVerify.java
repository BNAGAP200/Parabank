package Pageobjects.LoginPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfileVerify {

    @FindBy(xpath = "//p[@class='smallText']")

    public WebElement msg;

    @FindBy(xpath = "//h1[normalize-space()='Accounts Overview']")

    public WebElement header;

    @FindBy(xpath = "//table[@id='accountTable']")

    public WebElement tableslist;

    @FindBy(xpath = "//tr[@class='ng-scope']//td")

    public List<WebElement> balancenos;

    public ProfileVerify(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getWelcomeMsg() {
        return msg.getText();
    }

    public String getHeader() {
        return header.getText();
    }

    public String getTableText() {
        return tableslist.getText();
    }


    public List<WebElement> getBalanceNos() {
        return balancenos;
    }

}



