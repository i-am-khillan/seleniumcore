package seleniumSession.class10SelectOptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		By dropDownLocator = By.id("justAnInputBox");
		By choice = By.xpath("//span[@class='comboTreeItemTitle']");

		//TC 1 //single selection
		//selectChoice(dropDownLocator,choice,"choice 1");
		//TC 2 , multiple selection
		selectChoice(dropDownLocator, choice, "choice 1", "choice 2","choice 4","choice 2 1");

		//TC 3 all Selection 
		//Select all 
	//	selectChoice(dropDownLocator, choice, "all");
		
		

	}
	/**
	 * this method is used to handle single ,multiple selection , all selection .please pass "all" in case of all selections;
	 * 
	 * 
	 * @param dropDownLocator
	 * @param choice
	 * @param value
	 * @throws InterruptedException
	 * 
	 *  String...  varArgs -- spread parameter(JS) --- array
	 *  you can pass the multiple choice
	 */

	public static void selectChoice(By dropDownLocator, By choice, String... value) throws InterruptedException {
		driver.findElement(dropDownLocator).click();
		Thread.sleep(3000);
		
		
		List<WebElement> choiceList = driver.findElements(choice);

		// do not select All if you pass the same
		if(!value[0].equals("all")) {
			
			
			
			Thread.sleep(3000);
			System.out.println(choiceList.size());

			for (WebElement e : choiceList) {

				String text = e.getText();
				System.out.println(text);
				for (String val : value) {

					if (text.equals(val)) {
						e.click();
						//break;
					}
				}
			}
			
		}
		else {
			//All selection logic:
			for(WebElement eL:choiceList) {
				try {
				eL.click();
				}
				catch(ElementClickInterceptedException e) {
					break;
				}
			}
		}
	}
}
