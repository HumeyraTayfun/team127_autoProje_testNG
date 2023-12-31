package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class senayda {

    @Test
    public void testCase05() {

        // 1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));

        //3. Verify that home page is visible successfully
        String expectedUrl = "https://www.automationexercise.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        //4. Click on 'Signup / Login' button
        AutoPage autoPage = new AutoPage();
        autoPage.signupButonu.click();

        //5. Verify 'New User Signup!' is visible
        Assert.assertTrue(autoPage.newUserYaziElementi.isDisplayed());

        //6. Enter name and already registered email address
        autoPage.nameButton.sendKeys(ConfigReader.getProperty("usedName"));
        autoPage.emailButton.sendKeys(ConfigReader.getProperty("usedEmail"));

        //7. Click 'Signup' button
        autoPage.signupButton.click();

        //8. Verify error 'Email Address already exist!' is visible
        Assert.assertTrue(autoPage.hataMesaji.isDisplayed());

        Driver.quitDriver();
    }
}
