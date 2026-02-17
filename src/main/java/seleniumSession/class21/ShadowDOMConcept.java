package seleniumSession.class21;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		driver=new ChromeDriver();
		driver.get("chrome://settings/");
		Thread.sleep(3000);
		//driver.findElement(By.id("searchInput")).sendKeys("notifications");//not working because some shadowDOM
		
		
		String search_script="document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement search=(WebElement)js.executeScript("return "+search_script);
		
		search.sendKeys("notifications");
		
		//#shadow-root(root)  // shadow-root should be open than automated by selenium if not ask to developmenrs
		
	
	
	}
}
