Feature: Verify the login funtionality
    
  Scenario: Login to Orange HRM website
    Given User is on Login Page
    When user enters username and password
    And click on login button
    Then user is at home page
    
