package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Third_Page {
	
public WebDriver driver;
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radio_btn;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit_btn;

	public Third_Page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadio_btn() {
		return radio_btn;
	}

	public WebElement getSubmit_btn() {
		return submit_btn;
	}



}
