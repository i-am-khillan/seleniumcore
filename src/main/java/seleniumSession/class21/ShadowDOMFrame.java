package seleniumSession.class21;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMFrame {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(3000);
		//driver.findElement(By.id("searchInput")).sendKeys("notifications");//not working because some shadowDOM
		
//		https://selectorshub.com/iframe-in-shadow-dom/
		//cass 1 : 	//browser --shadow dOM(open) ----element
		
//		String search_script="document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		WebElement search=(WebElement)js.executeScript("return "+search_script);
//		
//		search.sendKeys("veg pizza");
		
		//#shadow-root(root)  // shadow-root should be open than automated by selenium if not ask to developmenrs
		
		//case 2 :browser --shadow dOM(open) --->iframe ---element
		//#shadow-root (open)
		String iframes_script="document.querySelector(\"#userName\").shadowRoot.querySelector(\"#pact1\")";
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement search=(WebElement)js.executeScript("return "+iframes_script);
	
		
		driver.switchTo().frame(search);
		driver.findElement(By.id("glaf")).sendKeys("Pass");
		
		//for shadow dom element selenium tool is not correct tool  to automate >>go with paywright or OIFramework
	
	
	}
}
