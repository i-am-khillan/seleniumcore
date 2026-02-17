package testngConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	
	/**
	 *  boolean enabled() default true;
	 *   String[] dependsOnGroups() default {};
	 *     String[] dependsOnMethods() default {};
	 *     long invocationTimeOut() default 0;
	 *      int invocationCount() default 1;
	 *       int threadPoolSize() default 0;
	 *       int successPercentage() default 100;
	 *        String dataProvider() default "";
	 *         Class<?> dataProviderClass() default Object.class;

  String dataProviderDynamicClass() default "";
    boolean alwaysRun() default false;
  boolean skipFailedInvocations() default false;
  int priority() default 0;
	 */
	

	@Test(priority=1)
	public void titleTest() {
		String title =driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google","title is not matched");
	}

	@Test(priority=2,enabled=false)
	public void imageTest() {
	boolean flag=	driver.findElement(By.cssSelector("div.FPdoLc >center >input.RNmpXc")).isDisplayed();
		
	Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void urlTest() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("google"));
		
	}
	
	//AAA ---- Pattern
	
}
