package seleniumSession.class_single_MultiSelectionWebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ElementUtil;

public class WebTablesPaginations {

	static WebDriver driver;
	static ElementUtil elementUtil;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		Thread.sleep(6000);

		elementUtil = new ElementUtil(driver);

		// multiple selections:
int count=0;
		while (true) {
			if (driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {
				Thread.sleep(3000);
				selectCountryMultiple("India");
			}
			Thread.sleep(3000);

			// pagination logic :
			WebElement next = driver.findElement(By.xpath("//button[@type='button' and @aria-label='Next']"));
			
			if (next.getAttribute("class").contains("disabled")) {
				System.out.println("Pagination is over....country name is not found ....");
				break;
			}
			count++;
			next.click();
			Thread.sleep(1000);
		}

		System.out.println(count);
//		//single selections :
//		while(true) {
//			
//			//if ele is present on the 1st page itself:
//			if(driver.findElements(By.xpath("//td[text()='khillan']")).size() >0) {
//				
//				//td[text='Denmark']
//				//System.out.println("Selecting the country ");
//				Thread.sleep(3000);
//
//				selectCountry("Ukraine"); // Ukraine //Denmark Ukraine
//				Thread.sleep(6000);
//				//Denmark
//				break;
//			}
//			else {
//				//pagination logic : click on next link
//				System.out.println("pagination start  page ");
//				WebElement next=driver.findElement(By.xpath("//button[@type='button' and @aria-label='Next']"));
//				
//				if( next.getAttribute("class").contains("disabled")) {
//				System.out.println("Pagination is over....country name is not found ....");
//				break;
//				}
//				
//				next.click();
//				Thread.sleep(1000);
//				System.out.println("Pagination page ");
//			}
//		}
	}

	public static void selectCountryMultiple(String countryName) throws InterruptedException {
		List<WebElement> checkBox = driver.findElements(
				By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/child::input[@type='checkbox']"));
		// elementUtil.scrollIntoView(e);
		// Thread.sleep(3000);
		for (WebElement e : checkBox) {

			e.click();
		}
	}

	public static void selectCountry(String countryName) throws InterruptedException {
		WebElement e = driver.findElement(
				By.xpath("//td[text()='" + countryName + "']/preceding-sibling::td/child::input[@type='checkbox']"));
//elementUtil.scrollIntoView(e);
//Thread.sleep(3000);
		e.click();
	}
}
