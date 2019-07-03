Feature: test siginup in testme app
Scenario: test the signup fuctionalities with inputs
Given user login to TestMe App
When user enters the  username as "naksha"
When user enters the  firstname as "nakshathra"
And user enters the lastname as  "arivazhagan"
And user enters the password as "nakshasivamA123"
And user enters the confirmpwd as "nakshasivamA123"
And user selects the gender 
And user enters the email as "yuti@gmail.com"
And user enters the mobile number  as "6379352049"
And user enters the dob as "06/19/1997"
And user enters the addre as "23,sakthinagar koothapakkam"
And user enters the anwser as "cuddalore" 
Then click submit button
And verify the signup Success message