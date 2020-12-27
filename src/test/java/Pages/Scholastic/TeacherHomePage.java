package Pages.Scholastic;

import BasePage.BasePages;
import org.openqa.selenium.By;

public class TeacherHomePage extends BasePages {
    By classCode = By.xpath("//div[text()='ZXWY2']");
    By arrowDown = By.xpath("//span[@class='fa-arrowdown']");
    By profile =By.xpath("//a[@title='Profile']");


    public void codeText(){
        getTextSearch(classCode);
    }
    public void clickArrow(){
        clickThis(arrowDown);
    }
    public void clickProfile(){
        clickThis(profile);
    }


}
