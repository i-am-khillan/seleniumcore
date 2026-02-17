package testngConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartLoginTest extends BaseTest {
	
//verbose="3">   -- debugging level ---- 1 to 10 limit
	@Test(priority=1)
	public void titleTest() {
		String title =driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login","title is not matched");
	}

	@Test(priority=2,enabled=false)
	public void imageTest() {
	boolean flag=	driver.findElement(By.cssSelector(".img-responive")).isDisplayed();
		
	Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void urlTest() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("account/login"));
		
	}

}
