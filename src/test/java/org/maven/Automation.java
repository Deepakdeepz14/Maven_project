package org.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admine\\eclipse-workspace\\Selenium_concepts\\chromedriver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://automationpractice.com/");
			
			driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		login.click();
		
		
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("deepzdeepak14@gmail.com");
		 
		driver.findElement(By.id("passwd")).sendKeys("Badvillan");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		WebElement set = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		set.click();
		
		WebElement click = driver.findElement(By.xpath("(//a[@title='Faded Short Sleeve T-shirts'])[2]"));
		click.click();
		
		driver.findElement(By.xpath("//*[text()='Add to cart']")).click();

		Actions as = new Actions(driver);
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement move = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		move.click();
		
		WebElement check = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		check.click();
	

	}

}
