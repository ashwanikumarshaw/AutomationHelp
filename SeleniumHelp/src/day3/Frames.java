package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		//driver.findElement(By.xpath(".//*[@id='draggable']")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement source=driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath(".//*[@id='droppable']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		
		

	}


}
