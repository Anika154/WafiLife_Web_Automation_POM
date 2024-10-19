package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AuthorPage;
import pages.HomePage;
import utilities.DriverSetUp;

public class TestAuthorPage extends DriverSetUp {
    AuthorPage authorPage = new AuthorPage();
    HomePage homePage = new HomePage();


    @Test
    public void authorPageTest() {
        getDriver().get(authorPage.authorPageURL);
        authorPage.clickOnElement(authorPage.author);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,950)", "");
        authorPage.clickOnElement(authorPage.nextPage);
        authorPage.clickOnElement(authorPage.selectAuthor);
        authorPage.clickOnElement(authorPage.bookDetails);
        authorPage.clickOnElement(authorPage.viewBook);

        authorPage.clickOnElement(authorPage.closeDetails);
        authorPage.clickOnElement(authorPage.orderBtn);
        authorPage.clickOnElement(authorPage.closeOrder);
        authorPage.clickOnElement(authorPage.viewCart);
        authorPage.clickOnElement(authorPage.orderBtnCart);
    }

    @Test
    public void testHoverOnWriter() throws InterruptedException {
        getDriver().get(homePage.homePageURL);
        WebElement elementToHover = getDriver().findElement(authorPage.author);
        authorPage.hoverOverElement(elementToHover);
        Thread.sleep(1000);
    }

    @Test
    public void testAuthorName() {
        getDriver().get(authorPage.selectAuthorURL);
        Assert.assertTrue(getDriver().findElement(By.xpath("//h3[normalize-space()='Md. Liton Ali']")).isDisplayed(),"Md. Liton Ali");
    }

    @Test
    public void testAuthorPageTitle(){
        getDriver().get(authorPage.selectAuthorURL);
        Assert.assertEquals(getDriver().getTitle(),"English & Bangla Islamic Books by Authors | Wafilife");
    }

    @Test
    public void testAuthorPageURL(){
        getDriver().get(authorPage.selectAuthorURL);
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.wafilife.com/cat/books/author/page/2");
    }





}
