package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FEsUtil {

	public static List<WebElement> getElements(By locator) {

		return driver.findElements(locator);
	}

	public static int getElementsCount(By locator) {

		return driver.findElements(locator).size();
	}
	public static ArrayList<String> getElementsTextList(By locator) {

		List<WebElement>eleList= getElements(locator);
		
		ArrayList<String> eleTextList=new ArrayList<String>();
	for(WebElement e: eleList) {
		String text=e.getText();
		if(text.length()!=0) {
			eleTextList.add(text);
		}
	}
	return eleTextList;
	
}
	
	public static ArrayList<String> getElementsAttributeList(By locator,String attriName) {

		List<WebElement>eleList= getElements(locator);
		
		ArrayList<String> eleAttributeList=new ArrayList<String>();
	for(WebElement e: eleList) {
		String Attribute=e.getAttribute(attriName);
		if(Attribute.length()!=0) {
			eleAttributeList.add(Attribute);
		}
	}
	return eleAttributeList;
	
}

	static WebDriver driver;
	
	
	// login to newsletter -- give me the list of specific items
	
	

	public static void main(String[] args) {

		// web scrabing machenizm

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		By links = By.tagName("a");
		By images = By.tagName("img");

		System.out.println("links count: " + getElementsCount(links));
		System.out.println("imagesinks count: " + getElementsCount(images));

		
//	ArrayList<String>eleTexts=	getElementsTextList(links);
//		System.out.println(eleTexts);
//		if(eleTexts.contains("help")) {
//			System.out.println("Pass");
//		}
//	
		

		ArrayList<String>eleAttribute=	getElementsAttributeList(images,"alt");
		System.out.println(eleAttribute);
	}
}
