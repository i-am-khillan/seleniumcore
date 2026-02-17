package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utils.ElementException;

public class SelectClassConcept {
	
	
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		// select base drop down
		//jquery drop down
		//
		driver=new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/dropdown");
		
		
//		WebElement country=driver.findElement(By.id("country"));
//		Select select=new Select(country);
//		
//		//select.selectByIndex(5);// month,weekday,
//		//select.selectByVisibleText("India");//better ,dybamic value
//	select.selectByValue("AF");//IN,AF
		
		
		By country=By.id("country"); //NoSuchElementException
		
		doSelectByIndex(country, 1); // 
		doSelectByVisibleText(country, "India");
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByIndex(By locator,int index) {
		Select select=new Select(getElement(locator));
		
		select.selectByIndex(index);
	}
	public static void doSelectByVisibleText(By locator,String visiableText) {
		if(visiableText==null || visiableText.length()==0) {
			throw new ElementException("Visible text can not be null");
		}
		
		Select select=new Select(getElement(locator));
		
		select.selectByVisibleText(visiableText);
	}
	public static void doSelectByValue(By locator,String value) {
		
		if(value==null || value.length()==0) {
			throw new ElementException("Visible text can not be null");
		}
		Select select=new Select(getElement(locator));
		
		select.selectByValue(value);
	}

}
