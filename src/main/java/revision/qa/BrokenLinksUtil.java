package revision.qa;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksUtil {

	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriver driver = new ChromeDriver();
		String urls = "https://naveenautomationlabs.com/opencart/index.php?route=account/login";
		List<String> arraylist = brokenLinks(driver, urls);
		System.out.println(arraylist.size());

	}

	public static List<String> brokenLinks(WebDriver driver, String urls) throws MalformedURLException, IOException {
		driver.get(urls);
		List<String> brokenLinks = new ArrayList<>();
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for (WebElement e : links) {
			String url = e.getAttribute("href");

			HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
			con.connect();
			if (con.getResponseCode() != 200) {
				brokenLinks.add(url);
			}
		}
		return brokenLinks;
	}

}
