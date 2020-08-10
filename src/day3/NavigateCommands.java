package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigateCommands {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		// Open ToolsQA web site
		String appUrl = "http://www.yescopied.com";
		driver.get(appUrl);

		// Click on Registration link
		//driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[2]/a")).click();

		// Go back to Home Page
		driver.navigate().back();

		// Go forward to Registration page
		driver.navigate().forward();

		// Go back to Home page
		driver.navigate().to(appUrl);

		// Refresh browser
		driver.navigate().refresh();

		// Close browser
		driver.close();
	}
	

}
