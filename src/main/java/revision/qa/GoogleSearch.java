package revision.qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com");//https://www.google.com/
		driver.findElement(By.name("q")).sendKeys("Dell");
		
		
Thread.sleep(3000);		
		List<WebElement> textURL=driver.findElements(By.xpath("//ul[@class='G43f7e']/child::li[@role='presentation']"));
		for(WebElement e: textURL) {
			 String text=e.getText();
			if(text.equalsIgnoreCase("dell laptop")) {
				Thread.sleep(3000);		

				e.click();
				break;
			}
		}
		
		System.out.println("Successfully search the product");
		
	}

}
