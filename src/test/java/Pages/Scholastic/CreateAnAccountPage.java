package Pages.Scholastic;

import BasePage.BasePages;
import org.openqa.selenium.By;

public class CreateAnAccountPage extends BasePages {
    //locators
    By clickOnTeacher = By.xpath("//span[text()='Teacher/Administrator/Homeschooler']/following::input[@type='radio']");
    By clickOnNext = By.xpath("//a[@class='button-next']");


    //Methods
    public void selectTeacherButton() {
        clickThis(clickOnTeacher);
    }
    public void clickNextButton(){
        clickThis(clickOnNext);
    }

}
