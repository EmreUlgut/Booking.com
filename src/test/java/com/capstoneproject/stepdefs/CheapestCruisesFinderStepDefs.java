package com.capstoneproject.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.capstoneproject.testbase.PageInitializer.cheapestCruisesFinder;
import static com.capstoneproject.utils.CommonMethods.click;

public class CheapestCruisesFinderStepDefs {

    @Given("the user is on the booking.com homepage")
    public void the_user_is_on_the_booking_com_homepage() {
       click(cheapestCruisesFinder.cruises);
    }
    @When("the user clicks on the {string} option in the navigation menu")
    public void the_user_clicks_on_the_option_in_the_navigation_menu(String string) {
       click(cheapestCruisesFinder.cruisesWhereDo);

    }
    @When("the user selects {string} as the destination in the {string} search dropdown")
    public void the_user_selects_as_the_destination_in_the_search_dropdown(String string, String string2) {
       click(cheapestCruisesFinder.cruisesBahamas);
    }
    @When("the user clicks on the View cruises button")
    public void the_user_clicks_on_the_view_cruises_button() {
        click(cheapestCruisesFinder.cruisesViewCruises);

    }
    @When("the user selects the option to sort the results by price from low to high and click apply")
    public void the_user_selects_the_option_to_sort_the_results_by_price_from_low_to_high_and_click_apply() {

        click(cheapestCruisesFinder.cruisesSortBy);
      click(cheapestCruisesFinder.cruisesPriceLowToHigh);
      click(cheapestCruisesFinder.cruisesApplyButton);
    }
    @Then("the user should see a list of available cruises to Bahamas")
    public void the_user_should_see_a_list_of_available_cruises_to_bahamas() {

        String twonightBahamas = cheapestCruisesFinder.cruisesTwoNightBahamas.getText();
        boolean expectedResult = twonightBahamas.contains("Bahamas");
        Assert.assertTrue(twonightBahamas,expectedResult);


    }


}
