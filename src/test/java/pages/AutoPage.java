package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoPage {

    public AutoPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupButonu;

    @FindBy (xpath = "//*[text()='New User Signup!']")
    public WebElement newUserYaziElementi;

    @FindBy (xpath = "//*[@data-qa='signup-name']")
    public WebElement nameButton;

    @FindBy (xpath = "//*[@data-qa='signup-email']")
    public WebElement emailButton;

    @FindBy (xpath = "//*[@data-qa='signup-button']")
    public WebElement signupButton;

    @FindBy (xpath = "//*[text()='Email Address already exist!']")
    public WebElement hataMesaji;


}
