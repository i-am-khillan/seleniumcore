package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeTestOld {
	
	public static void main(String[] args) {
		
		
		//4.0.0 download manually chrome.exe
		//set the system property
		
		
		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		
		//Exception in thread "main" java.lang.IllegalStateException: The path to the driver executable The path to the driver executable must be set by the webdriver.chrome.driver system property; for more information, see https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver. The latest version can be downloaded from https://chromedriver.storage.googleapis.com/index.html
		
	//	WebDriver driver=new ChromeDriver();
		
		// selenium manager : 4.6.0 +
		//SM
		//
	// chrome browser(121) --> machine(121)----> download chromedriver 121.exe ---> .cache folder
		// chrome browser(122) --> machine(122)----> download chromedriver 122.exe ---> .cache folder
		
		//WebDriver driver=new ChromeDriver();
		//SM -- checking in ur local (browser 121) and do u have chromedriver 121.exe ---yes --no need to download manually
		
		//if you are not having it --need to download
		
		
		
		 WebDriver driver =new FirefoxDriver();
		//4.17 for firfox
		
		//users/.cache/selenium driver 
		//Selenium manager : birnary driver (.exe)  managment componet in selenium
		
		
		
		
		
	}

}
