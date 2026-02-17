package seleniumSession.class18WinodwsHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultiWindwsHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		// driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		// parent
		String parentWindowId = driver.getWindowHandle();
		
		
		Thread.sleep(3000);
		// new tab --- window pop up
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();

		// fetch windows ids
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator(); // not maintain the order

		while (it.hasNext()) {

			String WindowId = it.next();
			driver.switchTo().window(WindowId);
			System.out.println("window id :" + driver.getCurrentUrl());
			if (!WindowId.equals(parentWindowId)) {
				driver.close();
			}
			Thread.sleep(2000);
			driver.switchTo().window(parentWindowId);
			System.out.println(driver.getCurrentUrl()+"--- "+driver.getTitle());
		}

	}
}
