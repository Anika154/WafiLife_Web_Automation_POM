package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterPage;
import utilities.DriverSetUp;

public class TestRegisterPage extends DriverSetUp {

    RegisterPage registerPage = new RegisterPage();


    @Test
    public void testRegisterProcess(){
        getDriver().get(registerPage.registerLink);
//        registerPage.clickOnElement(registerPage.registerLink);
        registerPage.writeOnElement(registerPage.name, "Orin");
        registerPage.writeOnElement(registerPage.phoneNumber, "01906047408");
        registerPage.writeOnElement(registerPage.registerEmail, "orin@gmail.com");
        registerPage.writeOnElement(registerPage.registerPassword, "123456");
        registerPage.writeOnElement(registerPage.confirmPassword, "123456");
        registerPage.addScreenShot("After Completing The Registration");
        registerPage.clickOnElement(registerPage.registerBtn);
    }
    @Test
    public void testRegisterURL(){
        getDriver().get(registerPage.registerLink);
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.wafilife.com/my-account");
    }

    @Test
    public void testRegisterElement(){
        getDriver().get(registerPage.registerLink);
        Assert.assertTrue(getDriver().findElement(By.xpath("//h2[contains(text(),'রেজিস্টার')]")).isDisplayed(),"রেজিস্টার");
    }

    @Test
    public void testRegisterTitle() {
        getDriver().get(registerPage.registerLink);
        Assert.assertEquals(getDriver().getTitle(),"আমার অ্যাকাউন্ট");
    }

    @Test
    public void testHoverOnRegisterButton() throws InterruptedException {
        getDriver().get(registerPage.registerLink);
        WebElement elementToHover = getDriver().findElement(registerPage.registerBtn);
        registerPage.hoverOverElement(elementToHover);
    }



}
