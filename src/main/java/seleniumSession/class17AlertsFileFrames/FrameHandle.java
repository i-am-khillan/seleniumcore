package seleniumSession.class17AlertsFileFrames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		// driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

	
		//frame  : webelement : DOM
		
		//Browser ---- Page : webElement 
							//Frame: webElement
		
		
		driver.switchTo().frame("framename");
		
		//iframe --- mordel application used iframe
		
		
	}
}
