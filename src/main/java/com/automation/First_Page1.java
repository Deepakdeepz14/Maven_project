package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class First_Page1 {

public WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	private WebElement sigin_btn;

	public First_Page1(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSigin_btn() {
		return sigin_btn;
	}


}
