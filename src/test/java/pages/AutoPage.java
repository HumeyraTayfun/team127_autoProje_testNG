package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class AutoPage {


    public AutoPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "(//div[@class= 'carousel-inner'])[1]")
    public WebElement homePageSlider;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement loginToYourAccount;

    @FindBy(xpath = "//*[@data-qa='login-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@data-qa='login-password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@data-qa='login-button']")
    public WebElement loginButton;


    @FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement loginErrorMessage;
    @FindBy(xpath = "//*[text()='Category']")
    public WebElement categories;

    @FindBy(xpath = "(//i[@class='fa fa-plus'])[1]")
    public WebElement WomencategoryClick;

    @FindBy(xpath = "//*[@id=\"Women\"]/div/ul/li[1]/a")
    public WebElement dressClick;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement WomenDressProductsText;

    @FindBy(xpath = "(//span[@class='badge pull-right'])[2]")
    public WebElement catagoryMen;

    @FindBy(xpath = "//*[@id=\"Men\"]/div/ul/li[1]/a")
    public WebElement catagoryMenTsort;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement MenProductsText;

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

    @FindBy(xpath = "//a[@href='/delete account")
    public WebElement deleteacount;
    @FindBy(xpath = "//a[@href='/delete account")
    public WebElement delteaccount;
    @FindBy(xpath = "//a[@href='/delete account")
    public WebElement deleteaccont;
}
