package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openCartLinks {
	
		public static void main(String[] args) throws InterruptedException {

			WebDriver driver = new ChromeDriver();

			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			//tottal text fields on the page :
			System.out.println("----------------------");
			List<WebElement> listOfTextField=driver.findElements(By.className("form-control"));
			
			System.out.println(listOfTextField.size());
			
			for(WebElement e: listOfTextField) {
				e.sendKeys("Testing");
				
			}
	}

}
