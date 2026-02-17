package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDriverAgain {

	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver(); // launch the browser

		driver.get("https://www.google.com");// enter the url

		String title = driver.getTitle();
		System.out.println("Page title : " + title);

		
		
		 driver = new ChromeDriver(); // launch the browser

			driver.get("https://www.google.com");// enter the url

			String titles = driver.getTitle();
			System.out.println("Page title : " + titles);

			System.out.println(driver.getTitle());
			
		
		
		
		
		
		
	}
}
