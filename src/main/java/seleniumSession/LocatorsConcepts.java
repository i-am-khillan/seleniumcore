package seleniumSession;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ElementUtil;

public class LocatorsConcepts {

	static WebDriver driver;

	public static void main(String[] args) {

		// Create the webelement
		// perform an action on it(click, sendkey,gettext, isdisplayed)

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// Chrome dev tools:

		// Element section : DOM--- HTML -- DOcument object model

		// html tag & attributes

		// 1,
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@.123");

		// 2.
//	WebElement emailId=	driver.findElement(By.id("input-email"));
//	WebElement WebElement emailId=	driver.findElement(By.id("input-email"));
//			
//		emailId.sendKeys("test@gmail.com");
//		password.sendKeys("test@.123");
//		

		// 10 elements
		// 4 elements are using the we are hitting the server each type.

		// 3. By Locator Approach:

//	 By userName=	By.id("input-email");
//	By pwd=	By.id("input-password");
//	
//	WebElement emailId=driver.findElement(userName);
//	WebElement password=driver.findElement(pwd);
//		
//	emailId.sendKeys("test@gmail.com");
//	password.sendKeys("test@.123");

		// 4. By locator with some utility:
//
//		By userName = By.id("input-email");
//		By pwd = By.id("input-password");
//
//		WebElement emailId = getElement(userName);
//		WebElement password = getElement(pwd);
//
//		emailId.sendKeys("test@gmail.com");
//		password.sendKeys("test@.123");

		// 5. By locator with some utility and action utils;

//		By userName = By.id("input-email");
//		By pwd = By.id("input-password");
//
//		doSendKeys(userName, "test@gmail.com");
//		doSendKeys(pwd, "test@.123");


		// 6. By locator with create common  utility class for element.
// Page By Locators : OR -- Object REspository
		By userName = By.id("input-email");
		By pwd = By.id("input-password");
	
		ElementUtil element= new ElementUtil(driver);
			element.doSendKeys(userName, "test@gmail.com");
			element.doSendKeys(pwd, "test@.123");
			
	//7.		
	// brUtil + eleUtil
	
	// By Util + String locators
			
		String username_id="input-email";
		String pwd_id="input-password";
		
		ElementUtil eleUtil=new ElementUtil(driver);
		
		eleUtil.doSendKeys("id", username_id, "vish@gmail.co");
		eleUtil.doSendKeys("id", pwd_id, "vish@gmail.co");
		
		
		//String ---by --- webelement --action
	 // by --- webelemnet --action ---its
		//webelement --action --- 3rds
		
			
	}

//	public static WebElement getElement(By locator) {
//
//		return driver.findElement(locator);
//
//	}
//
//	public static void doSendKeys(By locator, String value) {
//		getElement(locator).sendKeys(value);
//	}

}

//Browser(html /css Js)===> web pages (JS/TS /React ?angularJS======Server(java/go/py) -------DB