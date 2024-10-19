package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
    public String homePageURL = "https://www.wafilife.com/";
    public By name = By.xpath("//input[@id='billing_first_name']");
    public By phoneNumber = By.xpath("//input[@id='billing_phone']");
    public By email = By.xpath("//input[@id='billing_email']");
    public By area = By.xpath("//select[@id='billing_area']");
    public By address = By.xpath("//textarea[@id='billing_address_1']");
    public By finalCompleteOrders = By.xpath("//button[@id='place_order']");


}
