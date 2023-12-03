Feature: Login to Booking.com


  @validLogin
  Scenario: Successful login with valid credentials
    Given User navigates to signin page
    And User enters valid username and password
    When User clicks on the login button
    Then User should be logged in successfully