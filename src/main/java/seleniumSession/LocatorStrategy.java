package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ElementUtil;

public class LocatorStrategy {
	static WebDriver driver;	
	
	public static void main(String[] args) throws InterruptedException {

		// Create the webelement
		// perform an action on it(click, sendkey,gettext, isdisplayed)

		driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	//	driver.get("https://naveenautomationlabs.com/opencart/index.php");
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1 st
		//1. id : unquie attribute: can not be duplicate
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@.123");

		//2 st
		//2. name : name can be duplicate
//		driver.findElement(By.name("firstname")).sendKeys("test@gmail.com");
//		driver.findElement(By.name("lastname")).sendKeys("test@.123");

//		By fn=By.name("firstname");
//		By ln=By.name("lastname");
//		
//		ElementUtil eleUtil=new ElementUtil(driver);
//		eleUtil.doSendKeys(fn, "Test");
//		eleUtil.doSendKeys(ln, "SDET");
//		
		//3 st
		//3. className: its not unique attribute ,can be duplicate
		//driver.findElement(By.className("form-control")).sendKeys("automation");
		
	//4. xpath :its not attribute: address of the webelement in HTML DOM
		//xpath Path:
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("");
//		
//		By fn=By.xpath("//input[@name='firstname']");
//		By ln=By.xpath("//input[@name='lastname']");
//		
//		ElementUtil eleUtil =new ElementUtil(driver);
//		eleUtil.doSendKeys(fn, "test");
//		eleUtil.doSendKeys(ln, "SDET");
//		
//		
		
		//5. css: cascaded style sheet : its not attribute
		
		//driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Testing123");
		
		
		//6. linkText : only for links -- only the text of the link
		
		//html tag : a --links -anchor tag
		
//		By acounts=By.linkText("My Account");
//		By link=By.linkText("Login");	
//		
//		ElementUtil eleUtil=new ElementUtil(driver);
//		Thread.sleep(2000);
//		eleUtil.doClick(acounts);
//		Thread.sleep(2000);
//		eleUtil.doClick(link);
//		
//		System.out.println("Link successfully");
//	

	//7. PartialLinkText :only for links : for the partial text links
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();
	
		// Forgotten username
		// Forgotten password
		
	//8 tagName:html tag : most of the time its duplicate
		//h1 , h2, h3, etc.
		
//		String header =driver.findElement(By.tagName("h1")).getText();
//		
//		System.out.println(header);
	
	
	By pageHeader=By.tagName("h1");
	ElementUtil eleUtil=new ElementUtil(driver);
 String header=	eleUtil.doGetElementText(pageHeader);
	
	System.out.println(header);
	
		
	
	}
}
