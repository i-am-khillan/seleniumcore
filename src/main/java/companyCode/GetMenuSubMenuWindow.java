package companyCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetMenuSubMenuWindow {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
			driver=new ChromeDriver();
			driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			Actions a=new Actions(driver);
			WebElement element=driver.findElement(By.xpath("//a[text()='Women']"));
			Thread.sleep(3000);
			
			WebElement elementa=driver.findElement(By.xpath("//a[text()='Blouses']"));
			a.moveToElement(element).click(elementa).build().perform();
			String headerText=driver.findElement(By.xpath("//h1['Blouses']")).getText();
			
			System.out.println(headerText);
			if(headerText.contains("BLOUSES")) {
				System.out.println("Header verification & Pass");
			}
			else
			{
				System.out.println("Header verification : FAIL");
			}
			
			//elementa.click();
		}
	

}
