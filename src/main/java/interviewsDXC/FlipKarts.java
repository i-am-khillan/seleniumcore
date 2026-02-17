package interviewsDXC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKarts {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//svg elements 
		//button//*[local-name()='svg']
		
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
		Thread.sleep(3000);
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Audio']"))).perform();
		Thread.sleep(3000);
		
		WebElement e=driver.findElement(By.xpath("//a[text()='All']"));
		act.moveToElement(e).perform();
		Thread.sleep(3000);
		String text=e.getText();
		e.click();
		
		System.out.println(text);
		
		
		
		
	}

}
