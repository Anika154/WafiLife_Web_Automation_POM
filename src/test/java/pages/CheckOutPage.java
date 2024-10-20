package pages;

import org.openqa.selenium.By;

public class CheckOutPage extends BasePage{

    public String orderURL = "https://www.wafilife.com/%e0%a6%87%e0%a6%a8%e0%a6%9f%e0%a7%8d%e0%a6%b0%e0%a7%81%e0%a6%a1%e0%a6%be%e0%a6%95%e0%a6%b6%e0%a6%a8-%e0%a6%9f%e0%a7%81-%e0%a6%ac%e0%a6%bf%e0%a6%9c%e0%a6%a8%e0%a7%87%e0%a6%b8/dp/356309";
    public By orderBtn = By.xpath("//button[@class='single_add_to_cart_button button alt ']");
    public By orderBtn2 = By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");
    public By name = By.xpath("//input[@id='billing_first_name']");
    public By phoneNumber = By.xpath("//input[@id='billing_phone']");
    public By email = By.xpath("//input[@id='billing_email']");
    public By area = By.xpath("//select[@id='billing_area']");
    public By address = By.xpath("//textarea[@id='billing_address_1']");
    public By cashOnDelivery = By.xpath("//input[@id='payment_method_cod']");
    public By completeOrderBtn = By.xpath("//button[@id='place_order']");
    public String checkOutURL = "https://www.wafilife.com/checkout";
    public By district = By.xpath("//span[@id='select2-billing_state-container']");
    public By invalidEmailError = By.xpath("//li[contains(text(),'ইমেইল অ্যাড্রেসটি সঠিক নয়')]");
    public By invalidPhoneNumberError = By.xpath("//li[contains(text(),'১১ সংখ্যার ফোন নাম্বার ইংরেজিতে দিন')]");


}
