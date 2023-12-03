package com.capstoneproject.stepdefs;


import com.capstoneproject.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheapestHotelFinderStepDefs extends CommonMethods {


    @Given("the user enters {string} in the destination search field")
    public void the_user_enters_in_the_destination_search_field(String string) {
        sendText(cheapestHotelFinder.whereTo, string);
        click(cheapestHotelFinder.clickDestination);

    }
    @When("the user selects check-in and check-out date fields")
    public void the_user_selects_check_in_and_check_out_date_fields() {
        click(cheapestHotelFinder.checkInDate);
        click(cheapestHotelFinder.checkOutDate);

    }
    @When("the user clicks on the Search button")
    public void the_user_clicks_on_the_button() {
        click(cheapestHotelFinder.search);


    }
    @Then("the user identifies the cheapest hotel from the search results")
    public void the_user_identifies_the_cheapest_hotel_from_the_search_results() {
        click(cheapestHotelFinder.sortDropDown);
        wait(2);
        click(cheapestHotelFinder.priceLowest);
        wait(3);
        System.out.println(cheapestHotelFinder.sortedFilter.getText());
        String firstHotelName = cheapestHotelFinder.hotelName.getText();
        String firstHotelPrice = cheapestHotelFinder.hotelPrice.getText();

        System.out.println("Cheapest Hotel: " + firstHotelName + " | Price: " + firstHotelPrice);

    }
}
