Feature: Class code verification,
 Teacher name verification

  Scenario: Verify class code present on Home-Page and MyAccount-Page are should match.
    When I click on 'Create an Account' link
     And I click on Teacher/Administrartor/Homeschooler radio button
     And I click on Next button
     And I select title Mrs. from dropdown
     And I enter Aurora in first name
     And I enter Gebon in last name
     And I enter 'aurora@schl.com' in email address
     And I enter 'aurora2020' in password
     And I enter '800-444-4444' in mobile number
     And I click in checkmark box
     And I click on NEXT button
     And I enter zip code 10012 in My school page
     And I click search button in My school page
     And I type 'Scholastic+Book+Clubs' school name search box
     And I click on NEXT button on My School page
     And I select Teacher(by Grade) from Role list
     And I select 1st Grade from Grade list
     And I enter 20 number of students
     And I click on NEXT button on My Role page
     And I select Guided Reading Level(GRL) from preferred reading level system
     And I click on Continue to site button
     And I get text of class code from TeacherHomePage
     And I save text of class code from TeacherHomePage
     And I click on My Account arrow down
     And I click on Profile link
     And I get text of class code from MyAccountPage
     And I save text of class code from MyAccountPage
    Then Verify class code allocated to the teacher, present on Home page and My Account page are same
     And Verify same teacher name is present on My Account
     And Verify same school address is present as selected while creating the account