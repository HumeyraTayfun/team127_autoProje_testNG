package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class humeyra {

    @Test
    public void testcase12(){
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));

        //     3. Verify that home page is visible successfully
        String expectedUrl="https://automationexercise.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        ReusableMethods.bekle(3);

        //4. Click 'Products' button
       AutoPage autoPage=new AutoPage();
        autoPage.productsLinki.click();

        //5. Hover over first product and click 'Add to cart'
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",autoPage.urunResmi);
        ReusableMethods.bekle(2);

        autoPage.addToCart.click();
        ReusableMethods.bekle(2);
        //       6. Click 'Continue Shopping' button
        autoPage.continueShopping.click();
        ReusableMethods.bekle(2);

        //7. Hover over second product and click 'Add to cart'


        // Actions actions=new Actions(Driver.getDriver());
        // actions.moveToElement(automationPage.urunResmi2);
        ReusableMethods.bekle(2);
        autoPage.addToCart2.click();
        ReusableMethods.bekle(2);
        //      8. Click 'View Cart' button
        autoPage.viewCart.click();
        //9. Verify both products are added to Cart
        Assert.assertTrue(autoPage.BlueTopInCart.isDisplayed());
        Assert.assertTrue(autoPage.MenTshirtInCart.isDisplayed());

        //10. Verify their prices, quantity and total price
        String expectedPrice=autoPage.price1.getText();
        String actualTotalPrice=autoPage.totalprice1.getText();
        Assert.assertEquals(actualTotalPrice,expectedPrice);

        String expectedquantity="1";
        String actualquantity=autoPage.quantity1.getText();
        Assert.assertEquals(actualquantity,expectedquantity);
        Driver.quitDriver();



    }
}



