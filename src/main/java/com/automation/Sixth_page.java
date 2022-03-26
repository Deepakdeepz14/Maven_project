package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sixth_page {

public WebDriver driver;
	
	@FindBy(id = "cgv")
	private WebElement checkbox;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement submit_btn;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement payment;
	
	@FindBy(linkText = "Back to orders")
	private WebElement back_btn;

	public Sixth_page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getSubmit_btn() {
		return submit_btn;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getBack_btn() {
		return back_btn;
}


}
