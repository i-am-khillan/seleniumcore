package companyCode;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectAmazonSearchDropDown {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@Test(enabled=false)
	public void getAllOptions() {
		
	
		
		List<WebElement> listOptionElement=driver.findElements(By.xpath("//select[@id='searchDropdownBox']/child::option"));
		
		List<String> items=new ArrayList<>();
		for(WebElement e:listOptionElement) {
			String text=e.getText();
			items.add(text);
		}
	
		System.out.println(items);
		
		
	}

	@Test
	public void testAutoSuggestion() throws InterruptedException {
		
		By searchLoctor=By.id("twotabsearchtextbox");//.sendKeys("language");
		By optionLocator=By.xpath("//div[@role='rowgroup']/child::div/div");
		
		autoSuggestionUtils(searchLoctor, "langauge", optionLocator, "toys");
	}
	
	/**
	 * Ulitiies 
	 * @param locator
	 * @return
	 */
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public void autoSuggestionUtils(By Searchlocator,String searchKey,By optionLocator,String value) throws InterruptedException {
		getElement(Searchlocator).sendKeys(searchKey);
		Thread.sleep(2000);
		List<WebElement> listOptions=getElements(optionLocator);
		List<String> items=new ArrayList<>();

		for(WebElement e: listOptions) {
			
			String text =e.getText();
			items.add(text);
			
			if(text.contains(value)) {
				e.click();
				break;
			}
		}
		System.out.println(items);
		
	}
}
