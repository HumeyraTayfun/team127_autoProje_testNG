package tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class ihsan {

    @Test
    public void testCase3(){
        // 1- Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));

        // 2- Verify that home page is visible successfully
        SoftAssert softAssert = new SoftAssert();
        AutoPage autoPage = new AutoPage();

        softAssert.assertTrue(autoPage.anaSayfaSlider.isDisplayed(),
                "Anasayfada değilsiniz!");

        // 3- Click on 'Signup / Login' button
        autoPage.signupLoginButonu.click();

        // 4- Verify 'Login to your account' is visible
        softAssert.assertTrue(autoPage.loginToYourAccount.isDisplayed(),
                "'Login to your account' yazmıyor!");

        // 5- Enter incorrect email address and password
        autoPage.emailKutusu.sendKeys(ConfigReader.getProperty("yanlisEmail"));
        autoPage.şifreKutusu.sendKeys(ConfigReader.getProperty("yanlisSifre"));

        // 6- Click 'login' button
        autoPage.loginButonu.click();

        // 7- Verify error 'Your email or password is incorrect!' is visible
        softAssert.assertTrue(autoPage.loginHataMesajı.isDisplayed(),
                "Hata mesajı gözükmedi!");

        Driver.quitDriver();
    }
    @Test
    public void testCase14(){
        // 1- Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));

        // 2- Verify that home page is visible successfully


        // 3- Add products to cart


        // 4- Click 'Cart' button


        // 5- Verify that cart page is displayed


        // 6- Click Proceed To Checkout


        // 7- Click 'Register / Login' button


        // 8- Fill all details in Signup and create account


        // 9- Verify 'ACCOUNT CREATED!' and click 'Continue' button


        // 10- Verify ' Logged in as username' at top


        // 11- Click 'Cart' button


        // 12- Click 'Proceed To Checkout' button


        // 13- Verify Address Details and Review Your Order


        // 14- Enter description in comment text area and click 'Place Order'


        // 15- Enter payment details: Name on Card, Card Number, CVC, Expiration date


        // 16- Click 'Pay and Confirm Order' button


        // 17- Verify success message 'Your order has been placed successfully!'


        // 18- Click 'Delete Account' button


        // 19- Verify 'ACCOUNT DELETED!' and click 'Continue' button


        Driver.quitDriver();

    }
    @Test
    public void testCase19(){
        // 1- Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));

        // 2- Click on 'Products' button


        // 3- Verify that Brands are visible on left side bar


        // 4- Click on any brand name


        // 5- Verify that user is navigated to brand page and brand products are displayed


        // 6- On left side bar, click on any other brand link


        // 7- Verify that user is navigated to that brand page and can see products


        Driver.quitDriver();
    }
}
