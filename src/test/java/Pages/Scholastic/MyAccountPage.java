package Pages.Scholastic;

import BasePage.BasePages;
import org.openqa.selenium.By;

public class MyAccountPage extends BasePages {
    By classCodeValue = By.xpath("//span[text()='ZXWY2']");
    By addAcard = By.xpath("//a[@class='custom-tooltip tooltipstered']");
    By errorMessage = By.xpath("//div[text()='You can only store three credit cards']");
    By enterOrders = By.xpath("//div[@class='subheader-menu']/following::a[@id='enter-orders']");
    By sfo =By.xpath("//div[@class='subheader-cell first subheader_level_1']/following::li[@ID='student-flyer-orders']");




    public void textCode(){
         getTextSearch(classCodeValue);
     }

    public void clickAddAcard(){
        clickThis(addAcard);
    }
    public boolean isErrorMessageDisplayed(){
        return isElementDisplayed(errorMessage);
    }
    public void clickEnterOrders(){
        clickThis(enterOrders);
    }
    public void clickSFO(){
        clickThis(sfo);
    }



}
