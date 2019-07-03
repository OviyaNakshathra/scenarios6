Feature: test the search product 
Description: Alex an elite user of TestMe app purchase most of his products from testmeapp.Being an elite user he gets lot of rewards and offers.One day Alex logins in testme app and use search functionality.
Scenario Outline: login with valid user conditions
Given user go to  login page in testme application
When users will enter the un as "<username>"
And users will enter the pwd as "<password>"
And Click Submit button in login
Then verifies the login success  
And user selects the search product as "Head"
Then clicks on the find button
Examples:
|username|password|
|AlexUser|Alex@123| 