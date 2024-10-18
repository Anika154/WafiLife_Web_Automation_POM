package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public String homePageURL = "https://www.wafilife.com/";
//    public By author = By.xpath("//span[@class='menu-label-level-0'][contains(text(),'লেখক')]");
//    public By nextPage = By.xpath("//a[contains(text(),'→')]");
//    public By selectAuthor = By.xpath("//h3[normalize-space()='Md. Ahsan Ullah']");
//    public By bookDetails = By.xpath("//a[normalize-space()='A Handbook On Vat Return Submission']");
    public By orderBtn = By.xpath("//button[@class='single_add_to_cart_button button alt ']");
    public By completeOrderBtn = By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");
    public By name = By.xpath("//input[@id='billing_first_name']");
    public By phoneNumber = By.xpath("//input[@id='billing_phone']");
    public By email = By.xpath("//input[@id='billing_email']");
    public By area = By.xpath("//select[@id='billing_area']");
    public By address = By.xpath("//textarea[@id='billing_address_1']");
    public By finalCompleteOrder = By.xpath("//button[@id='place_order']");



}
