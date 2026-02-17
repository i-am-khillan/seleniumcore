package seleniumSession.class18WinodwsHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class VerifyURLTitle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

	/**
	 * Open 3 window  and tell me the open window is facebook window.
	 *  
	 */
		
		driver = new ChromeDriver();
		// driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		Thread.sleep(5000);
		
		// new tab --- window pop up
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		
		while (itr.hasNext()) {
			String windowId = itr.next();
			if(!windowId.equals(parentWindowId)) {
				
				if(driver.getCurrentUrl().contains("facebook")){
					System.out.println("facebook window"+driver.getTitle());
					System.out.println("facebook window"+windowId);
					//System.out.println("facebook window"+driver.getPageSource());
					Thread.sleep(3000);
					break;
					
				}
				else {
					
					System.out.println(driver.getTitle()+" window"+windowId);
					Thread.sleep(3000);
					driver.close();
				}
			}

		}
		Thread.sleep(3000);

		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		System.out.println(parentWindowId);
		//System.out.println(driver.getPageSource());

	}

}
