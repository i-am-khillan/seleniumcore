package seleniumSession.class22_24;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlerts {
	static WebDriver driver;
	// Wait(i) : until(); ---> FluentWait(c) :(@overridden)until(){} + other methods
	// -->WebDriverWait (c) : no methods

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();
	}

	public static Alert waitForJSAlert(int i) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	public static String getAlertText(int timeout) {
		return waitForJSAlert(timeout).getText();
	}
	public static void acceptAlert(int timeout) {
		 waitForJSAlert(timeout).accept();;
	}
	public static void dismissAlert(int timeout) {
		 waitForJSAlert(timeout).dismiss();;
	}
	public static void getAlertText(int timeout,String value) {
		 waitForJSAlert(timeout).sendKeys(value);
	}
}
