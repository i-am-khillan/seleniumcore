package seleniumSession.class22_24;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BrowserExceptions;

public class WaitForPageLoading {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver =new ChromeDriver();
		driver.get("");
		boolean flag=isPageLoaded(10);
		if(!flag) {
			throw new BrowserExceptions("PAGE IS NOT LOADED");
	
			
			
		}
		
	}
	

	
	public static boolean isPageLoaded(int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		
		String flag=wait.until(ExpectedConditions.jsReturnsValue("return document.readyState=='complete'")).toString();
		return Boolean.parseBoolean(flag);
	}
}
