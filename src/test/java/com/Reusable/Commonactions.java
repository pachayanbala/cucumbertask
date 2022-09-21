package com.Reusable;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Commonactions {
	public static WebDriver driver; 
	public void windowshandling() {
		String parent = driver.getWindowHandle();
    	Set<String> children = driver.getWindowHandles();
    	for (String child : children ) {
    		if(!parent.equals(children)) {
			driver.switchTo().window(child);
    		}}

	}

}
