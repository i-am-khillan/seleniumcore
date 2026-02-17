package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementEnabled {

	
	
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.get("classic.freecrm.com/register/");
	
	
		
		//isDisplayed : element is present on the page
		// isEnabled :element is only present on the page but its enabled or not
	// isSelected : checkbox is selected or not --its give true or false
		// checkbox 
	boolean flag=	driver.findElement(By.id("input-email")).isEnabled();
	System.out.println(flag);//false
	
	
	boolean checkbox=driver.findElement(By.name("agreeTerms")).isSelected();
	System.out.println(checkbox);//false
	
	
	
	
	driver.findElement(By.name("agreeTerms")).click();
	
	flag=driver.findElement(By.id("submitButton")).isEnabled();
	System.out.println(flag);//true
	
	
	}
	
	
}
