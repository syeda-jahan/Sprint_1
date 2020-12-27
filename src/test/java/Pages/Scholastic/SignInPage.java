package Pages.Scholastic;

import BasePage.BasePages;
import org.openqa.selenium.By;

public class SignInPage extends BasePages {
    By signInButton =By.xpath("//button[@id='loginModalBtn']");

    public void clickSignInButton(){
        clickThis(signInButton);
    }


}
