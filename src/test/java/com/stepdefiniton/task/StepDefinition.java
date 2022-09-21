package com.stepdefiniton.task;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ObjectRepositary.Validationpage;
import com.Reusable.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends Commonactions {
	Commonactions c = new Commonactions();
	Validationpage v = new Validationpage();
	
	@Given("User launch the flipkart")
	public void user_launch_the_flipkart() {
	    v.getCloseicon().click();
	}

	@Given("User login the flipkart")
	public void user_login_the_flipkart() {
	    v.getMobilename().sendKeys("realme");
	}

	@When("User search the mobile")
	public void user_search_the_mobile() {
	    v.getNamesubmit().click();
	}

	@When("User click on the mobile name")
	public void user_click_on_the_mobile_name() {
	  v.getMobilename().click();
	}

	@Then("User hadle for window handling")
	public void user_hadle_for_window_handling() {
        c.windowshandling();
	}

	@Then("User validate the mobile name")
	public void user_validate_the_mobile_name() {
	   
	}


}
