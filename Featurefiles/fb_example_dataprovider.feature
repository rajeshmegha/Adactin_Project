Feature: facebook login screen
Scenario Outline: login scenario for fb 
Given the user is on login form
When the user enters the below credentiels "<username>" and "<password>"
And the user clicks on the login field

Examples:
|username|password|
|jhjkjkj|hjkhjh|
|hjhjhjh|jkjkj|
|rajeshmi_86@yahoo.com|hjhjhhjjhjh|
|rajeshmi_86@yahoo.com|rhiyarajesh228|
|hkhfkjhhj|rhiyarajesh228|
