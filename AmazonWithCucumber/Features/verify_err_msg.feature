Feature: Login functionality

Background: 
Given a user is on landing page
When he hovers over the Hello sign-in menu
And he clicks on Sign-in button in the sub-menu

#you can run the feature files with tags too. it's @TC_102

@TC_102  
Scenario: User with invalid credentials should get an error
And he enters an invalid email id "batman554466@gmail.com" in the email box
And he clicks continue button
Then he should see the message "We cannot find an account with that email address"

@TC_102
Scenario Outline: Login functionality with multiple invalid emails
And he enters an invalid email "<emailId>" in the email box
And he clicks continue button
Then he should see the message "We cannot find an account with that email address"
Examples: 
|emailId|
|batman445566@gmail.com|
|ironman445566@gmail.com|
|superman445566@gmail.com|
|spiderman445566@gmail.com|
|wonderwomen445566@gmail.com|