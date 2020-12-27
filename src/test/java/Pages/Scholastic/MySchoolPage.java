package Pages.Scholastic;

import BasePage.BasePages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MySchoolPage extends BasePages {

    //locators
    By zipCode = By.xpath("//input[@placeholder='Enter Zip Code']");
    By search = By.xpath("//button[@id='button-search']");
    By searchSchool = By.xpath("//input[@id='dwfrm_searchschool_schoolvalue']");
    By nextButton = By.xpath("//button[@name='dwfrm_searchschool_findnext']");

    //Methods
    public void enterZipCode(String input){
        type(zipCode,"10012");
    }
    public void clickSearch(){
        clickThis(search);
   }
    public void selectSchoolName(String data){
        type(searchSchool,"Scholastic+Book+Clubs");
   }
    public void clickNextButton(){
        clickThis(nextButton);
   }






}
