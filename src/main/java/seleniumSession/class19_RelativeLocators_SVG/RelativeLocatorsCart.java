package seleniumSession.class19_RelativeLocators_SVG;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;;

public class RelativeLocatorsCart {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// Selenium 4.x

		/**
		 * Above of element | left of element <--- element ----> right of element
		 * 
		 * near of element |
		 * 
		 * below of element
		 * 
		 */

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		
		WebElement ele = driver.findElement(By.id("input-email"));

		String labelLogin = driver.findElement(with(By.cssSelector("label[for='input-email']")).above(ele)).getText();
		System.out.println(labelLogin);
		
		//base
		WebElement header=driver.findElement(By.xpath("//h2[text()='New Customer']"));
		WebElement butcontinue=driver.findElement(By.linkText("Continue"));
		
	List<WebElement> paramList=	driver.findElements(with(By.tagName("p")).below(header).above(butcontinue).toRightOf(By.linkText("//h2[text()='Returning Customer']")));
		
	for(WebElement e: paramList) {
		String text=e.getText();
		System.out.println(text);
		
	}
		
		
		
	}
}