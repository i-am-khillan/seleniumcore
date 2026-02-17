package companyCode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleAutoSuggestions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("DEL");
		Thread.sleep(2000);

		List<WebElement> elements = driver
				.findElements(By.xpath("//div[@role='presentation']/descendant::ul[@role='listbox']/li"));
		// elements.stream().filter(e->
		// "Delhi".equalsIgnoreCase(e.getText())).findFirst().ifPresent(WebElement::click)
		// ;

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		for (WebElement ee : elements) {
			String text = ee.getText();
			Thread.sleep(1000);
			System.out.println(text);
			if(text.contains("delhi")) {
				
				//wait.until(ExpectedConditions.elementToBeSelected(ee));
				ee.click();
				break;
			}
		}

		System.out.println("Element is clicked");

	}

}
