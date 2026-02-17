package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElementClickSendKeys {

	
	
	
	
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
	
		driver.findElement(By.id("pass")).click();//no exception --diabled elements
		driver.findElement(By.id("pass")).sendKeys("test");//  org.openqa.selenium.ElementNotInteractableException: element not interactable
		//ElementNotInteractableException
		
		driver.findElement(By.id("pass")).sendKeys(null);	
		// java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
		
		driver.findElement(By.id("fname")).sendKeys(new StringBuilder("Test"));
		String s="automation";
		driver.findElement(By.id("fname")).sendKeys(new StringBuilder("Test"),s,"naveem");
		
		//CharSequence : --interface
		//String ,StringBuilder,StringBuffer
		
		// ... means in array is saying : array type
		
		//important Point:
		//when click on disabled element than user is not getting any exception
		//when send text on dispalbed element than user is getting "ElementNotInteractableException"
		
		//button is not clickable:
	
	}
}
