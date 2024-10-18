package testCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AuthorPage;
import pages.HomePage;
import utilities.DriverSetUp;

public class TestAuthorPage extends DriverSetUp {
    AuthorPage authorPage = new AuthorPage();
    HomePage homePage = new HomePage();


    @Test
    public void authorPageTest() throws InterruptedException {
        getDriver().get(authorPage.authorPageURL);
        authorPage.clickOnElement(authorPage.author);
        authorPage.clickOnElement(authorPage.nextPage);
        authorPage.clickOnElement(authorPage.selectAuthor);
        authorPage.clickOnElement(authorPage.bookDetails);
        authorPage.clickOnElement(authorPage.viewBook);
        Thread.sleep(1000);
        authorPage.clickOnElement(authorPage.closeDetails);
    }

    @Test
    public void hoverOnWriter() throws InterruptedException {
        getDriver().get(homePage.homePageURL);
        WebElement elementToHover = getDriver().findElement(authorPage.author);
        authorPage.hoverOverElement(elementToHover);
        Thread.sleep(1000);
    }


}
