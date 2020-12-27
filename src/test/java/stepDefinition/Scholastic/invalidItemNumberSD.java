package stepDefinition.Scholastic;

import Pages.Scholastic.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class invalidItemNumberSD {

    ScholasticHomePage hPage = new ScholasticHomePage();
    SignInPage iPage = new SignInPage();
    CreateTeacherAccount tPage = new CreateTeacherAccount();
    NotificationPage nPage = new NotificationPage();
    MyAccountPage mPage = new MyAccountPage();
    SFOpage fPage = new SFOpage();

    @When("^I click in Sign In link$")
    public void signInClick (){
        hPage.clickSignIn();
    }
    @And("^I enter 'aurora@schl.com' in email address$")
    public void enterEmail(String data){
        tPage.enterEmailAdd("aurora@schl.com");
    }
    @And("^I enter 'aurora2020' in password$")
    public void typePassword(String data){
        tPage.enterPassword("aurora2020");
    }
    @And("^I click on Sign In button$")
    public void signInButtonClick(){
        iPage.clickSignInButton();
    }
    @And("^I click on Cross mark in Notification page$")
    public void crossMarkClick(){
        nPage.clickCross();
    }
    @And("^I click on Enter Orders link$")
    public void enterOrdersClick(){
        mPage.clickEnterOrders();
    }
    @And("^I click on Student Flyer Orders link$")
    public void sfoClick(){
        mPage.clickSFO();
    }
    @And("^I enter Student name Harry$")
    public void nameEnter(){
        fPage.enterName("Harry");
    }
    @And("^I enter Item no 111$")
    public void itemNoEnter(){
        fPage.enterItemNo("111");
    }
    @And("^I click on ADD button$")
    public void addClick(){
        fPage.clickAdd();
    }
    @Then("^I get error message 'Please enter a valid item number.'$")
    public void verifyExpectedMessage(){
        Assert.assertTrue(fPage.iserrorMessageDisplayed(),"Actual message does not match with expected error message");
    }
}
