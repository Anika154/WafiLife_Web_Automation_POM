package testCases;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.DriverSetUp;

public class TestHomePage extends DriverSetUp {

    HomePage homePage = new HomePage();

    @Test (description = "Test Home Page")
    @Description("Test Results after ADD TO Cart")
     public void testHomePageProcess() throws InterruptedException {
         getDriver().get(homePage.homePageURL);
        homePage.writeOnElement(homePage.name,"Orin");
        homePage.writeOnElement(homePage.phoneNumber,"01711369253");
        homePage.writeOnElement(homePage.email,"orin@gmail.com");
        homePage.selectWithVisibleText(homePage.area,"শ্যামলী");
        homePage.writeOnElement(homePage.address,"house #9-e, road #1, shaymoli, 1207");

//        js.executeScript("window.scrollBy(0,950)", "");
        homePage.clickOnElement(homePage.finalCompleteOrder);
        homePage.addScreenShot("Completing the Order");
        Assert.assertTrue(getDriver().findElement(By.xpath("//p[contains(text(),'আপনাকে ধন্যবাদ। অর্ডারটি সাবমিট হয়েছে।')]")).isDisplayed(),"\"আপনাকে ধন্যবাদ। অর্ডারটি সাবমিট হয়েছে।");
//        Thread.sleep(1000);
     }



}
