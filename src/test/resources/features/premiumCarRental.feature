Feature: Car Rental on Booking.com

  @CarRental
  Scenario: User wants to rent a premium car on Booking.com website
    Given the user navigates to the car rental section
    And the user selects the location "New York"
    And the user selects the pick-up and drop-off date
    And the user clicks on the search button
    And the user filters the options to show only premium cars
    Then the captured car details on the website