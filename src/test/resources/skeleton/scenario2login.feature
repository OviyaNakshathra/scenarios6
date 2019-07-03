Feature: login test in testme
Scenario Outline: login with valid user conditions
Given user opens the login page in newtours application
When user enters the un as "<username>" 
And user enters the pwd as "<password>"
And Click Submit button
Then verify login success 
Examples:
|username|password|
|AlexUser|Alex@123|
  