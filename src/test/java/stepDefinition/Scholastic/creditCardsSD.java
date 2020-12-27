package stepDefinition.Scholastic;

import Pages.Scholastic.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class creditCardsSD {

    ScholasticHomePage hPage = new ScholasticHomePage();
    SignInPage iPage = new SignInPage();
    CreateTeacherAccount tPage = new CreateTeacherAccount();
    TeacherHomePage pPage = new TeacherHomePage();
    MyAccountPage mPage = new MyAccountPage();
    NotificationPage nPage = new NotificationPage();

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
    @And("^I click on My Account arrow down$")
    public void clickArrowDown(){
        pPage.clickArrow();
    }
    @And("^I click on Profile link$")
    public void clickProfileLink(){
        pPage.clickProfile();
    }
    @And("^I already add 3 credit cards then click on Add a Card in My Credit Cards to add 4th credit card$")
    public  void addAcardClick(){
        mPage.clickAddAcard();
    }
    @Then("^I get error message 'You can only store three credit cards'$")
    public void verifyErrorMessage(){
       Assert.assertTrue(mPage.isErrorMessageDisplayed(),"Error message 'You can only store three credit cards' is not displayed");
    }



}
