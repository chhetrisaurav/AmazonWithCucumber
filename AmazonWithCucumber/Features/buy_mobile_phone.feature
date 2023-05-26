Feature: Buy mobile phone on Amazon

Scenario: A user should be able to buy a mobile phone on Amazon successfully
Given a user is on the landing page of Amazon
When he clicks on Mobiles 
And he hovers the pointer over Mobiles & Accessories
And he clicks on Apple
And he clicks on the second available phone on the page
And he switches focus on new tab
And he clicks on Buy Now button
Then he should he able to buy the mobile phone sucessfully