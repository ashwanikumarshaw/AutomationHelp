package day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Form_fillup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Link : https://webapps.tekstac.com/Shopify/
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 	//for maxi window
		driver.get("https://webapps.tekstac.com/Shopify/");

		driver.findElement(By.id("firstname")).sendKeys("Ashwani");
		driver.findElement(By.id("lastname")).sendKeys("Kumar");
		driver.findElement(By.id("username")).sendKeys("Ashawni Kumar Shaw");
		//select
		driver.findElement(By.xpath("//option[contains(text(),'Chennai')]")).click();
		//or xpath //option[@value='mas']
		//<option value="mas">Chennai</option>
		driver.manage().deleteAllCookies();  // Delete all cookies
		driver.findElement(By.xpath("//input[@value='male']")).click();
		//<input type="radio" name="gender" value="male" checked="">
		driver.findElement(By.id("pass")).sendKeys("MR@123");
		//driver.findElement(By.id("reg")).click();
	
	}

}
