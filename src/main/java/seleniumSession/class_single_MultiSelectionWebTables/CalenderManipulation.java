package seleniumSession.class_single_MultiSelectionWebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ElementUtil;

public class CalenderManipulation {

	static WebDriver driver;
	static ElementUtil elementUtil;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://selectorshub.com/xpath-practice-page/");
		//driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.get("https://www.spicejet.com/");
		Thread.sleep(6000);

		elementUtil = new ElementUtil(driver);

		driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
	
	}
}
