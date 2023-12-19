package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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







}
