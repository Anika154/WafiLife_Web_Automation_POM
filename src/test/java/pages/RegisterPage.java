package pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage {

    public String registerLink = "https://www.wafilife.com/my-account";
    public By name = By.xpath("//input[@id='reg_billing_first_name']");
    public By phoneNumber = By.xpath("//input[@id='reg_billing_phone']");
    public By registerEmail = By.xpath("//input[@id='reg_email']");
    public By registerPassword = By.xpath("//input[@id='reg_password']");
    public By confirmPassword = By.xpath("//input[@id='reg_confirm_password']");
    public By registerBtn = By.xpath("//input[@name='register']");

}