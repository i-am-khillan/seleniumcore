package seleniumSession.class22_24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollingTimeConcepts {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	By twitter=	By.xpath("//a[contains(@href,'twitter')]");
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));// internal time =500ms
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10),Duration.ofMillis(2000));// internal time =200 ms /2 sec
	wait.until(ExpectedConditions.visibilityOfElementLocated(twitter));
	
	}
}
