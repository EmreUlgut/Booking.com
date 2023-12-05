Feature: Find Cheapest Hotel in New York

  @search @smoke_test
  Scenario: User searches for the cheapest hotel on Booking.com
    Given the user enters "New York" in the destination search field
    And the user selects check-in and check-out date fields
    And the user clicks on the Search button
    Then the user identifies the cheapest hotel from the search results