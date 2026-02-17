package companyCode;

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

		public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {

			driver = new ChromeDriver();
			//driver.get("http://www.automationpractice.pl/index.php?id_category=7&controller=category");
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
			List<WebElement> linkElelment=driver.findElements(By.cssSelector(".list-group a"));
			
			for(WebElement link:linkElelment) {
				String url =link.getAttribute("href");
				
				if(url==null || url.isEmpty()) {
					continue;
				}
				HttpURLConnection con=(HttpURLConnection)new URL(url).openConnection();
				con.connect();
				
				if(con.getResponseCode()!=200 ||con.getResponseCode()!=201) {
					System.out.println("links are broken  :"+url);
				}
				else
				{
					System.out.println("Links are valid   :"+url);
				}
				
				
			}
			
	}
		
}
