package seleniumSession.class22_24;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWAitConcept {
	
	static WebDriver driver; 
	public static void main(String[] args) {
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);// sel 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Sel 4.x
		
		//imp wait : Gloabl Wait : applied to all the elemnts by default:
		//FE /FEs
		
		driver.get("");
//		//Lagin page:
//		//total timeout =10Sec
//		driver.findElement(By.id("")).sendKeys("");//el:10
//		// e2 : 10
//		//e3: 10
//		//e4:10
//		//e4: .....en:10
//		
//		// Hope page :
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //Sel 4.x
//		
//		//he1: 15
//		//hw2 :15
//		
//		//login out 15 :
//		
//		//login page : 15 sec
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Sel 4.x
//		
//			//e1 e2 e3:
//	
//		//cart Page : 0 : nullify of imp wait :0
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0)); //Sel 4.x
//		
		
		//case 2
		
	// login page : 10 sec
		//e1 :10
		///e2 :10
		///e3 :10
		///e4 :10
		///
	
	// case 3:
		//its only for WebElements
		//not applicable for non web elements: alert ,title ,urls ,browser window,
		
	// Avoid implicitlyWait in your realtime frameworks
		
	//Wait(i) : until();-----> FluentWait(c) : until(){} + other methods  -->WebDriverWait (c)
		
		
		
	}
	
	

}
