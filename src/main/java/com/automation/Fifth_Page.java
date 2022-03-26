package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fifth_Page {

public WebDriver driver;
	
	@FindBy(linkText = "Proceed to checkout")
	private WebElement proceed_btn;
	
	@FindBy(xpath = "//*[text()='Proceed to checkout']")
	private WebElement confirn_Btn;

	public WebElement getConfirn_Btn() {
		return confirn_Btn;
	}

	public Fifth_Page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProceed_btn() {
		return proceed_btn;
	}

}
