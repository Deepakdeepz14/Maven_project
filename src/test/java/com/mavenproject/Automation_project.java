package com.mavenproject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.automation.Automation_Pom_Class;
import com.baseclass.Base_Class;

public class Automation_project extends Base_Class {

public static WebDriver driver = browser_launch("Chrome");
	
	public static Automation_Pom_Class pom = new Automation_Pom_Class(driver);
	
	public static Logger log = Logger.getLogger(Automation_project.class);

     public static void main(String[] args) throws IOException {
    	 
    	PropertyConfigurator.configure("log4j.properties");
		
		getUrl("http://automationpractice.com/index.php?");
		
		implicitwait(30, "SECONDS");
		
		log.info("Url Launch");
				
		//Sigin Methods
		
		clickElement(pom.getP1().getSigin_btn());
		
		//Login Methods
		
		inputElement(pom.getP2().getUsername(),getdata("C:\\Users\\Admine\\Downloads\\Automation Testcase.xlsx", 
				0, 25, 5));
		
		inputElement(pom.getP2().getPassword(),getdata("C:\\Users\\Admine\\Downloads\\Automation Testcase.xlsx", 
				0, 26, 5));
		
		clickElement(pom.getP2().getSubmit_btn());
		
		log.info("Sign in Successfull");
		//Select Purchase Option
		
		clickElement(pom.getP3().getSelectoption());
		
		//Price Change Methods
		
		dropdown("Index",pom.getP3().getPrize(), "1");
		
		//Icon views Change Methods 
		
		clickElement(pom.getP3().getIconview());
		
		//colour Select Methods
		
		clickElement(pom.getP3().getColor_btn());
		
		//Quantity Select Methods
		
		clear(pom.getP4().getQuantity());
		inputElement(pom.getP4().getQuantity(), "2");
		
	    //Size Select Methods
		
		dropdown("Visibletext", pom.getP4().getSize(), "M");
		
		//Add To Card Methods
		
		clickElement(pom.getP4().getAddtocard());
		
		log.info("Dress Selected Successfull");
		//Checkout Methods
		
		clickElement(pom.getP5().getProceed_btn());
		clickElement(pom.getP5().getProceed_btn());
		clickElement(pom.getP5().getConfirn_Btn());

		//Check Box Methods
		
		clickElement(pom.getP6().getCheckbox());
		
		clickElement(pom.getP6().getSubmit_btn());
		
		//Payment Methods
		
		clickElement(pom.getP6().getPayment());
		
		//conform Payment Methods
		
		clickElement(pom.getP6().getSubmit_btn());
		log.info("Payment Sucessfull");
		// FileHandler ScreenShot Methods
		
		filehandler("C:\\Users\\Admine\\Pictures\\Screenshots\\New folder\\picture.png");
		log.info("ScreenShot Successfull");
		
		//Back to orders Methods
		
		clickElement(pom.getP6().getBack_btn());
		
		//File Utils Methods
		fileutils("//C:\\\\Users\\\\om\\\\Pictures\\\\screenshot picture\\\\New folder\\\\confirmorder.png");
		log.info("Testing Finished");

	}

}
