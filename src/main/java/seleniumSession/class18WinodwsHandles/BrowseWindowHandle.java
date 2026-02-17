package seleniumSession.class18WinodwsHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseWindowHandle {	static WebDriver driver;

public static void main(String[] args) throws InterruptedException {

	driver = new ChromeDriver();
	// driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Thread.sleep(3000);
	
	//new tab --- window pop up 
	
	driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
	
	//1st : fetch the window ids
	
	Set<String> handles=driver.getWindowHandles();
	Iterator<String> it=handles.iterator(); // not maintain the order
	
	 String parentWindowId=it.next();
	 System.out.println("parent window id :"+parentWindowId);
	 
	 
	 
	 String childWindowId =it.next();
	 System.out.println("child window id :"+childWindowId);
	 
	 // 2nd : Switching works:
	driver.switchTo().window(childWindowId);
	System.out.println("child window url :"+driver.getCurrentUrl());
	driver.close();
	
	driver.switchTo().window(parentWindowId);
	System.out.println("parent window url :"+driver.getCurrentUrl());
	driver.quit();
	
	 
	 
	
}

}
