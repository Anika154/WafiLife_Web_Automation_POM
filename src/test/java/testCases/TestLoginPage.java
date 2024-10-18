package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LogInPage;
import utilities.DataSet;
import utilities.DriverSetUp;

public class TestLoginPage extends DriverSetUp {
    LogInPage logInPage = new LogInPage();

    @BeforeMethod
    public void navigateToLogInPage(){
        getDriver().get(logInPage.loginUrl);
        logInPage.addScreenShot("Navigate To The LogIn Page");
//        logInPage.doLogin("orin@gmail.com","123456");
    }

    @Test (priority = 1)
    public void testLogInWithoutPassword(){
        logInPage.clickOnElement(logInPage.logInLink);
        logInPage.writeOnElement(logInPage.email,"orin@gmail.com");
        logInPage.clickOnElement(logInPage.logInBtn);
        logInPage.addScreenShot("LogIn Without Password");
        Assert.assertEquals(logInPage.getElementText(logInPage.error), "Error: The password field is empty.");
    }
    @Test (priority = 2)
    public void testLogInWithoutUserName(){
        logInPage.clickOnElement(logInPage.logInLink);
        logInPage.writeOnElement(logInPage.password,"123456");
        logInPage.clickOnElement(logInPage.logInBtn);
        logInPage.addScreenShot("Login Without Username");
        Assert.assertEquals(logInPage.getElementText(logInPage.withoutCredentials), "Error: ইউজার নাম প্রয়োজন");
    }

    @Test (priority = 3)
    public void testLogInWithoutCredentials() {
        logInPage.clickOnElement(logInPage.logInLink);
        logInPage.clickOnElement(logInPage.logInBtn);
        logInPage.addScreenShot("Login Without Credentials");
        Assert.assertEquals(getDriver().getTitle(), "আমার অ্যাকাউন্ট");
    }

    @Test (priority = 4)
    public void testLogInWithValidCredentials(){
        logInPage.clickOnElement(logInPage.logInLink);
        logInPage.writeOnElement(logInPage.email,"orin@gmail.com");
        logInPage.writeOnElement(logInPage.password,"123456");
        logInPage.clickOnElement(logInPage.logInBtn);
        logInPage.addScreenShot("Login With Valid Credentials");
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.wafilife.com/my-account");
    }

    
    @Test(dataProvider = "invalidCredentials", dataProviderClass = DataSet.class)
    public void testLoginWithInvalidCredentials(String email, String password, String error_msg){
        logInPage.clickOnElement(logInPage.logInLink);
        logInPage.writeOnElement(logInPage.email, email);
        logInPage.writeOnElement(logInPage.password, password);
        logInPage.clickOnElement(logInPage.logInBtn);
        logInPage.addScreenShot("After clicking on login button");
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.wafilife.com/my-account");
        Assert.assertEquals(logInPage.getElementText(logInPage.error), error_msg);
    }
}
