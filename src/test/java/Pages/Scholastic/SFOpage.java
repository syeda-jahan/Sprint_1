package Pages.Scholastic;

import BasePage.BasePages;
import org.openqa.selenium.By;

public class SFOpage extends BasePages {

    By name = By.xpath("//input[@name='student-name']");
    By itemNo =By.xpath("//input[@name='item-number']");
    By add = By.xpath("//button[@id='btn-add']");
    By errorItemNo = By.xpath("//span[text()='Please enter a valid item number.']");

    public void enterName(String data){
        type(name,"Harry");
    }
    public void enterItemNo(String data){
        type(itemNo, "111");
    }
    public void clickAdd(){
        clickThis(add);
    }


    public boolean iserrorMessageDisplayed() {
        return isElementDisplayed(errorItemNo);
    }


}
