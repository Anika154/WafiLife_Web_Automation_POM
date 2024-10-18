package pages;

import org.openqa.selenium.By;

public class LogInPage extends BasePage {

    public String loginUrl = "https://www.wafilife.com/";
    public By logInLink = By.xpath("//a[@title='আমার অ্যাকাউন্ট']");
    public By email = By.xpath("//input[@id='username']");
    public By password = By.xpath("//input[@id='password']");
    public By logInBtn = By.xpath("//input[@name='login']");
    public By error = By.xpath("//div[@id='main-module-container']//li[1]");
    public By withoutCredentials = By.xpath("//li[contains(text(),'ইউজার নাম প্রয়োজন')]");


    public void doLogin(String email_txt, String password_txt){
        clickOnElement(logInLink);
        writeOnElement(email, email_txt);
        writeOnElement(password, password_txt);
        clickOnElement(logInBtn);
    }


}
