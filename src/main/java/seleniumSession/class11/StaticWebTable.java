package seleniumSession.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		//driver.get("https://classic.freecrm.com/");
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		Thread.sleep(4000);

		int rowCount=driver.findElements(By.xpath("//table[@id='customers']//child::tr")).size();
		System.out.println("total row count: "+(rowCount-1));
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[2]/td[2]
		
	
	}

}
