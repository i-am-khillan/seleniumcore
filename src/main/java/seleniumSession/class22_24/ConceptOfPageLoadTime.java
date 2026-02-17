package seleniumSession.class22_24;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConceptOfPageLoadTime {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		//Loading is completed than ingore it
		//dynamic wait 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(0));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		long timeTaken=driver.manage().timeouts().getPageLoadTimeout().getSeconds();
		
	System.out.println(timeTaken);
		
	}

}
