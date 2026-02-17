package seleniumSession.class21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframes {


	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		Thread.sleep(3000);
	
	driver.switchTo().frame("pact1"); //f1
	driver.findElement(By.id("inp_val")).sendKeys("Testing");
	driver.switchTo().frame("pact2");//f2
	driver.findElement(By.id("jex")).sendKeys("automation");
	
	driver.switchTo().frame("pact3");//f3
	driver.findElement(By.id("glaf")).sendKeys("SDET Google");
	
	
	// reverse is not possible only possible  f3 to f2 to f1
	
	//f3 --> f2 ---using switch().frame()? ": Npppp
	//f3 -- parentFrame(): f2  :yes
	//f2 --> parentFrame(): f1 : yess
	//not jump to frame 1 to 3 that should be sequence
	
//	driver.switchTo().defaultContent();// go to main page
//	driver.findElement(By.id("inp_val")).sendKeys("Testing with fun");
//	System.out.println(driver.findElement(By.tagName("h3")).getText());
//	
	
	//Sel 4.x 
//	driver.switchTo().parentFrame();//to f2 frame
//	driver.findElement(By.id("jex")).sendKeys("automation");
//	
//	driver.switchTo().parentFrame();//to f1 frame
//	driver.findElement(By.id("inp_val")).sendKeys("automation");
//	
	
//	driver.switchTo().parentFrame();// go to page 
//	driver.switchTo().defaultContent();// got to page
//	driver.findElement(By.id("inp_val")).sendKeys("automation");
//	System.out.println(driver.findElement(By.tagName("h3")).getText());
//	
	
	}
}
