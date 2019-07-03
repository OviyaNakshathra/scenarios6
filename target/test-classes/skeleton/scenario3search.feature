Feature: test the search product 
Description: Alex an elite user of TestMe app purchase most of his products from testmeapp.Being an elite user he gets lot of rewards and offers.One day Alex logins in testme app and use search functionality.
Scenario Outline: login with valid user conditions
Given user opens  login page in newtours application
When users enters the un as "<username>"
And users enters the pwd as "<password>"
And Click on  Submit button
Then verify the login success  
And user enters the search product as "Head"
Then click on the find button
Examples:
|username|password|
|AlexUser|Alex@123| 
