package seleniumSession.class15ActionsClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiLevelMenuSubMenu {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		//driver.get("https://www.bigbasket.com/");
		driver.get("https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-PAN-Jan25&gad_source=1&gad_campaignid=22175835974&gbraid=0AAAAA91V9orpHuKDnH6KRIf4P09bwoCDL&gclid=Cj0KCQiAgP_JBhD-ARIsANpEMxyycQl1G5o2SihUGeqXjoj2JG_zMdtyhOtuSjPNyYF5ICDOZy59mqYaAs6SEALw_wcB");

//		WebElement levelMenu1=driver.findElement(By.xpath("//span[text()='Category']"));
//		Thread.sleep(3000);
//		WebElement levelMenu2=driver.findElement(By.xpath("//a[text()='Electronics']"));
//		Thread.sleep(3000);
//		WebElement levelMenu3=driver.findElement(By.xpath("//a[text()='Audio devices']"));
//		Thread.sleep(3000);
//		WebElement levelMenu4=driver.findElement(By.xpath("//a[text()='Headphones']"));

		By levelMenu1 = By.xpath("(//span[text()='Category'])[2]");
		By levelMenu2 = By.xpath("(//a[text()='Electronics'])[2]");
		By levelMenu3 = By.xpath("(//a[text()='Audio devices'])[2]");
		By levelMenu4 = By.xpath("//a[text()='Headphones']");

		handleMultiSubMenus(levelMenu1, levelMenu2, levelMenu3, levelMenu4);
	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

	public static void handleMultiSubMenus(By levelMenu1, By levelMenu2, By levelMenu3, By levelMenu4) throws InterruptedException {
		Actions act = new Actions(driver);
		getElement(levelMenu1).click();
		Thread.sleep(2000);
		act.moveToElement(getElement(levelMenu2)).perform();;
		Thread.sleep(2000);
		act.moveToElement(getElement(levelMenu3)).perform();
		Thread.sleep(2000);
		getElement(levelMenu4).click();
		Thread.sleep(2000);

	}
}
