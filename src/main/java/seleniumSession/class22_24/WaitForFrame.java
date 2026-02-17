package seleniumSession.class22_24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {

	static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		By frameLocator=By.xpath("");
		
		waitForFrameAndSwitchToIt(frameLocator,10);
		
	}
	public  static void waitForFrameAndSwitchToIt(By frameLocator,int timeout) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
		
		
	}
	
}
