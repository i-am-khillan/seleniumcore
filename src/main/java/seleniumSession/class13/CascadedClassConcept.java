package seleniumSession.class13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CascadedClassConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		//naveen@gmail.com
		
		//org.openqa.selenium.InvalidSelectorException: Compound class names not permitted
		//driver.findElement(By.className("TextInput__StyledInput-dZxQPg eaGEy")).sendKeys("naveen@gmail.com");
		
		
		//valid
		//validriver.findElement(By.xpath("//input[@class='TextInput__StyledInput-dZxQPg eaGEy']")).sendKeys("test");
		
		//NSE
		//driver.findElement(By.xpath("//input[@class='login-email']")).sendKeys("test");
		
		//valid
		//driver.findElement(By.xpath("//input[contains(),'login-email']")).sendKeys("test");
		
		//valid --- cssSelector
		//driver.findElement(By.cssSelector("input.TextInput__StyledInput-dZxQPg.eaGEy")).sendKeys("test");

		//input.TextInput__StyledInput-dZxQPg
		//single class --valid with cssSelector
//		driver.findElement(By.cssSelector("input.TextInput__StyledInput-dZxQPg")).sendKeys("te234st");

//valid
	//	driver.findElement(By.cssSelector("input.TextInput__StyledInput-dZxQPg")).sendKeys("te234st");
	
		//org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //input[@tsad@@#='TextInput__StyledInput-dZxQPg' because of the 
		driver.findElement(By.xpath("//input[@tsad@@#='TextInput__StyledInput-dZxQPg'")).sendKeys("te234st");
		
		
		//css 
		///.eaGEy.TextInput__StyledInput-dZxQPg
		

	}

}
