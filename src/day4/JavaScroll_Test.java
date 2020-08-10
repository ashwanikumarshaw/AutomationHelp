package day4;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScroll_Test {
	public static void main(String args[]) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
	      	
   		
		
		   //Creating the JavascriptExecutor interface object by Type casting
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		  
	        //Maximize window		
	        driver.manage().window().maximize();	
	        
	      //Launching the Site.		
	        driver.get("http://loginpage.com/");			
	        //Vertical scroll down by 500  pixels		
	        js.executeScript("window.scrollBy(0,500)");
	        
	        
	       /* Loging Demo*/
		  
		    //Launching the Site.		
	        driver.get("http://loginpage.com/login.php");			
	        		
	        WebElement button =driver.findElement(By.name("LoginBtn"));			
	        				
	        driver.findElement(By.name("userid")).sendKeys("ashwani");					
	        driver.findElement(By.name("password")).sendKeys("zut1456");					
	        		
	        //Perform Click on LOGIN button using JavascriptExecutor		
	        js.executeScript("arguments[0].click();", button);
	                                
	        //To generate Alert window using JavascriptExecutor. Display the alert message 			
	        js.executeScript("alert('Welcome You loged in');"); 
		 
	      
    }

}
