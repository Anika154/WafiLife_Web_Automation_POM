ackage pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
    public String homePageURL = "https://www.wafilife.com/";
    public By searchInput = By.xpath("//div[@class='header_search']//input[@id='freeSearchBoxWeb']");
    public By searchBtn = By.xpath("//div[@class='header_search']//button[@type='submit']");
    public By selectBook = By.xpath("//a[contains(text(),'বৈষম্য বিরোধী আন্দোলন')]");



}
