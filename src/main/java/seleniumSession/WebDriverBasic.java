package seleniumSession;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class WebDriverBasic {

	public static void main(String[] args) {

		// lunch the browser
		// enter the url
		// get the title
		// verify the title -- expected vs actual

		
		
		//automation steps ---
		WebDriver driver = new ChromeDriver(); // launch the browser

		driver.get("https://www.google.com");// enter the url

		String title = driver.getTitle();
		System.out.println("Page title : " + title);

		

	// Checkpoint ----// verification point / act vs exp:
		
		if (title.equalsIgnoreCase("google")) {
			System.out.println("correct titel ---Passed");
		} else {

			System.out.println("incorrect title ---Failed");
		}
		
		// automation steps + verification point ----> Automation Testing
		// test steps + verification point --- test case
		
	
		String correctUrl=driver.getCurrentUrl();
		System.out.println(correctUrl);
		
		
		if (correctUrl.contains("https://www.google.com")) {
			System.out.println("url ---Passed");
		} else {

			System.out.println("url ---Failed");
		}
		
		
	// close the browser : quit() and close();
		
		//driver.close(); // browser is closed
		
		//AFter close the browser than you are try to access the driver  
		//seesion is invalid with the same id:
		//Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id
		
		//System.out.println(driver.getTitle());
		
		
		driver.quit();//browser is closed 
		// session id is null :
		//Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?

		
		// New sesssion id is created ;
		 driver = new ChromeDriver(); // launch the browser

		driver.get("https://www.google.com");// enter the url

		String titles = driver.getTitle();
		System.out.println("Page title : " + titles);

		System.out.println(driver.getTitle());
		
	
	}
}
