#Auther
Feature: Feature to test login functionality

Scenario: Login page title
Given user is on login page
When user gets the title of page
Then page title should be "OrangeHRM"

Scenario: Forgot password link
Given: user is on Login page
Then forgot your password should be displayed

Scenario: Check login is successful with valid credentials
Given user is on login page
When user enteres username "Admin"
When user enteres password "admin123"
And clicks on login button
Then user gets the title of the Dashboard page
And page title should be ""