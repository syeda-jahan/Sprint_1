package Pages.Scholastic;

import BasePage.BasePages;
import org.openqa.selenium.By;

public class CreateTeacherAccount extends BasePages {
    //locators
    By selectTitle = By.xpath("//div[text()='Mrs.']");
    By firstName = By.xpath("//input[@id='dwfrm_profile_customer_firstname']");
    By lastName = By.xpath("//input[@id='dwfrm_profile_customer_lastname']");
    By email = By.xpath("//input[@id='dwfrm_profile_customer_email']");
    By password = By.xpath("//input[@id='dwfrm_profile_login_password']");
    By mobNum = By.xpath("//input[@name='dwfrm_profilr_customer_phone']");
    By checkBox = By.xpath("//input[@type='checkbox']");
    By next = By.xpath("//button[@class='button-continue']");




    //Methods
    public void selectTitle(String data){
        selectDropdownUsingVisibleText(selectTitle, "Mrs.");
    }
    public void enterFirstname(String fName){
        type(firstName,"Aurora");
    }
    public void enterLastname(String lName){
        type(lastName,"Gebon");
    }
    public void enterEmailAdd(String data){
        type(email,"aurora@schl.com" );
    }
    public void enterPassword(String data){
        type(password,"aurora2020" );
    }
    public void enterMobNum(String data){
        type(mobNum,"800-444-4444" );
    }
    public void setCheckBox(){
        clickThis(checkBox);
    }
    public void clickNext(){
        clickThis(next);
    }


}
