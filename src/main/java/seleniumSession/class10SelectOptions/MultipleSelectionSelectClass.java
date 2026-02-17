package seleniumSession.class10SelectOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");

		WebElement dropDown = driver.findElement(By.xpath("//select[@multiple]"));

		Select select = new Select(dropDown);
		System.out.println(select.isMultiple()); // true 
		if (select.isMultiple()) {
			System.out.println("Multi select is possbile");
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Andean flamingo");
			select.selectByVisibleText("James's flamingo");
			select.selectByVisibleText("Greater flamingo");

		}

		select.deselectByVisibleText("Andean flamingo");
	}

}
