package seleniumSession.class21;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementsConcept {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		String script="window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"'),'::before').getPropertyValue('content');";
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//PsuedoElement _ ShadowDoM
		
		//JavascriptExcecutor
		//window
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		String mand_text=js.executeScript("return "+script).toString();
		//String mand_text=js.executeScript(script).toString();//not working 
		
		System.out.println(mand_text);
		
		if(mand_text.contains("*")) {
			System.out.println("Fn is a mandatory field");
		}
		
	}

}
