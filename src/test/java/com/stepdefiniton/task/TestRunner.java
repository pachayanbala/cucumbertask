package com.stepdefiniton.task;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//features//flipkart.feature",
                     glue = "com.stepdefinition.task",
               monochrome = true,
                   plugin = "html:target",
                   dryRun = false)


public class TestRunner {

}
