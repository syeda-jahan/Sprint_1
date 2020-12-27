package Pages.Scholastic;

import BasePage.BasePages;
import org.openqa.selenium.By;

public class CustomizeYourExperience extends BasePages {
    //locators
    By readingLevel = By.xpath("//option[@label='Guided Reading Level (GRL)']");
    By continueSite = By.xpath("//button[@name='dwfrm_profileselection_confirmed']");

    //Methods
    public void selectReadingLevel(String data){
        selectDropdownUsingVisibleText(readingLevel,"Guided Reading Level (GRL)");
    }
    public void setContinueSite(){
        clickThis(continueSite);
    }



}
