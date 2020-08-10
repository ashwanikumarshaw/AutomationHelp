package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {
		

		 
		 System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\selenium\\chromedriver.exe");
		 // set driver path
		 WebDriver driver =new ChromeDriver(); 
		 // instantiate new chrome driver 
		 // declare webdriver instance

		 driver.get("https://www.google.com"); // open google.com

		 driver.findElement(By.name("q")).sendKeys("Hello Ashwani kumar shaw");

		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 
		    
		 // Insert code here to locate and click on Search button
		 //driver.findElement(By.name("btnK")).click();
//		 driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
//		now run as java app


	}

}
