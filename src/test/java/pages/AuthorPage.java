package pages;

import org.openqa.selenium.By;

public class AuthorPage extends BasePage{
    public String authorPageURL = "https://www.wafilife.com/cat/books/author";
    public By author = By.xpath("//span[@class='menu-label-level-0'][contains(text(),'লেখক')]");
    public By nextPage = By.xpath("//a[contains(text(),'→')]");
    public By selectAuthor = By.xpath("//h3[normalize-space()='Md. Liton Ali']");
    public By bookDetails = By.xpath("//a[normalize-space()='Introduction to Business']");
    public By viewBook = By.xpath("//button[contains(text(),'একটু পড়ে দেখুন')]");
    public By closeDetails = By.xpath("//i[@class='fa fa-times-circle']");
}
