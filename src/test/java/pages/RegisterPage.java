package pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage {

    public String registerURL = "https://www.wafilife.com/";
    public By registerLink = By.xpath("//a[@title='আমার অ্যাকাউন্ট']");
    public By name = By.xpath("//input[@id='reg_billing_first_name']");
    public By phoneNumber = By.xpath("//input[@id='reg_billing_phone']");
    public By registerEmail = By.xpath("//input[@id='reg_email']");
    public By registerPassword = By.xpath("//input[@id='reg_password']");
    public By confirmPassword = By.xpath("//input[@id='reg_confirm_password']");
    public By registerBtn = By.xpath("//input[@name='register']");




}