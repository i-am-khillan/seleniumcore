package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BrowserUtils;
import utils.ElementUtil;

public class OpenCartLoginTest {

	public static void main(String[] args) {

		BrowserUtils brUtil = new BrowserUtils();
		WebDriver driver = brUtil.launchBrowser("chrome");

		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title =brUtil.getPageTitle();
		System.out.println(title);
		
		By userName = By.id("input-email");
		By pwd = By.id("input-password");
	
		ElementUtil elementUtil= new ElementUtil(driver);
		elementUtil.doSendKeys(userName, "Vish@gmail.com");
		elementUtil.doSendKeys(pwd, "Vish@.123");
			
		
		//brUtil.closeBrowser();
		
		
		// Assignment :  Registers methods 
		// just create the BrowserUtil and elemnt Utils
			
		
		
		
		
		
		
	}

}
