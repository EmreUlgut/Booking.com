package com.capstoneproject.stepdefs;


import com.capstoneproject.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class RegisterStepDefs extends CommonMethods {

    @Given("the user is on the booking.com registration page")
    public void the_user_is_on_the_booking_com_registration_page() {
        if (loginPage.popUpWindow.isDisplayed()) {
            click(loginPage.popUpWindow);
        }
        click(register.register);

    }

    @When("the user enters their valid registration details")
    public void the_user_enters_their_valid_registration_details() {
        String emailAddress = fakeEmail();
        String password = fakePassword();
        sendText(register.registerEmailInput, emailAddress);
        click(register.registercontinueWithEmail);


        sendText(register.registerPasswordInput, password);
        sendText(register.registerConfirmPasswordInput, password);


    }

    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String string) {
        click(register.registerCreateAccountButton);

    }

    @Then("the user should be successfully registered on booking.com")
    public void the_user_should_be_successfully_registered_on_booking_com() {

        String yourAccountText = register.registerYourAccount.getText();
        Assert.assertEquals("Your account", yourAccountText);

    }


}
