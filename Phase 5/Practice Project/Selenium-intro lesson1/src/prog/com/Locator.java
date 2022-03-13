package prog.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\95\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
	    
	   
		   LoginFlow(driver);
		
	}

	public static void LoginFlow(WebDriver driver) {
		driver.get("http://www.phptravels.net/login");
	    driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
	    driver.findElement(By.name("password")).sendKeys("demouser"); 	
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
