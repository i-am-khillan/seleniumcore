package seleniumSession.class22_24;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ElementException;

public class CustomWaitConcept {

	static WebDriver driver;

	public static WebElement retryingElement(By locator, int timeout) {

		WebElement element = null;
		int attempt = 0;
		while (attempt < timeout) {
			try {
				element = driver.findElement(locator);
				System.out.println("element is found..."+locator+"in attempt"+attempt);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found...." + "in attempts" + attempt);
				try {
					Thread.sleep(500);
				}catch(InterruptedException e1){
					e1.printStackTrace();
				}
			}
			attempt++;
		}
		if(element==null) {
			System.out.println("element is not found .... tried for "+timeout+"times"+"with the interval of "+500+"milliseconds");
			throw new ElementException("No such element");
		}
		return element;
	}

	public static WebElement retryingElement(By locator, int timeout,int intervalTime) {

		WebElement element = null;
		int attempt = 0;
		while (attempt < timeout) {
			try {
				element = driver.findElement(locator);
				System.out.println("element is found..."+locator+"in attempt"+attempt);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found...." + "in attempts" + attempt);
				try {
					Thread.sleep(intervalTime+1000);
				}catch(InterruptedException e1){
					e1.printStackTrace();
				}
			}
			attempt++;
		}
		if(element==null) {
			System.out.println("element is not found .... tried for "+timeout+"times"+"with the interval of "+500+"milliseconds");
			throw new ElementException("No such element");
		}
		return element;
	}
	public static void main(String[] args) {

		// Thread.sleep()---static wait----dynamic wait:

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		
		By locatorId=By.id("input-email");
		retryingElement(locatorId, 10).sendKeys("email@test");
	}

}
