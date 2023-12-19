package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoPage {

    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[1]")
    public WebElement addToCart;

    @FindBy(xpath = "(//img[@alt='ecommerce website products'])[1]")
    public WebElement urunResmi;

    @FindBy(xpath = "//li[2]")
    public WebElement productsLinki;

    @FindBy(xpath = "//a[@data-product-id='2']")
    public WebElement addToCart2;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCart;

    @FindBy(xpath = "//*[text()='Blue Top']")
    public WebElement BlueTopInCart;

    @FindBy(xpath = "//*[text()='Men Tshirt']")
    public WebElement MenTshirtInCart;

    @FindBy(xpath = "(//*[@class='cart_total_price'])[1]")
    public WebElement totalprice1;

    @FindBy(xpath = "(//*[@class='cart_price'])[1]")
    public WebElement price1;

    @FindBy(xpath = "(//button[@class='disabled'])[1]")
    public WebElement quantity1;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    public WebElement continueShopping;

}
