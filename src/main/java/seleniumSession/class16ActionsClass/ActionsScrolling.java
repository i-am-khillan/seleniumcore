package seleniumSession.class16ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Actions act=new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.PAGE_UP).perform();
//	
		//selenium 4.x
		
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
	
		act.scrollToElement(driver.findElement(By.xpath("//a[text()='Press Releases']")))
		    .click(driver.findElement(By.xpath("//a[text()='Press Releases']")))
		      .build().perform();
		Thread.sleep(2000);
		
		
	}
}
