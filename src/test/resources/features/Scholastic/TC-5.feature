Feature: Credit cards
  Scenario: Verify getting error message when user try to add 4th credit card.
    When I click in Sign In link
     And I enter 'aurora@schl.com' in email address
     And I enter 'aurora2020' in password
     And I click on Sign In button
     And I click on Cross mark in Notification page
     And I click on My Account arrow down
     And I click on Profile link
     And I already add 3 credit cards then click on Add a Card in My Credit Cards to add 4th credit card
    Then I get error message 'You can only store three credit cards'