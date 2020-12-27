Feature: Invalid item number

  Scenario: Verify teacher gets error message for invalid number in SFO(Student Flyer Order)
    When I click in Sign In link
    And I enter 'aurora@schl.com' in email address
    And I enter 'aurora2020' in password
    And I click on Sign In button
    And I click on Cross mark in Notification page
    And I click on Enter Orders link
    And I click on Student Flyer Orders link
    And I enter Student name Harry
    And I enter Item no 111
    And I click on ADD button
   Then I get error message 'Please enter a valid item number.'