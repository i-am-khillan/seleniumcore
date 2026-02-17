package seleniumSession.class19_RelativeLocators_SVG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import static  org.openqa.selenium.support.locators.RelativeLocator.with;;


public class RelativeLocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//Selenium 4.x
		
		/**
		 * 							Above of element
		 * 							|	
		 *  left of element   <--- element ----> right of element
		 *  
		 *  near of element          |
		 *  
		 * 							below of element 
		 * 
		 */

		driver=new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.linkText("Barrie ,Canada"));
		//static import
	String leftRank=	driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRank);
		
		String NumberRank=	driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(NumberRank);
		
		
		String aboveCity=	driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);
		
		String belowCity=	driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		
		String nearEle=	driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearEle); //50 pixel
		
		
		
		
		
		
	}
}
