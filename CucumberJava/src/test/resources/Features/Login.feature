#Auther
Feature: Feature to test login functionality

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enteres username and password
    And clicks on login button
    Then user is navigated to the home page
