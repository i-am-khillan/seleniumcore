package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownWithOutUsingSelectClass {

	// not allowed to use select class
	static WebDriver driver;

	public static void main(String[] args) {

		// select base drop down
		// jquery drop down
		//
		driver = new ChromeDriver();

		driver.get("https://practice.expandtesting.com/dropdown");

		// select[@id='']/option
		By option = By.xpath("//select[@id='country']/option");
	//	doSelectValueFromDropDown(option, "India");
		
		doSelectIndexFromDropDown(option,81);

	}

	public static void doSelectValueFromDropDown(By locator, String value) {

		List<WebElement> optionList = driver.findElements(locator);

		System.out.println(optionList.size());
		for (WebElement e : optionList) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}

		}
	}

	public static void doSelectIndexFromDropDown(By locator, int value) {

		List<WebElement> optionList = driver.findElements(locator);

		System.out.println(optionList.size());
		
		for(int i=0;i<optionList.size();i++) {
			
			WebElement ee= optionList.get(i);
			String text=ee.getText();
			int numerice=Integer.parseInt(text);
			if(numerice==value) {
				ee.click();
				break;
			}
			
		}
	}
}
