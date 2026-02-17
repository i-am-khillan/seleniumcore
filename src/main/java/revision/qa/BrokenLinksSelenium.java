package revision.qa;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksSelenium {

	static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException, IOException {
	driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
	driver.get("https://www.selenium.dev/");
	List<WebElement> links=driver.findElements(By.xpath("//a"));
	
	List<String> brokenLinks=new ArrayList<>();
	
	System.out.println(brokenLinks);
	for(WebElement e: links) {
		
		String url=e.getAttribute("href");
		
			HttpURLConnection con=(HttpURLConnection)new URL(url).openConnection();
			
			con.connect();
			
			if(con.getResponseCode()!=200) {
				brokenLinks.add(url);
			}
			else {
				System.out.println("working links");
		}
		
	}
	
		
	}
}
