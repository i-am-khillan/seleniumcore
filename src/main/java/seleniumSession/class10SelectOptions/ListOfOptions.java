package seleniumSession.class10SelectOptions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfOptions {
	static WebDriver driver;
	
	
	public static void main(String[] args) {
	
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		By options=By.xpath("//select[@name='url']/child::option");
		
		
		System.out.println(getOptionSelect(options));
		
	}
	public static List<String> getOptionSelect(By locator) {
		
		List<WebElement> listOfElement=driver.findElements(locator);
		List<String> textList=new ArrayList<>();
		
		for(WebElement e:listOfElement) {
			String text=e.getText();
			textList.add(text);
			
		}
		return textList;
		
		
		
	}

}
