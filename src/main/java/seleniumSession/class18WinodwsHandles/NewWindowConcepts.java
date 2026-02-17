package seleniumSession.class18WinodwsHandles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcepts {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		// driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// parent
		String parentWindowId = driver.getWindowHandle();
		Thread.sleep(3000);
		
		//seleniun 4.x
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://wwww.google.com");
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());// orange hrm
		
		driver.close();
	}
}
