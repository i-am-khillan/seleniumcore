package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementExceptions {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
	driver=new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
	//driver.findElement(By.id("search111")).sendKeys("machbook");
		
	//NoSuchElementException
	
	List<WebElement> eles=driver.findElements(By.tagName("naveen"));
	System.out.println(eles.size());
	//not throw exception if element not found	
	System.out.println(eles);	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
