package seleniumSession.class15ActionsClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMoveToElement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		//driver.get("https://www.devmedia.com.br");

		driver.get("https://www.spicejet.com/");
		// driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// WebElement
		// elemnt=driver.findElement(By.xpath("//font[normalize-space()='Courses']"));

		// WebElement elemnt = driver.findElement(By.xpath("//a[text()='Desktops']"));
//		Actions act = new Actions(driver);// font[normalize-space()='Articles']
//		act.moveToElement(elemnt).perform();
//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Show All Desktops']")).click();
//		
//		System.out.println(driver.findElement(By.xpath("//p[normalize-space()='Example of category description text']")).getText());
//		

		/*
		 * By parent = By.xpath("//span[@id='btn-menu-mobile-curso']"); By subMenu = By.
		 * xpath("//nav[@class='submenu-list-itens']//child::a[normalize-space()='HTML e CSS']"
		 * );
		 * 
		 */
		
		By parent = By.xpath("//div[text()='Add-ons']");
		By subMenu = By.xpath("//div[text()='Visa Services']");
		
		handleMenuSubMenu(parent,subMenu);
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void handleMenuSubMenu(By parentLocator, By subMenuLocator) throws InterruptedException {
		Actions act = new Actions(driver);// font[normalize-space()='Articles']
		act.moveToElement(getElement(parentLocator)).perform();
		Thread.sleep(5000);
		getElement(subMenuLocator).click();
		
	}

}
