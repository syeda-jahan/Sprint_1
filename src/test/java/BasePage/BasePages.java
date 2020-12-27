package BasePage;


import DriverWrapper.Web;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import static DriverWrapper.Web.*;

public class BasePages {

    Alert alert;

    public WebElement findElementUsingFluentWait(final By locator) {
        Wait fWait = new FluentWait(getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .withMessage("Element is not found after 30 seconds of wait");

        WebElement element = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });

        return element;
    }

    public void clearThis(By locator){
        findElementUsingFluentWait(locator).clear();
    }
    public void type(By locator, String data) {
        findElementUsingFluentWait(locator).sendKeys(data);
    }

    public void clickThis(By locator) {
        findElementUsingFluentWait(locator).click();
    }

    public boolean isElementDisplayed(By locator) {
        return findElementUsingFluentWait(locator).isDisplayed();
    }

    /**
     * select any value form any dropdown (locator, String)
     *
     * WebElement date = driver.findElement(By.id("month"));
     * Select dateDropdown = new Select(date);
     * dateDropdown.selectByVisibleText("Feb");
     *
     */
    public void selectDropdownUsingVisibleText(By locator, String data) {
        WebElement dropdownElement = findElementUsingFluentWait(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(data);
    }
    public String getWebpageTitle() {
       return Web.getDriver().getTitle();
    }
    public String getTextSearch(By locator){
       return findElementUsingFluentWait(locator).getText();
    }

    public void scrollDown(int pixelsDown){
        //String pixelsDownStr = String.valueOf(pixelsDown);
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        js.executeScript("scrollBy(0,"+pixelsDown+");");

    }
    public Set<String> getAllwindowHandles(){
        return Web.getDriver().getWindowHandles();
    }

    public String getCurrentWindowHandle(){
        return Web.getDriver().getWindowHandle();
    }
    public void switchToNewWindow(String handle){
        Web.getDriver().switchTo().window(handle);
    }

}
