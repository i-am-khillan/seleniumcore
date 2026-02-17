package seleniumSession.class17AlertsFileFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		// driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
		Thread.sleep(3000);
		//iframe id 
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#RESULT_TextField-8")).sendKeys("vish");
		//
		//https://www.londonfreelance.org/
		//index base or name base switch the frame
		
		//move to main page
		driver.switchTo().defaultContent();
		
		
		// sel 4.x
		driver.switchTo().parentFrame();
		
	}
}
