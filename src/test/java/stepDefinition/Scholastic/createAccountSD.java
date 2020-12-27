package stepDefinition.Scholastic;

import Pages.Scholastic.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class createAccountSD {
    ScholasticHomePage hPage = new ScholasticHomePage();
    CreateAnAccountPage cPage = new CreateAnAccountPage();
    CreateTeacherAccount tPage = new CreateTeacherAccount();
    MySchoolPage sPage = new MySchoolPage();
    MyRolePage rPage = new MyRolePage();
    CustomizeYourExperience ePage = new CustomizeYourExperience();
    TeacherHomePage pPage = new TeacherHomePage();
    MyAccountPage mPage = new MyAccountPage();

    String classCode1="";
    String classCode2="";


    @When("^I click on 'Create an Account' link$")
    public void clickCreateAnAccount(){
        hPage.scrollCreateAnAccount();
    }
    @And("^I click on Teacher/Administrartor/Homeschooler radio button$")
    public void clickTeacherButton(){
        cPage.selectTeacherButton();
    }
    @And("^I click on Next button$")
    public void clickNext(){
        cPage.clickNextButton();
    }
    @And("^I select title Mrs. from dropdown$")
    public void selectMrs(String data) {
        tPage.selectTitle("Mrs.");
    }
    @And("^I enter Aurora in first name$")
    public void enterFirstName(String data){
        tPage.enterFirstname("Aurora");
    }
    @And("^I enter Gebon in last name$")
    public void enterLastName(String data){
        tPage.enterLastname("Gebon");
    }
    @And("^I enter 'aurora@schl.com' in email address$")
    public void enterEmail(String data){
        tPage.enterEmailAdd("aurora@schl.com");
    }
    @And("^I enter 'aurora2020' in password$")
    public void typePassword(String data){
        tPage.enterPassword("aurora2020");
    }
    @And("^I enter '800-444-4444' in mobile number$")
    public void typeMobNum(String data){
        tPage.enterMobNum("800-444-4444");
    }
    @And("^I click in checkmark box$")
    public void clickCheckBox(){
        tPage.setCheckBox();
    }
    @And("^I click on NEXT button$")
    public void clickNextBox(){
        tPage.clickNext();
    }

    @And("^I enter zip code 10012 in My school page$")
    public void typeZipCode(){
        sPage.enterZipCode("10012");
    }
    @And("^I click search button in My school page$")
    public void searchButton(){
        sPage.clickSearch();
    }
    @And("^I type 'Scholastic+Book+Clubs' school name search box$")
    public void typeSchoolName(String data){
        sPage.selectSchoolName("Scholastic+Book+Clubs");
    }
    @And("^I click on NEXT button on My School page$")
    public void nextButton(){
        sPage.clickNextButton();
    }
    @And("^I select Teacher(by Grade) from Role list$")
    public void selectTeacherRole(String data){
        rPage.selectRole("Teacher(by Grade)");
    }
    @And("^I select 1st Grade from Grade list$")
    public void selectTeacherGrade(String data){
        rPage.selectGrade("1st Grade)");
    }
    @And("^I enter 20 number of students$")
    public void studentsNo (String data){
        rPage.setNoOfStudents("20");
    }
    @And("^I click on NEXT button on My Role page$")
    public void nextbutton(){
        rPage.clicknext();
    }
    @And("^I select Guided Reading Level(GRL) from preferred reading level system$")
    public void setLevelSystem(String data){
        ePage.selectReadingLevel("Guided Reading Level (GRL)");
    }
    @And("^I click on Continue to site button$")
    public void clickContinueSite(){
        ePage.setContinueSite();
    }
    @And("^I get text of class code from TeacherHomePage$")
    public void getCodeText(){
        pPage.codeText();
    }
    @And("^I save text of class code from TeacherHomePage$")
    public void saveClassCode1(String arg1){
        classCode1= "pPage.codeText()";
        System.out.println("Class code in Home page is= "+ classCode1 );
    }
    @And("^I click on My Account arrow down$")
    public void clickArrowDown(){
        pPage.clickArrow();
    }
    @And("^I click on Profile link$")
    public void clickProfileLink(){
        pPage.clickProfile();
    }
    @And("^I get text of class code from MyAccountPage$")
    public void getTextClassCode(){
        mPage.textCode();
    }
    @And("^I save text of class code from MyAccountPage$")
    public void saveClassCode2(String arg2){
        classCode2= "mPage.textCode()";
        System.out.println("Class code in My Account page is= "+ classCode2 );
    }
     

    @Then("^Verify class code allocated to the teacher, present on Home page and My Account page are same$")
    public void verifyClassCode(){
        Assert.assertEquals(classCode1,classCode2,"Class code from Home page and My Account page did not match");
    }

    @And("^Verify same teacher name is present on My Account$")
    public void verifyTeacherName(){

    }

}
