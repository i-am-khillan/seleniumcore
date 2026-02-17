package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadllessConcepts {

	public static void main(String[] args) {

		// Headless vs headed

		// headless: nobrowser visibility
		// faster
		// run tcs on CI/CD /jenkins /linux: headless

		// Recommended:not recommended testing or automation strategy

		// local: yes
		// problems: its not an actual user simulation
		// complex apps /html DOM: not working headless
		// Alerts /popups : could be a problems

		ChromeOptions co = new ChromeOptions();
		// co.addArguments("--headless");
		// co.addArguments("--incognito");
		co.addArguments("--start-maximized");
		co.addArguments("---disable-infobars");
		co.addArguments("kiosk");
		WebDriver driver = new ChromeDriver(co);
//		
//		FirefoxOptions fo=new FirefoxOptions();
//		fo.addArguments("--headless");
//		WebDriver driver=new FirefoxDriver(fo);
//		
//		

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getTitle());

		driver.quit();

		// Headless options:

		// ghostdriver
		// phantomJS
		// htmlunitdriver

	}

}
