package seleniumSession.class16ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabSequence {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);
	//	WebElement search=driver.findElement(By.name("firstname"));

		
//		act.sendKeys(search,"sanjay")
//				.sendKeys(Keys.TAB)
//				.pause(300)
//				.sendKeys("automations")
//				.sendKeys(Keys.TAB)
//				.pause(300)
//				.sendKeys("san@gamil.com")
//				.sendKeys(Keys.TAB)
//				.pause(300)
//				.sendKeys("san@123")
//				.sendKeys(Keys.TAB)
//				.pause(300)
//				.sendKeys("san@123")
//				.build().perform();
		
		//String value= macbook;
		
		//tab and search the 
		act.sendKeys(Keys.TAB)
		  .sendKeys(Keys.TAB)
		  .sendKeys(Keys.TAB)
		  .sendKeys(Keys.TAB)
		  .sendKeys(Keys.TAB)
		  .sendKeys("macbook pro").
		  sendKeys(Keys.ENTER).build().perform();
		
	}
}
