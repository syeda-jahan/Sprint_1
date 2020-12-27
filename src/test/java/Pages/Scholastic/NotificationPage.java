package Pages.Scholastic;

import BasePage.BasePages;
import org.openqa.selenium.By;

public class NotificationPage extends BasePages {
    By crossMark = By.xpath("//span[@class='notification-close']");

    public void clickCross (){
        clickThis(crossMark);
    }


}
