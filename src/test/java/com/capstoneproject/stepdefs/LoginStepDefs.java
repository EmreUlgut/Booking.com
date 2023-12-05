package com.capstoneproject.stepdefs;

import com.capstoneproject.utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs extends CommonMethods {


    @Given("User navigates to signin page")
    public void user_Navigates_To_Signin_Page() {

        if (loginPage.popUpWindow.isDisplayed()){
        click(loginPage.popUpWindow);}

        wait(1);
        click(loginPage.signIn);

    }

    @And("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        sendText(loginPage.emailInputLocator, "capstoneprojectforbooking@gmail.com");
        wait(1);
        click(loginPage.continueWithEmail);
        wait(2);
        sendText(loginPage.passwordInputLocator, "Orlando2023");
        wait(1);

    }

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        click(loginPage.signinButton);
        wait(2);

    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        String yourAccountText = loginPage.yourAccount.getText();
        Assert.assertEquals("Your account", yourAccountText);

    }

}
