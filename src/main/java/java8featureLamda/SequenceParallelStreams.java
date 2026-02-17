package java8featureLamda;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SequenceParallelStreams {

	
	
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> linksList=driver.findElements(By.tagName("a"));
	
	//1. sequence Stream
		
//		long stTime=System.currentTimeMillis();
//		linksList.stream().forEach(e -> System.out.println(e.getText()));
//	long endTime=System.currentTimeMillis();
//	System.out.println("time taken : "+(endTime-stTime));//10981
//	
	// Parallel Stream:
	long stTime=System.currentTimeMillis();
	linksList.parallelStream().forEach(e-> System.out.println(e.getText()));
	long endTime=System.currentTimeMillis();
	System.out.println("time taken : "+(endTime-stTime));//15443
	}
}
