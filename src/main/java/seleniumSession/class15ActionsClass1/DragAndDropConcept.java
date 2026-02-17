package seleniumSession.class15ActionsClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//ele to ele on the page --- valid
		//file on the page ---- NA 
		
		WebElement srcEle=driver.findElement(By.xpath("//div[@id='draggable']/child::p[text()='Drag me to my target']"));
		WebElement targetEle=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(4000);
	Action action=	act.clickAndHold(srcEle)
			.moveToElement(targetEle)
				 .release()
				 	.build()
				 		;
	action.perform();
	
	//or	
		//act.dragAndDrop(srcEle, targetEle).perform();
	}
}
