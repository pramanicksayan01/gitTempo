@Register
Feature: Registration Feature
@positive
Scenario: Possitive Registration scenario

Given user is on registration page
When user user enters details
|username|king|
|password|king1234|
|confirmpass|king1234|
|mob|2433456546|
|comp|CG|
And user clicks on submit button
Then user is registerd successfully

