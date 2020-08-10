package day3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.findElement(By.xpath("//*[@class='col-md-6 text-left']/div[1]/div/div[2]/div[1]/a")).click();
		System.out.println(driver.getTitle());
		Set<String> windowsID=driver.getWindowHandles();
		Iterator<String>it=windowsID.iterator();
		String FirstWindows_Id = it.next();
		String SecondWindows_Id=it.next();
		driver.switchTo().window(SecondWindows_Id);
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		  
	}

}
