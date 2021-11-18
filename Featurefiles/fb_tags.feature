Feature: facebook login 

@positive
Scenario: login details for facebook page
Given the user is on login window
When the user enters the credentiels
|rajeshmi_86@yahoo.com|rhiyarajesh228|
And the user clicks on the login button field
Then the user shoukd navigates to the home page

@negative
Scenario: login information for facebook window
Given the user is on login page
When the user enters the details
|rajeshssmi_86@yahoo.com|rhiyarajesh22e8|
And the user clicks on the login button 
Then the user shoukd navigates to the home window