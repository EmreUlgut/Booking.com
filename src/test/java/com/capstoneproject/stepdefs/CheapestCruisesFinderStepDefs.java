package com.capstoneproject.stepdefs;

import com.capstoneproject.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class CheapestCruisesFinderStepDefs extends CommonMethods {

    @Given("the user navigates to booking.com cruises page")
    public void the_user_is_on_the_booking_com_homepage() {

        if (loginPage.popUpWindow.isDisplayed()) {
            click(loginPage.popUpWindow);
        }

        click(cheapestCruisesFinder.cruises);
    }

    @When("the user clicks on the Cruises option in the navigation menu")
    public void the_user_clicks_on_the_option_in_the_navigation_menu() {
        click(cheapestCruisesFinder.cruisesWhereTo);
        wait(3);
    }

    @When("the user types Bahamas as the destination in the Where do you want to cruise? search box")
    public void the_user_selects_as_the_destination_in_the_search_dropdown() {
        sendText(cheapestCruisesFinder.cruisesWhereTo, "Bahamas");
        wait(3);
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
        wait(2);
        String bahamasCruiseInfo = cheapestCruisesFinder.cruisesInfo.getText();
        String bahamasCruisePrice = cheapestCruisesFinder.cruisePrice.getText();

        System.out.println("Cruise Info: " + bahamasCruiseInfo + " | Price: " + bahamasCruisePrice);

        boolean expectedResult = bahamasCruiseInfo.contains("Bahamas");
        Assert.assertTrue(bahamasCruiseInfo, expectedResult);


    }


}
