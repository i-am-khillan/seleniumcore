package seleniumSession.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableClass12 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("apiautomation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(4000);
		// frame
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();

		Thread.sleep(4000);
		SelectContact("Joe Root");
		String comName=getContName("Joe Root");
		System.out.println(comName);
		
		//a[text()='Joe Root']/parent::td/preceding-sibling::td/child::input[@type='checkbox']
		
		//a[text()='Joe Root']/parent::td/following-sibling::td/child::a[@context='company']
	}

	public static void SelectContact(String contactName) {

		String xpath=	"	//a[text='"+contactName+"']/parent::td/preceding-sibling::td/child::input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();
	
	}

	public static String getContName(String contactName) {

		String xpath="//a[text()='"+contactName+"']/parent::td/following-sibling::td/child::a[@context='company']";
		return driver.findElement(By.xpath(xpath)).getText();
		
	}
	public static void getPhoneNumber(String contactName) {

	}
	public static void getContactsInfoList(String contactName) {

	}
}
