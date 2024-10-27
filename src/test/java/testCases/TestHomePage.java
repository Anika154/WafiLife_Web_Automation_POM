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

//    @Test (description = "Test Home Page")
//    @Description("Test Results after ADD TO Cart")
//     public void testHomePageProcess() {
//
//     }
@Test
    public void testSearchProcess(){
        getDriver().get(homePage.homePageURL);
        homePage.clickOnElement(homePage.searchInput);
        homePage.writeOnElement(homePage.searchInput, "বৈষম্য বিরোধী আন্দোলন");
        homePage.clickOnElement(homePage.searchBtn);
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.wafilife.com/search?wpsolr_q=%E0%A6%AC%E0%A7%88%E0%A6%B7%E0%A6%AE%E0%A7%8D%E0%A6%AF+%E0%A6%AC%E0%A6%BF%E0%A6%B0%E0%A7%8B%E0%A6%A7%E0%A7%80+%E0%A6%86%E0%A6%A8%E0%A7%8D%E0%A6%A6%E0%A7%8B%E0%A6%B2%E0%A6%A8");
        Assert.assertEquals(getDriver().getTitle(), "Books, Clothes, Perfume & Gadgets | Wafilife");
    }

    @Test
    public void testNewBook(){
        getDriver().get(homePage.homePageURL);
        Assert.assertTrue(getDriver().findElement(By.xpath("//h3[contains(text(),'নতুন প্রকাশিত বই')]")).isDisplayed(),"নতুন প্রকাশিত বই");
    }

    @Test
    public void testFooter(){
        getDriver().get(homePage.homePageURL);
        homePage.scrollPageDown();
        Assert.assertTrue(getDriver().findElement(By.xpath("//div[@class='copyright']")).isDisplayed(),"Copyright © 2024 Wafilife.com");
        Assert.assertTrue(getDriver().findElement(By.xpath("//h3[contains(text(),'যোগাযোগ')]")).isDisplayed());
    }



}
