	
	package seleniumSession;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

	public class EdgeDrivers {
		
		//https://naveenautomationlabs.com/opencart/index.php?route=account/login

		public static void main(String[] args) {

			// lunch the browser
			// enter the url
			// get the title
			// verify the title -- expected vs actual

			
			
			//automation steps ---
			WebDriver driver = new EdgeDriver(); // launch the browser

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
			
			driver.close();
			
			
		
		}
	
}
