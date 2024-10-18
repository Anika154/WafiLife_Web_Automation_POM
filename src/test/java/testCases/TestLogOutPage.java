package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.LogOutPage;
import utilities.DriverSetUp;

public class TestLogOutPage extends DriverSetUp {

    LogInPage logInPage = new LogInPage();
    LogOutPage logOutPage = new LogOutPage();

    @BeforeMethod
    public void navigateToLogInPage(){
        getDriver().get(logInPage.loginUrl);
        logInPage.doLogin("orin@gmail.com","123456");
    }

    @Test
    public void testLogOutProcess(){
//        getDriver().get(logInPage.loginUrl);
//        logInPage.clickOnElement(logInPage.logInLink);
//        logInPage.writeOnElement(logInPage.email,"orin@gmail.com");
//        logInPage.writeOnElement(logInPage.password,"123456");
//        logInPage.clickOnElement(logInPage.logInBtn);
        logOutPage.clickOnElement(logOutPage.logOut);
        logOutPage.addScreenShot("After Completing LogOut");
        Assert.assertTrue(getDriver().findElement(By.xpath("//h1[@class='heading-title page-title']")).isDisplayed(),"আমার অ্যাকাউন্ট");
    }
}
