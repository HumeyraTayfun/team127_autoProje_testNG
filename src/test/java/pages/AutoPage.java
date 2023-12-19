package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoPage {

    public AutoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@href='/login']")
    public WebElement link;


    @FindBy(xpath = "//*[h2='Login to your account']")
    public WebElement Logintoyouraccount;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailauto;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//*[@type='submit'][1]")
    public WebElement autoLogin;

    @FindBy(xpath = "//li[10]")
    public WebElement Loggedinas;

    @FindBy(xpath = "//a[@href='/delete account")
    public WebElement deleteaccount;
}