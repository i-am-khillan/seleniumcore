package seleniumSession.class16ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		// driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// respoonsive --view port---
//		Dimension dim=new Dimension(414,896);
//		driver.manage().window().setSize(dim);
//		Thread.sleep(5000);
		// driver.manage().window().maximize();
		// driver.manage().window().fullscreen();

		// sel 4.x
//		driver.manage().window().minimize();
//		driver.manage().window().maximize();
//		
//		

		WebElement fn = driver.findElement(By.id("input-firstname"));
		int ht = fn.getSize().getHeight();
		int wd = fn.getSize().getWidth();

		System.out.println(ht + "----" + wd);
		int x = fn.getLocation().getX();
		int y = fn.getLocation().getY();
		System.out.println(x + "-------" + y);

		System.out.println("-------------");

		WebElement continue_btn = driver.findElement(By.xpath("//input[@type='submit']"));
		String color = continue_btn.getCssValue("background-color");// color code
		System.out.println(color);
	}

}
