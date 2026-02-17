package seleniumSession.class22_24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleElementsWaitElemnts {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// dom v1

		// case 1
		List<WebElement> footerList = driver.findElements(By.cssSelector("footer a")); // v1

//		for(int i=0;i<footerList.size();i++) {
//			footerList.get(i).click();  //v2
//			driver.navigate().back();//v3
//			//re-intialized
//			footerList=driver.findElements(By.cssSelector("footer a")); // v1
//
//		}
//	
		// case 2 -- using the for-each is not working
//		for(WebElement e: footerList) {
//			e.click();  //v2
//			driver.navigate().back();//v3
//			//re-intialized
//			footerList=driver.findElements(By.cssSelector("footer a")); // v1
//		}

		// case 3 -- fluent wait

		for (int i = 0; i < footerList.size(); i++) {
			footerList.get(i).click();
			driver.navigate().back();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.pollingEvery(Duration.ofMillis(400))
			.ignoring(StaleElementReferenceException.class)
			.withMessage("Element is not found...");

			wait.until(ExpectedConditions.visibilityOfAllElements(footerList));

		}
	}

}
