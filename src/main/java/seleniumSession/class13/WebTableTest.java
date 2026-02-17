package seleniumSession.class13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");

		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");

		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(5000);
		System.out.println("Login succesfully");

		driver.switchTo().frame("mainpanel");
		Thread.sleep(5000);

		driver.findElement(By.linkText("CONTACTS")).click();
		// Josh Butler

		System.out.println(getContactCompany("Josh Butler"));

	}

	public static void selectContact(String contactName) {

		String xpath = "//a[text()='" + contactName
				+ "']/parent::td/preceding-sibling::td/child::input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();

	}

	public static String getContactCompany(String contactName) {

		String xpath = "//a[text()='" + contactName
				+ "']/parent::td/following-sibling::td/child::a[@context='company']";
		return driver.findElement(By.xpath(xpath)).getText();

	}

	public static void getContactPhone(String contactName) {

	}

	public static void getContactEmail(String contactName) {

	}
}
