package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Third_Page3 {

public WebDriver driver;
	
	@FindBy(xpath = "(//a[text()='T-shirts'])[2]")
	private WebElement selectoption;
	
	@FindBy(id = "selectProductSort")
	private WebElement prize;
	
	@FindBy(id = "list")
	private WebElement iconview;
	
	@FindBy(xpath = "//a[@class='color_pick']")
	private WebElement color_btn;

	public Third_Page3(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelectoption() {
		return selectoption;
	}

	public WebElement getPrize() {
		return prize;
	}

	public WebElement getIconview() {
		return iconview;
	}

	public WebElement getColor_btn() {
		return color_btn;
	}

}
