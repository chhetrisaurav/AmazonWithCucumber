Feature: Login functionality

Scenario: A user with invalid credentials must not be able to login
Given a user is in the landing page of Amazon
When he hovers the pointer over Hello, sign in 
And he clicks on Sign in button
And he enters an invalid username on phone number or email textbox
And he clicks on Continue button
Then he verifies the error message
