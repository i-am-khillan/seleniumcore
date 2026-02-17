package seleniumSession.class11;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableUserCore {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		Thread.sleep(12000);
//		driver.findElement(By.id("username")).sendKeys("Admin5");
//		driver.findElement(By.id("password")).sendKeys("@Admin12345");
//		driver.findElement(By.id("login")).click();
//		Thread.sleep(4000);
//		String name=driver.findElement(By.xpath("//h4[text()='Organizations']")).getText();
//		System.out.println(name);
		Thread.sleep(3000);

		List<WebElement> elemnts=driver.findElements(By.xpath("//a[text()='Desktops']//ancestor::nav[@id='menu']//child::li"));
		Thread.sleep(3000);
		List<String> headerString=new ArrayList<>();
		System.out.println("text-------");
		for(WebElement e: elemnts) {
			String text =e.getText();
			if(text.length()!=0) {
				headerString.add(text);
			}
		}
		System.out.println(headerString);
	}

}
