package seleniumSession.class22_24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcepts {

	static WebDriver driver;
	// Wait(i) : until(); ---> FluentWait(c) :(@overridden)until(){} + other methods
	// -->WebDriverWait (c) : no methods

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("");
		By fullName = By.id("");
		By bussiness = By.id("");

		waitForElementPresence(fullName, 10);

		getElement(bussiness);
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		
//		//e1 :10
//		WebElement fullName_ele=wait.until(ExpectedConditions.presenceOfElementLocated(fullName));
//		fullName_ele.sendKeys("testing");
//		
//		//e2 :0
//		driver.findElement(By.id("")).sendKeys("test@gmail.com");
//		

	}

	public static WebElement waitForElementPresence(By locator, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
/**
 * An expectation for checking that an element is present on the DOM of a page.
 *  This does not necessarily mean that the element is visible.


 * 
 * */
	}
//Recommended 
	public static WebElement waitForElementVisible(By locator, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
/*
 * An expectation for checking that an element is present on the DOM of a page and visible.
 *  Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
 * 
 * */
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
