@hotel_form
Feature: Room Booking in adactin hotel

Scenario: enter in to adactin hotel website
Given go in to the loginpage
When enter the username
And enter the password
Then click on  login button

Given select location from dropdown list field
When select the hotel from dropdown list field
And select the room type from dropdown list field 
And select the numberof rooms from dropdown list field
And select the checkin date in field
And select the checkout date in field
And select nnumber of adult in field
And select number of children in field
Then user should click the search button


Given checking the hotel profile
When click on the Radio button to select the hotel
Then click the continue button to navigate to payment page

Given user should Enter your firstname
When user should Enter your lastname
And user should Enter your billing address
And user should Enter your valid credit card number
And user should select creditcard typr from dropdown list
And user should select expiry date and year
And user should enter valid cvv number
Then user should click on the book now button


Given user should check the itinerary details
When user should check the order id details
And user should take screenshots of the booking history
Then finally click on the logout button




