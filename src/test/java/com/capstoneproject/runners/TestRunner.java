package com.capstoneproject.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // you can specify which feature you want to run, we can also run all features
        features = "src/test/resources/features",

        // shows where we can find the implementation regarding the steps in feature files above
        glue = {"com.capstoneproject.stepdefs"},

        // if true, it does not really run the steps. it checks if every step in feature files is defined in code


        // runs test cases that have same tags
        tags = "@smoke_test",

        monochrome = true,
        plugin = {
                "pretty", //prints gherkin steps in console
                "html:target/cucumber-report.html", //create a basic html report in target folder
                "json:target/cucumber.json",
                "rerun:target/failed.txt"
        }
)
public class TestRunner {
        // This class will run your Cucumber tests
}

