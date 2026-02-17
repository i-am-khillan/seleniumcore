package seleniumSession;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BrowserUtils;
import utils.ElementUtil;

public class SpecificAreaOpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 . get all the element list 
		//2. get the element text
		//
		
		
		BrowserUtils brUtil=new BrowserUtils();
		WebDriver driver=brUtil.launchBrowser("chrome");
		
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		// By locator 
		By links =By.className("list-group-item");
		
		//Element list
		ElementUtil eleUtil=new ElementUtil(driver);
		System.out.println(eleUtil.getElementsCount(links));
	
		
		ArrayList<String>linkText=eleUtil.getElementsTextList(links);
		System.out.println(linkText);
		
		
		
		
	}

}
