package com.mavenproject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.adactin.Adactin_Pom_Class;
import com.adactin.First_Page;
import com.baseclass.Base_Class;

public class Adactin_Project extends Base_Class {

		public static WebDriver driver = browser_launch("Chrome");
		
		public static Adactin_Pom_Class apc = new Adactin_Pom_Class(driver);
		
		public static First_Page fp = new First_Page(driver);
		
		public static Logger log = Logger.getLogger(Adactin_Project.class);
		
		public static void main(String[] args) throws IOException {
			
			PropertyConfigurator.configure("log4j.properties");
			
			getUrl("https://adactinhotelapp.com/index.php");
			
			log.info("Url Launch");
						
		    inputElement(apc.getFp().getUsername(),getdata("C:\\Users\\Admine\\Documents\\Adactin TestCase (1).xlsx",
		    		0, 14, 5));
			
			inputElement(apc.getFp().getPassword(),getdata("C:\\Users\\Admine\\Documents\\Adactin TestCase (1).xlsx",
					0, 15, 5));
			
			clickElement(apc.getFp().getLogin());
			
			log.info("Sign up Sucessfull");
						
			dropdown("Visibletext", apc.getSp().getLocation(), "Paris");
			
			
			dropdown("Index", apc.getSp().getHotelname(), "1");
			
			dropdown("Index", apc.getSp().getRoomtype(), "2");
						
			dropdown("Value",apc.getSp().getNumberofrooms(), "2");
			
			
			clear(apc.getSp().getJoindate());
			inputElement(apc.getSp().getJoindate(), "14/04/2022");
			
			clear(apc.getSp().getOutdate());
			inputElement(apc.getSp().getOutdate(), "20/04/2022");
						
			dropdown("Index", apc.getSp().getAdhultperson(), "3");
			
			dropdown("Index", apc.getSp().getChildroom(), "2");
			
			log.info("Hotal Select Successfull");
			
			clickElement(apc.getSp().getSubmit());
					
			clickElement(apc.getTp().getRadio_btn());
						
		    clickElement(apc.getTp().getSubmit_btn());
		    
		    log.info("Hotal Booking Confirmation");
						
			inputElement(apc.getFour().getFirstname(),getdata("C:\\Users\\Admine\\Documents\\Adactin TestCase (1).xlsx",
					0, 28, 5));
			
			inputElement(apc.getFour().getLastname(),getdata("C:\\Users\\Admine\\Documents\\Adactin TestCase (1).xlsx",
					0, 29, 5)); 
			
			inputElement(apc.getFour().getAddress(),getdata("C:\\Users\\Admine\\Documents\\Adactin TestCase (1).xlsx",
					0, 30, 5)); 
			
			inputElement(apc.getFour().getCardnumber(),"9543489665979150"); 
			
			
			dropdown("Visibletext", apc.getFour().getCardtype(), "VISA");
			
			dropdown("Index", apc.getFour().getExpirymonth(), "4");
			
			dropdown("Visibletext", apc.getFour().getExpiryyear(), "2022");
			
			
			inputElement(apc.getFour().getCcvnumber(),getdata("C:\\Users\\Admine\\Documents\\Adactin TestCase (1).xlsx",
					0, 34, 5));  
				
			clickElement(apc.getFour().getBooknow_btn());
			
			log.info("Hotel Booking Successfull");
			
					
			filehandler("C:\\Users\\Admine\\Documents\\screeshot\\screenshot.png");
			
			log.info("ScreenShot Sucessfully");
			
	  


	}

}
