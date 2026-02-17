package seleniumSession.class19_RelativeLocators_SVG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementConcepts {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//https://selectorshub.com/xpath-practice-page
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	
	//Svg element : scale vector graph.
		//normal formala not work
		
		//*[local-name()='svg']
		
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("macbook");
		driver.findElement(By.xpath("//button//*[local-name()='svg']")).click();
		
		
	
	}

}
