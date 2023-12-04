Feature: Dashboard Page Feature

Background:
Given User has already logged in to application
|username|password|
|Admin|admin123|

Scenario: Dashboard page title
Given User is on Dashboard page
When user gets the title of the page
Then page title should be "OrangeHRM"

Scenario: Dashboard section count
Given User is on Dashboard page
Then user gets Dashboard sections
|Admin|
|PIM|
|Leave|
|Time|
|Recruitment|
|My Info|
|Perfomance|
|Directory|
|Maintenance|
|Claim|
|Buzz|
And Dashboard section count should be 11
