Feature: Cruise Search on booking.com

  @Cruises
  Scenario: User searches for cruises to Bahamas and sorts by price
    Given the user is on the booking.com homepage
    When the user clicks on the "Cruises" option in the navigation menu
    And the user selects "Bahamas" as the destination in the "Where do you want to cruise?" search dropdown
    And the user clicks on the View cruises button
    And the user selects the option to sort the results by price from low to high and click apply
    Then the user should see a list of available cruises to Bahamas
