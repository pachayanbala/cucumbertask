package com.stepdefiniton.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.Reusable.Commonactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Commonactions {
	
	
		@Before
		public void beforeclass() {
			System.out.println("before class");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	@After
		public void afterclaa() {
			System.out.println("afterclass");
		}
	}



