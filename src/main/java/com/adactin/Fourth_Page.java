package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fourth_Page{

public WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement firstname;
	
	@FindBy(id = "last_name")
	private WebElement lastname;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement cardnumber;
	
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cardtype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expirymonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expiryyear;
	
	@FindBy(xpath = "(//input[@type='text'])[14]")
	private WebElement ccvnumber;
	
	@FindBy(xpath = "//input[@type='button']")
	private WebElement booknow_btn;

	public Fourth_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCcvnumber() {
		return ccvnumber;
	}

	public WebElement getBooknow_btn() {
		return booknow_btn;
	}

}
