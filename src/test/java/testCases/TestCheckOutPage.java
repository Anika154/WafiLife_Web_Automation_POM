package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckOutPage;
import utilities.DriverSetUp;

public class TestCheckOutPage extends DriverSetUp {
    CheckOutPage checkOutPage = new CheckOutPage();


    @Test
    public void testCheckOutProcess(){
        getDriver().get(checkOutPage.orderURL);
        checkOutPage.clickOnElement(checkOutPage.orderBtn);
        checkOutPage.clickOnElement(checkOutPage.orderBtn2);
        checkOutPage.writeOnElement(checkOutPage.name,"Orin");
        checkOutPage.writeOnElement(checkOutPage.phoneNumber,"01711369253");
        checkOutPage.writeOnElement(checkOutPage.email,"orin@gmail.com");
        checkOutPage.selectWithVisibleText(checkOutPage.area,"শ্যামলী");
        checkOutPage.writeOnElement(checkOutPage.address,"house #9-e, road #1, shaymoli, 1207");

        checkOutPage.clickOnElement(checkOutPage.completeOrderBtn);
//        checkOutPage.addScreenShot("Completing the Order");
        Assert.assertTrue(getDriver().findElement(By.xpath("//p[contains(text(),'আপনাকে ধন্যবাদ। অর্ডারটি সাবমিট হয়েছে।')]")).isDisplayed(),"\"আপনাকে ধন্যবাদ। অর্ডারটি সাবমিট হয়েছে।");
    }

    @Test
    public void testCheckOutPageTitle(){
        getDriver().get(checkOutPage.checkOutURL);
        Assert.assertEquals(getDriver().getTitle(),"শপিং ব্যাগ");
    }


    @Test
    public void testOrderBtnVisibility(){
        getDriver().get(checkOutPage.orderURL);
        checkOutPage.clickOnElement(checkOutPage.orderBtn);
        checkOutPage.clickOnElement(checkOutPage.orderBtn2);
        Assert.assertTrue(checkOutPage.isElementVisible(checkOutPage.completeOrderBtn));
    }

    @Test
    public void testDistrictVisibility(){
        getDriver().get(checkOutPage.orderURL);
        checkOutPage.clickOnElement(checkOutPage.orderBtn);
        checkOutPage.clickOnElement(checkOutPage.orderBtn2);
        Assert.assertEquals(checkOutPage.getElementText(checkOutPage.district), "Dhaka");
    }

    @Test
    public void testCheckOutWithInvalidEmail() {
        getDriver().get(checkOutPage.orderURL);
        checkOutPage.clickOnElement(checkOutPage.orderBtn);
        checkOutPage.clickOnElement(checkOutPage.orderBtn2);
        checkOutPage.writeOnElement(checkOutPage.email,"orin@gmail.com");
        checkOutPage.clickOnElement(checkOutPage.completeOrderBtn);
//        checkOutPage.addScreenShot("Checkout with invalid Email");
        Assert.assertEquals(checkOutPage.getElementText(checkOutPage.invalidEmailError),"ইমেইল অ্যাড্রেসটি সঠিক নয়");
    }

    @Test
    public void testCheckOutWithInvalidPhoneNumber()  {
        getDriver().get(checkOutPage.orderURL);
        checkOutPage.clickOnElement(checkOutPage.orderBtn);
        checkOutPage.clickOnElement(checkOutPage.orderBtn2);
        checkOutPage.writeOnElement(checkOutPage.name,"Orin");
        checkOutPage.writeOnElement(checkOutPage.phoneNumber,"21332324241143");
        checkOutPage.writeOnElement(checkOutPage.email,"orin@gmail.com");
        checkOutPage.selectWithVisibleText(checkOutPage.area,"শ্যামলী");
        checkOutPage.writeOnElement(checkOutPage.address,"house #9-e, road #1, shaymoli, 1207");
        checkOutPage.clickOnElement(checkOutPage.completeOrderBtn);
//        checkOutPage.addScreenShot("Checkout with Invalid Phone Number");
        Assert.assertEquals(checkOutPage.getElementText(checkOutPage.invalidPhoneNumberError),"১১ সংখ্যার ফোন নাম্বার ইংরেজিতে দিন");
    }


}
