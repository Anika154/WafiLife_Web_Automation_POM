package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import static utilities.DriverSetUp.getDriver;

public class BasePage {
        public WebDriverWait wait;
    public WebElement getElement(By locator){
        return waitForElementPresent(locator);
//     return getDriver().findElement(locator);

    }

    public void clickOnElement(By locator){
        waitForElementToBeClickable(locator);
        getElement(locator).click();
    }

    public boolean isElementVisible(By locator){
        try {
            return getDriver().findElement(locator).isDisplayed();
        } catch (Exception e){
            return false;
        }

    }

    public WebElement waitForElementPresent(By locator){
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void waitForElementToBeClickable(By locator){
//        getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void writeOnElement(By locator , String text){
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }

    public void selectWithVisibleText(By selector, String visibleText){
        Select select = new Select(getElement(selector));
        select.selectByVisibleText(visibleText);
    }

    public String getElementText(By locator){
        return getElement(locator).getText();

    }

    public void hoverOverElement(WebElement element){
        Actions action = new Actions(getDriver());
        action.moveToElement(element).build().perform();

    }

    public void addScreenShot(String name){
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
    }

}
