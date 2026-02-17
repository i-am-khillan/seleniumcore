package seleniumSession.class22_24;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {
	static WebDriver driver;
	// Wait(i) : until(); ---> FluentWait(c) :(@overridden)until(){} + other methods
	// -->WebDriverWait (c) : no methods

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		String title = waitForTitleContains(
				"Free CRM software for customer relationship management, sales, and support.\r\n" + "", 5);
		System.out.println(title);
	}
//Title 
	public static String waitForTitleContains(String titleFraction, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			if (wait.until(ExpectedConditions.titleContains(titleFraction)))
				;
			{
				return driver.getTitle();
			}
		} catch (Exception e) {
			System.out.println("Title is not found:" + timeout);
		}
		return null;
	}

	public static String waitForTitleIs(String url, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			if (wait.until(ExpectedConditions.titleIs((url)))) {
				return driver.getTitle();
			}
		} catch (Exception e) {
			System.out.println("Title is not found:" + timeout);
		}
		return null;
	}

	public static String waitForURLContains(String urlFraction, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			if (wait.until(ExpectedConditions.urlContains(urlFraction)))
				;
			{
				return driver.getCurrentUrl();
			}
		} catch (Exception e) {
			System.out.println("URL is not found:" + timeout);
		}
		return null;
	}

	public static String waitForURLIs(String url, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			if (wait.until(ExpectedConditions.urlToBe((url)))) {
				return driver.getCurrentUrl();
			}
		} catch (Exception e) {
			System.out.println("Title is not found:" + timeout);
		}
		return null;
	}

}
