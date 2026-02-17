package seleniumSession.class17AlertsFileFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		// driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

		// type=file is mandatory you can handle by selenium
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\kverma\\Pictures\\response.png");

		//type=file is not there than need to ask to developer to ad this value for automations
		
		//100 mb  --40 secs
		//Fleunt Wait
		//sikuli --- image based /resolution based 
		//or autoIT --- only for windows machine -- won't work in docker ,headless,jekins ,linux mac
		
	}

}
