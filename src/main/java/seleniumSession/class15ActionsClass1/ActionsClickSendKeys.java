package seleniumSession.class15ActionsClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {

	static WebDriver driver;
	private static Actions click;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("");;
	
		By email=By.xpath("");
		Actions act=new Actions(driver);
		
		act.sendKeys(driver.findElement(email),"test@gamil.com").perform();
		
		//act.moveToElement().moveToElement().
		
		click = act.click(driver.findElement(By.xpath("")));
		//SendKeys("") is not working than use sendKeys(locator,String) for actions class
		//elementNotIntractive /elementNotInteraceptable
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	public static void doActionsSendKeys(By locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
}
