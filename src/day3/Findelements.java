package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findelements {
	public static void main(String[] args) {
		// Create a new instance of the FireFox driver
		System.out.println("--------Launching Firefox--------");
		WebDriver driver = new FirefoxDriver();
 
		//driver.manage().window().maximize();
		// Launch the ToolsQA WebSite
		driver.get("http://toolsqa.com/Automation-practice-form/");
 
		// Type Name in the FirstName text box      
		driver.findElement(By.name("firstname")).sendKeys("Lakshay"); 
 
		//Type LastName in the LastName text box
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
 
		// Click on the Submit button
		driver.findElement(By.id("submit")).click();
		
		driver.close();
	}

}
