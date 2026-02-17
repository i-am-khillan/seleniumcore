package seleniumSession.class22_24;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcepts {

	// Wait(i) : until();-----> FluentWait(c) : until(){} + other methods
	// -->WebDriverWait (c)

	static WebDriver driver;

	public static void main(String[] args) {

		//Applied debugger 
		/**
		 * setTime(()->{
		 * debuger;
		 * }
		 * ,5000)
		 * 
		 */
		
		
		driver = new ChromeDriver();

		driver.get("");
		By images = By.cssSelector("");

		Wait<WebDriver>	 wait=new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(2))
		.ignoring(NoSuchElementException.class)
		.ignoring(StaleElementReferenceException.class)
		.withMessage("timeout...element is not present");

WebElement image_ele=wait.until(ExpectedConditions.visibilityOfElementLocated(images));
image_ele.click();		
		
//Wait<WebDriver>	 wait=new FluentWait<WebDriver>(driver)
//					.withTimeout(Duration.ofSeconds(10))
//					.pollingEvery(Duration.ofSeconds(2))
//					.ignoring(NoSuchElementException.class)
//					.withMessage("timeout...element is not present");
//
//WebElement image_ele=wait.until(ExpectedConditions.visibilityOfElementLocated(images));
//image_ele.click();

		// WEbDriverWait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//		wait.pollingEvery(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2))
//				.ignoring(NoSuchElementException.class).ignoring(ElementNotInteractableException.class)
//				.ignoring(StaleElementReferenceException.class).withMessage("text");
//
//		WebElement image_ele = wait.until(ExpectedConditions.visibilityOfElementLocated(images));
//		image_ele.click();
		
//		Wait	 wait=new FluentWait<WebDriver>(driver)
//		.withTimeout(Duration.ofSeconds(10))
//		.pollingEvery(Duration.ofSeconds(2))
//		.ignoring(NoSuchElementException.class)
//		.withMessage("timeout...element is not present");

	}

}
