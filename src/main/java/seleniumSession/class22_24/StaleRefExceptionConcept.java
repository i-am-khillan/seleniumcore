package seleniumSession.class22_24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleRefExceptionConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//dom v1
		WebElement emailId=driver.findElement(By.id("input-email")); // v1
		emailId.sendKeys("test");////dom v1
		driver.navigate().refresh(); //dom v2 is created
		Thread.sleep(5000);
		
		//case 1
//		// to solve the staleref issue we need to reinstalizing the element
//		 emailId=driver.findElement(By.id("input-email")); // v1
//		 emailId.sendKeys("to@test");//org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
//		//dom --v2
//		
		// throtan or stale
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
					wait.pollingEvery(Duration.ofMillis(500))
						.ignoring(StaleElementReferenceException.class)
						.withMessage("element not found....");
					
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email"))).sendKeys("tom@gmail.com");
	
	}

}
