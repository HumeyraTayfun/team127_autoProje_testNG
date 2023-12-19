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


}
