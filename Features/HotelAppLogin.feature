Feature: HotelApp login Param
Description: This test is to check the login functionality 

Scenario: Login Successful
Given User is on the HotelApp HomePage
When User enters the username "vasuvespag" details
And User enters the password "vasu1234" details
And User clicks the Loginbutton
Then Login is successful


