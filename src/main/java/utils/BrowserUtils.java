package utils;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * A@author kverma
 * 
 */

public class BrowserUtils {

	WebDriver driver;

	
	//
	
	/**
	 * this method is used to init the driver of browser name
	 * @param browserName
	 * @return this return driver
	 */
	/*
	 * 
	 * 
	 * */
	// if webdriver launchBrowser method is static than we don't use this for multi-threaded environment 
	// prevent the parallel excetions.
	public WebDriver launchBrowser(String browserName) {

		System.out.println("browser name : " + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please pass the right browser" + browserName);

			throw new BrowserExceptions("BROWSER NOT FOUND");

		}

		return driver;

	}

	public void launchURL(String url) {
		if (url == null) {
			throw new BrowserExceptions("URL IS NULL");
		}
		if (url.indexOf("http") == 0) {
			driver.get(url);
		} else {
			throw new BrowserExceptions("HTTP IS MISSING IN URL");

		}
	}
	
	public void launchURL(URL url) {
		if (url == null) {
			throw new BrowserExceptions("URL IS NULL");
		}
		String appURL=String.valueOf(url);
		if (appURL.indexOf("http") == 0) {
			driver.navigate().to(url);
		} else {
			throw new BrowserExceptions("HTTP IS MISSING IN URL");

		}
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageURL() {
		return driver.getCurrentUrl();
	}
	public void closeBrowser() {
		 driver.close();
	}
	public void quitBrowser() {
		 driver.quit();
	}
	
	// referssh the page
	

	
	
	
	
	
	
}
