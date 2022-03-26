package com.automation;

import org.openqa.selenium.WebDriver;

public class Automation_Pom_Class {

public WebDriver driver;
	
	private First_Page1 p1;
	private Second_Page2 p2;
	private Third_Page3 p3;
	private Fourt_page4 p4;
	private Fifth_Page p5;
	private Sixth_page p6;
	
	public Automation_Pom_Class(WebDriver driver2) {
		this.driver = driver2;
	}
	public First_Page1 getP1() {
	  if (p1==null) {
		p1= new First_Page1(driver);
	}
		return p1;
	}
	public Second_Page2 getP2() {
		if (p2==null) {
			p2=new Second_Page2(driver);
		}
		return p2;
	}
	public Third_Page3 getP3() {
		if (p3==null) {
			p3= new Third_Page3(driver);
		}
		return p3;
	}
	public Fourt_page4 getP4() {
		if (p4==null) {
			p4 = new Fourt_page4(driver);
		}
		return p4;
	}
	public Fifth_Page getP5() {
		if (p5==null) {
			p5 = new Fifth_Page(driver);
		}
		return p5;
	}
	public Sixth_page getP6() {
		if (p6==null) {
			p6 = new Sixth_page(driver);
		}
		return p6;
	}	

}
