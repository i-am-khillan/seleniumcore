package seleniumSession.class22_24;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ElementUtil;

public class TestTitlesUtilities {
	
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		
	String titles=	eleUtil.waitForTitleIs("Account Login", 10);
		
		System.out.println(titles);
	}

//	public static String waitForTitleIs(String title, int timeout) {
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
//		try {
//			if (wait.until(ExpectedConditions.urlContains((title)))) {
//				return driver.getTitle();
//			}
//		} catch (Exception e) {
//			System.out.println("Title is not found:" + timeout);
//		}
//		return null;
//	}
}
