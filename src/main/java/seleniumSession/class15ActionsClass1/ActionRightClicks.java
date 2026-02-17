package seleniumSession.class15ActionsClass1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionRightClicks {


	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		// rightClick 
		Actions act=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(e).perform();
	
	//	driver.findElement(By.linkText(null));
	List<WebElement> listMenu=driver.findElements(By.cssSelector("ul.context-menu-list >li:not(.context-menu-separator)"));
	for(WebElement ee:listMenu) {
		String text=ee.getText();
		System.out.println(ee.getText());
		if(text.equals("Copy")) {
			e.click();
			break;
		}
	}
	
	
	}

}
