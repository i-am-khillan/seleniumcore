package seleniumSession.class17AlertsFileFrames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {

	// javaScript alert

	// alert
	// confirmation alert --- accept or dismiss
	// prompt alert
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// WebElement web= driver.findElement(By.xpath("//button[text()='Click for JS
		// Alert']"));

//		WebElement web = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
//
//		// js alert -- or model dialog alert
//		web.click();
//		Thread.sleep(2000);
//		 //1. alert
//		 Alert alert=driver.switchTo().alert();
//		 
//		String text= alert.getText();
//		System.out.println(text);
//		alert.accept();
//		//alert.dismiss() ;// cancel alert

		// 2. Js confirmation
//
//		WebElement web = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
//
//		// js alert -- or model dialog alert
//		web.click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();
//		// alert.dismiss() ;// cancel alert

		
		////button[text()='Click for JS Prompt']
		///
		// 3. prompt

		WebElement web = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));

		// js alert -- or model dialog alert
		web.click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
		alert.sendKeys("test");
		Thread.sleep(5000);
		alert.accept();//ok
		// alert.dismiss() ;// cancel alert

	}

}
