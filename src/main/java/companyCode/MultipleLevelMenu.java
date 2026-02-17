package companyCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleLevelMenu {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-PAN-Jan25&gad_source=1&gad_campaignid=22175835974&gbraid=0AAAAA91V9opZfj9Pg-ArqY74PqedX5rfc&gclid=CjwKCAiAjojLBhAlEiwAcjhrDrycBfG4JGzj28SIeChzrxDum6rdnZjEZB7KNDqmq0FJ0vXgJ_li_BoCJb4QAvD_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		Actions a=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("(//span[text()='Category'])[last()]"));
		element.click();
		Thread.sleep(3000);
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Fashion']"))).perform();
		Thread.sleep(1000);

		a.moveToElement(driver.findElement(By.xpath("//a[text()='Footwear']"))).perform();//Men's Footwear
		Thread.sleep(1000);

		a.click(driver.findElement(By.xpath("//a[text()='Men's Footwear']"))).build().perform();
		Thread.sleep(1000);
	}

}
