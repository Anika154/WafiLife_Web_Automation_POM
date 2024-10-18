package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterPage;
import utilities.DriverSetUp;

public class TestRegisterPage extends DriverSetUp {

    RegisterPage registerPage = new RegisterPage();


    @Test
    public void testRegisterProcess(){
        getDriver().get(registerPage.registerURL);
        registerPage.clickOnElement(registerPage.registerLink);
        registerPage.writeOnElement(registerPage.name, "Orin");
        registerPage.writeOnElement(registerPage.phoneNumber, "01906047408");
        registerPage.writeOnElement(registerPage.registerEmail, "orin@gmail.com");
        registerPage.writeOnElement(registerPage.registerPassword, "123456");
        registerPage.writeOnElement(registerPage.confirmPassword, "123456");
        registerPage.clickOnElement(registerPage.registerBtn);
        registerPage.addScreenShot("After Completing The Registration");
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.wafilife.com/my-account");

    }
}
