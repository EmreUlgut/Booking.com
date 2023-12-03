package com.capstoneproject.stepdefs;

import com.capstoneproject.utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PremiumCarRentalStepDefs extends CommonMethods {

    @Given("the user navigates to the car rental section")
    public void the_user_navigates_to_the_car_rental_section() {
        wait(3);
        click(premiumCarRental.carRental);

    }

    @And("the user selects the location {string}")
    public void the_user_selects_the_location(String string) {
        sendText(premiumCarRental.pickUpLocationTextBox, string);
        wait(2);
        click(premiumCarRental.suggestedOption);

    }

    @And("the user selects the pick-up and drop-off date")
    public void the_user_selects_the_pick_up_and_drop_off_date() {
        click(premiumCarRental.pickUpBox);
        wait(2);
        click(premiumCarRental.pickUpDate);
        wait(2);
        click(premiumCarRental.dropOffDate);
        wait(2);

    }

    @And("the user clicks on the search button")
    public void the_user_clicks_on_the_search_button() {
        click(premiumCarRental.searchButton);
        wait(8);

    }

    @And("the user filters the options to show only premium cars")
    public void the_user_filters_the_options_to_show_only_premium_cars() {
        click(premiumCarRental.premiumCar);
        wait(3);

    }

    @Then("the captured car details on the website")
    public void the_captured_car_details_on_the_website() {
        System.out.println(premiumCarRental.typeOfCar.getText());
        String brandOfCar = premiumCarRental.carBrand.getText();
        String priceOfCar = premiumCarRental.priceofRentalCar.getText();

        System.out.println("Car Brand: " + brandOfCar + " | Price: " + priceOfCar);

    }
}
