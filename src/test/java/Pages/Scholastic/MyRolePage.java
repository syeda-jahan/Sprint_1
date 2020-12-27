package Pages.Scholastic;

import BasePage.BasePages;
import org.openqa.selenium.By;

public class MyRolePage extends BasePages {
    //locators
    By roleText = By.xpath("//div[text()='Teacher (by Grade)']");
    By gradeText = By.xpath("//div[@class='selected-option input-select noscroll");
    By noOfStudents = By.xpath("//input[@id='dwfrm_myrole_students']");
    By roleNext = By.xpath("//button[@name='dwfrm_myrole_findgrade']");


    //Methods
    public void selectRole(String data){
        selectDropdownUsingVisibleText(roleText,"Teacher(by Grade)");
    }
    public void selectGrade(String data){
        selectDropdownUsingVisibleText(gradeText,"1st Grade");

    }
    public void setNoOfStudents(String data){
        type(noOfStudents, "20");
    }
    public void clicknext() {
        clickThis(roleNext);
    }

}
