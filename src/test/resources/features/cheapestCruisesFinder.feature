Feature: Cruise Search on booking.com

  @Cruises @smoke_test
  Scenario: User searches for cruises to Bahamas and sorts by price
    Given the user navigates to booking.com cruises page
    When the user clicks on the Cruises option in the navigation menu
    And the user types Bahamas as the destination in the Where do you want to cruise? search box
    And the user clicks on the View cruises button
    And the user selects the option to sort the results by price from low to high and click apply
    Then the user should see a list of available cruises to Bahamas
