package seleniumSession.class17AlertsFileFrames;

import java.net.URI;
import java.util.function.Predicate;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlerts {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//basic auth --- need to enter in the page
				//admin and admin
				
		driver = new ChromeDriver();
		//if you have password pass@123
		
		//basic auth:
		String username="admin";
		String password="admin";
		
	
	//sel  4.x
		
	//HasAuthentication
		((HasAuthentication)driver)
		.register(UsernameAndPassword.of(username,password)
				
		);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
	}
}
