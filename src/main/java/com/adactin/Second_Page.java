package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Second_Page {

public WebDriver driver;
	
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotelname;
	
	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement numberofrooms;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement joindate;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement outdate;
	
	@FindBy(id = "adult_room")
	private WebElement adhultperson;
	
	@FindBy(id = "child_room")
	private WebElement childroom;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	public Second_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotelname() {
		return hotelname;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumberofrooms() {
		return numberofrooms;
	}

	public WebElement getJoindate() {
		return joindate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getAdhultperson() {
		return adhultperson;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}


}
