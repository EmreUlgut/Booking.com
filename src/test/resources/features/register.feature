Feature: User Registration on booking.com

  @Register
  Scenario: New user registration
    Given the user is on the booking.com registration page
    When the user enters their valid registration details
    And the user clicks on the "Create account" button
    Then the user should be successfully registered on booking.com
