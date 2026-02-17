package seleniumSession;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class TopCastingOptions {
	
	//topCasting : 
	
	public static void main(String[] args) {
		
		
		// 1. WD d=new CD();
		//valid --- recommended
		// run test on local machine
		//WebDriver driver=new ChromeDriver();
		
		//2. SC driver =new CD();
		//valid --- not recommended
		//SearchContext driver=new ChromeDriver();
		
		// only two methods we have access : 
		
		//3. RWD driver =new CD();
		//valid == recommended
		//RemoteWebDriver driver=new ChromeDriver();
		
		
		//4 .valid --- not recommended
		//ChromiumDriver driver=new ChromeDriver();
		
		//5. WD Driver =new RWD();
		//valid == recommended
		// run tests on the remote /server /cloud marchine grid
	// sauce labs / browser Stack /lamdatest
		
		//	WebDriver driver=new RemoteWebDriver(serverURL,Capabilities);
		
		//6. 
		//valid == not recommended
//		SearchContext driver=new  RemoteWebDriver(serverURL,Capabilities);

		//7. CD driver =new chromDriver();
		//valid but works only for chrome browser
		//ChromeDriver driver =new ChromeDriver();
		// FirfoxDriver driver=new FirfoxDriver();
		
		//7.
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
