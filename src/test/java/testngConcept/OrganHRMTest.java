package testngConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrganHRMTest extends BaseTest{


	@Test(priority=1)
	public void titleTest() {
		String title =driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "30-Day Advanced Free Trial | HR Software | HRMS | OrangeHRM","title is not matched");
	}
	@Test(priority=2)
	public void urlTest() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("30-day-free-trial"));
		
	}

}
