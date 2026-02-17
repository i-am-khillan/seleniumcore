package seleniumSession.class11;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShubWEbTable {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//https://selectorshub.com/xpath-practice-page
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page");
		
		Thread.sleep(3000);
		//String xpath = "//a[text()='Joe.Root']//ancestor::tr//input[@type='checkbox']";
		
		selectUser("Joe.Root");
		selectUser("Joe.Root");
		
		
		List<String> userInfo=getUserdetails("Joe.Root");
		System.out.println(userInfo);
	}

	public static void selectUser(String userName) throws InterruptedException {
		String xpath="//a[text()='"+userName+"']//ancestor::tr//input[@type='checkbox']";
		Thread.sleep(3000);
		driver.findElement(By.xpath(xpath)).click();
		//driver.findElement((By.xpath(xpath))).click();
		
	}
	public static List<String> getUserdetails(String userName) throws InterruptedException {
		String xpath="//a[text()='"+userName+"']/parent::td/following-sibling::td";
		Thread.sleep(3000);
		List<WebElement>userInfoElement=driver.findElements((By.xpath(xpath)));
		List<String> userinforDetails=new ArrayList<>();
		for(WebElement e: userInfoElement) {
			String text=e.getText();
			userinforDetails.add(text);
		}
		return userinforDetails;
	}
	
}
