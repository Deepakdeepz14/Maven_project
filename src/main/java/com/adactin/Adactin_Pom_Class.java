package com.adactin;

import org.openqa.selenium.WebDriver;

public class Adactin_Pom_Class {
	
	public WebDriver driver;
    
	
	private First_Page fp;
	private Second_Page sp;
	private Third_Page tp;
	private Fourth_Page four;
	

	public Adactin_Pom_Class(WebDriver driver2) {
		this.driver = driver2;
	}
	public First_Page getFp() {
	if (fp == null) {
		 fp = new First_Page(driver);
	}	
	
		return fp;
	}
	public Second_Page getSp() {
	if (sp == null) {
		sp = new Second_Page(driver);
	}
		return sp;
	}
	public Third_Page getTp() {
	if (tp == null) {
		tp = new Third_Page(driver);
	}
		return tp;
	}
	public Fourth_Page getFour() {
	if(four == null) {
		four = new Fourth_Page(driver);
	}
		return four;
	}
	

}
