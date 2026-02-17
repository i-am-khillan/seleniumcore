package revision.qa;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://ingenico.com/en");
		List<WebElement> element=driver.findElements(By.xpath("//a"));
		
		for(WebElement e: element) {
			String url =e.getAttribute("href");
			
				
				
			try {
				HttpURLConnection conntions=(HttpURLConnection) new URL(url).openConnection();
				 conntions.connect();
				 
				 if(conntions.getResponseCode()!=200) {
					 System.out.println("brokenLinks :"+url);
				 }
				 else {
					 System.err.println("working links ="+url);
					 
				 }
				
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
			
		
			
		}
		
	}

}
