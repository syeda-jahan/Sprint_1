package Pages.Scholastic;

import BasePage.BasePages;
import org.openqa.selenium.By;

public class ScholasticHomePage extends BasePages {
    //locators
    public void clickCreateAccount(){
        scrollDown(100);
        //clickThis(Create an Account);
    }

    By createAnAccount = By.xpath("//a[text()='Create an Account']/preceding::div[@class='hide-desktop mobile_nav_menu']");
    By signIn = By.xpath("//a[text()='Sign In']");


    //Method
    public void scrollCreateAnAccount(){
        scrollDown(100);
        clickThis(createAnAccount);
    }
    //public void clickCreateAnAccount(){
   //     clickThis(createAnAccount);
   // }
    public void clickSignIn(){
        clickThis(signIn);
    }

}
