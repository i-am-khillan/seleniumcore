package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcepts {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//text----getText()
		//attribute ---> getAttribute();
		// get all the links and capture the href value
		 driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//tottal text fields on the page :
		System.out.println("----------------------");
//		
//		String fn_placeHolder=driver.findElement(By.id("input-firstname")).getAttribute("placeholder"
//		);
//		String fn_type=driver.findElement(By.id("input-firstname")).getAttribute("type"
//				);
//		String fn_name=driver.findElement(By.id("input-firstname")).getAttribute("name"
//				);
//		System.out.println(fn_placeHolder);
//		System.out.println(fn_type);
//		System.out.println(fn_name);
//		
//		
		
		List<WebElement> listOfTextField=driver.findElements(By.className("form-control"));
//		
//		System.out.println(listOfTextField.size());
	
		By firstName=By.id("input-firstname");
		By registeredLink=By.linkText("Register");
		
		
		String	fn_placeHolder=doGetElementGetAttribute(firstName,"placeholder");
		System.out.println(fn_placeHolder);
		System.out.println(doGetElementGetAttribute(firstName,"class"));
	//attribute	
		System.out.println(doGetElementGetAttribute(firstName,"type"));
	//links 	
		System.out.println(doGetElementGetAttribute(registeredLink,"href"));
		
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static String doGetElementGetAttribute(By locator,String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	

}
