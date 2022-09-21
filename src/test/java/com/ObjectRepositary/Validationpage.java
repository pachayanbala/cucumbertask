package com.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Reusable.Commonactions;

public class Validationpage extends Commonactions {
	
	public void Validationpage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@class='_2MlkI1']/preceding-sibling::button")
	private WebElement closeicon;
	public WebElement getCloseicon() {
		return closeicon;
	}
	@FindBy(xpath="//button[@class='L0Z3Pu']/preceding-sibling::div")
	private WebElement mobilename; 
	
	@FindBy(xpath="//div[@class='_3OO5Xc']/following-sibling::button")
	private WebElement namesubmit;
	
	@FindBy(xpath="//div[@class='gUuXy-']/preceding-sibling::div[1]")
	private WebElement clikmobile;
	public WebElement getMobilename() {
		return mobilename;
	}

	public WebElement getNamesubmit() {
		return namesubmit;
	}

	public WebElement getClikmobile() {
		return clikmobile;
	}

}
