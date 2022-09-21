@Login
Feature: Login Feature
#we are testing login feature for facebook
@positive
Scenario: possitive login scenario
#precondition
Given user is on login page
When user enters "priti" and "priti1234"
And user clicks on button
Then user is on home page
@negative
Scenario Outline: Negative Login Scenario
Given user is on login page
When user enters "<user>" and "<password>"
And user clicks on button
Then user is on same page
Examples:
|user|password|
|admin|admin1234|
||admin1234|
|admin||
|priti|priti1234|