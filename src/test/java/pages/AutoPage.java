package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoPage {

    public AutoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='fa fa-home']")
    public WebElement homepagelink;

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement singupbutton;

    @FindBy(xpath = "//li[10]")
    public WebElement loggedtext;

    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteacc;

    @FindBy(xpath = "//h2[@data-qa='account-deleted']")
    public  WebElement accdeleted;
}
