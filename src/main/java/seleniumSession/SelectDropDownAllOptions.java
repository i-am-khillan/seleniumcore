package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");

		By country = By.id("country");

		doSelectDropDownValue(country, "IN");

	}

	public static List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> optionList = getDropDownOptionList(locator);
		List<String> optionsTextList = new ArrayList<String>();

		for (WebElement e : optionList) {
			String optionText = e.getText();
			optionsTextList.add(optionText);
		}
		return optionsTextList;
	}

	public static List<WebElement> getDropDownOptionList(By locator) {
		WebElement element = driver.findElement(locator);
		Select select = new Select(element);

		return select.getOptions();

	}

	public static int getDropDownValuesCount(By locator) {

		return getDropDownOptionList(locator).size();
	}

	public static void doSelectDropDownValue(By locator, String value) {
		List<WebElement> optionList = getDropDownOptionList(locator);
		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}
		}

	}

	public static void printSelectDropDownValue(By locator) {
		List<WebElement> optionList = getDropDownOptionList(locator);
		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);

		}

	}
}
