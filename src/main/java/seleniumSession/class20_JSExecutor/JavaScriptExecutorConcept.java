package seleniumSession.class20_JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.JavaScriptUtil;

public class JavaScriptExecutorConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//browser  : JS
		
		//JS------ JavaScriptExecutor---- executeScritpt();
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login"
				+ "");
		
		//comsole.log
		//alert
		//logs
		
//		JavascriptExecutor js=	(JavascriptExecutor)driver;
//	String title=	js.executeScript("return document.title;").toString();
//	System.out.println(title);	
//	
//	String urls=js.executeScript("return document.URL;").toString();
//	System.out.println(urls);
//	
//	
////	
//		WebElement elemnt=driver.findElement(By.xpath("//a[text()='Order History']"));
//		
//		JavaScriptUtil js=new JavaScriptUtil(driver);
//		js.scrollIntoView(elemnt);
		
		WebElement element=driver.findElement(By.name("email"));
		WebElement passElement=driver.findElement(By.name("password"));
		JavaScriptUtil js=new JavaScriptUtil(driver);
		js.flash(element);
		element.sendKeys("test@automation.com");
		js.flash(passElement);
		passElement.sendKeys("test@123");
		
		
		WebElement loginBtn=driver.findElement(By.xpath("//input[@value='Login']"));
		js.clickElementByJS(loginBtn);
		
		
		
		
		
		
		
	}
	
	
}
