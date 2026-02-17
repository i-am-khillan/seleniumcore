package seleniumSession.class11;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTalbeCriInfo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		//driver.get("https://www.espncricinfo.com/");
		driver.get("https://www.espncricinfo.com/series/west-indies-in-new-zealand-2025-26-1491681/new-zealand-vs-west-indies-2nd-test-1491733/live-cricket-score");
		
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//span[text()='Stumps']")).click();
//		Thread.sleep(4000);
//		String playerName=driver.findElement(By.xpath("//span[text()='Devon Conway']")).getText();
//		
//		System.out.println(playerName);
//		
		// Devon Conway(

		System.out.println(getPlayerName("Devon Conway"));
		System.out.println(getPlayerNameDetails("Devon Conway"));

		
		
		
		
		
		
		// print the all score card of all the players
		//XpathAxes
		
		//https://www.espncricinfo.com/series/australia-in-new-zealand-2023-24-1388188/new-zealand-vs-australia-1st-test-1388226/full-scorecard
		
	}

	public static String getPlayerName(String bastmanName) {

		return driver
				.findElement(By.xpath("//span[text()='" + bastmanName + "']//ancestor::tr[@class='ds-border-none']/td"))
				.getText();
	}

	public static List<String> getPlayerNameDetails(String bastmanName) throws InterruptedException {
		Thread.sleep(4000);
		List<WebElement> informElements = driver.findElements(
				By.xpath("//span[text()='" + bastmanName + "']//ancestor::tr[@class='ds-border-none']/td"));
		List<String> playerDetails = new ArrayList<>();
		Thread.sleep(2000);
		for (WebElement e : informElements) {
			String text = e.getText();
			playerDetails.add(text);
		}
		return playerDetails;

	}
	
	public static List<String> getScoreCard(String batsmanName) throws InterruptedException {
		
		
		List<WebElement> scoreEles=driver.findElements(
				By.xpath("//span[text()='" + batsmanName + "']//ancestor::tr[@class='ds-border-none']/td"));

		List<String> playerDetails = new ArrayList<>();
		Thread.sleep(2000);
		for (WebElement e : scoreEles) {
			String text = e.getText();
			playerDetails.add(text);
		}
		return playerDetails;

	}
}
