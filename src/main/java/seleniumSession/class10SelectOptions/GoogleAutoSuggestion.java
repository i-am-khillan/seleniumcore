package seleniumSession.class10SelectOptions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestion {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		
		driver.get("https://groww.in/");
		
//		By searchSuggestion=By.name("q");
//		By suggestion =By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class='wM6W7d']/span");

		By searchSuggestion=By.xpath("//div[@id='searchWrapperElem23']//child::div[text()='Search Groww...']");
		By suggestion =By.xpath("");
		
		
		//driver.findElement(By.xpath("//div[@class='pXnwx']//child::div[@role='button']//child::span[text()='Not interested']")).click();
		
		doSearch(searchSuggestion,"automation",suggestion,"tools");
		
	}

	public static void getElement(By locator) {
		driver.findElement(locator);
	}
	public static void doSearch(By searchLocator,String searchKey,By SearchSuggestion,String value) throws InterruptedException {
		
		driver.findElement(searchLocator).sendKeys(searchKey);
		Thread.sleep(3000);

		//driver.findElement(By.xpath("//div[@class='pXnwx']//child::div[@role='button']//child::span[text()='Not interested']")).click();
		
		Thread.sleep(3000);
		List<WebElement>autoSuggestion=driver.findElements(SearchSuggestion);		
		
		ArrayList<String> array=new ArrayList<>();
		for(WebElement e:autoSuggestion) {
			String test=e.getText();
			array.add(test);
			Thread.sleep(1000);
			System.out.println(test);
			if(test.contains(value)) {
				e.click();
				break;
			}
		}
	}
	
}
