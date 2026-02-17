package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.*;
public class NavigationMethods {
	
	public static void main(String[] args) throws MalformedURLException {
		
		//back and forward
		//get vs to 
		//refresh methods
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(new URL("https://www.google.com"));
		driver.navigate().to("https://www.google.com");
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.get("http://www.amazon.com");
		
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
////		
	// get or navigate().to() method are synonum of each others
		
		//to()method is overloading method but get()method is not overloaded
		//
		
		
		
		//refresh the page
		
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
