package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Get_StringUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// Storing the Application Url in the String variable
		String url = "http://leafground.com/";
		
		//Launch the ToolsQA WebSite
		driver.get(url);
		}

}
