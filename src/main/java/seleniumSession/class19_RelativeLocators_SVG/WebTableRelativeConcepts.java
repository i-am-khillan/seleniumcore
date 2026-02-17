package seleniumSession.class19_RelativeLocators_SVG;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;;

public class WebTableRelativeConcepts {
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
			//https://selectorshub.com/xpath-practice-page
			driver=new ChromeDriver();
			driver.get("https://selectorshub.com/xpath-practice-page");
			
			Thread.sleep(5000);
			//String xpath = "//a[text()='Joe.Root']//ancestor::tr//input[@type='checkbox']";
		
			WebElement playele=driver.findElement(By.linkText("Joe.Root"));
			
			Thread.sleep(5000);
			//driver.findElement(with(By.id("ohrmList_chkSelectRecord_21")).toLeftOf(playele)).click();
			
			List<WebElement> list=driver.findElements(with(By.xpath("//table[@id='resultTable']//td")).toLeftOf(playele));
			
			for(WebElement e: list) {
				System.out.println(e.getText());
			}
		}
		
}
