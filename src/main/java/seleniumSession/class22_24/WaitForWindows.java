package seleniumSession.class22_24;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindows {
	// Wait(i) : until(); ---> FluentWait(c) :(@overridden)until(){} + other methods
		// -->WebDriverWait (c) : no methods
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			if(wait.until(ExpectedConditions.numberOfWindowsToBe(2))){
				Set<String> handles=driver.getWindowHandles();
				Iterator<String> itr=handles.iterator();
				String parentWindowId=itr.next();
				System.out.println("parent window id:"+parentWindowId);
				
				String childWindowId=itr.next();
				System.out.println("child window id : "+childWindowId);
			}
			
		}
}
