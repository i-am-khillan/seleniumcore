package java8featureLamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartStreams {
	
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> linksList=driver.findElements(By.tagName("a"));
		
		//Stream :Returns a sequential Stream with this collection as its source.
//stream means : sequencel stream
		//java 1.8 
		System.out.println(linksList.size());
		//linksList.stream().forEach(e ->System.out.println(e.getText()));;
		List<String> flipkarList=new ArrayList<>();
		
		
//		linksList
//		.stream()
//			.filter(e -> !e.getText().isEmpty())
//			 .filter(e ->e.getText().startsWith("Flipkart"))	
//			.forEach(e -> flipkarList.add(e.getText()));
//		
//		System.out.println(flipkarList);
		//problem with streams
		// use with limited data 
		// debugging is hard using the streams
		//		

		
	//-------------------------//---------------
		
		List<WebElement> FlipkartElementList=linksList
		.stream()
			.filter(e -> !e.getText().isEmpty())
			 .filter(e ->e.getText().startsWith("Flipkart"))	
			.collect((Collectors.toList()));
		
		FlipkartElementList.forEach(e ->flipkarList.add(e.getText()));
		
		System.out.println(flipkarList);
	
	}

}
