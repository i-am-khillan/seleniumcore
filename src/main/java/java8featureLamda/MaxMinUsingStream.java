package java8featureLamda;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxMinUsingStream {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//driver.switchTo().alert().accept();
	List<WebElement> price=	driver.findElements(By.cssSelector("div.inventory_item_price"));
	
	price.stream().forEach(e -> System.out.println(e.getText()));
	
	/*
	 * System.out.println("----"); List<Double>
	 * price_desc_sorted=price.stream().map(e
	 * ->Double.parseDouble(e.getText().substring(1))).sorted(
	 * Comparator.reverseOrder()).collect(Collectors.toList());
	 * 
	 * System.out.println(price_desc_sorted);
	 * 
	 * System.out.println("Max"+ price_desc_sorted.get(0));
	 * System.out.println("min"+ price_desc_sorted.get(price_desc_sorted.size()-1));
	 */
	System.out.println("-------");
	
	double firstPrice=price.stream().
			map(e->Double.parseDouble(e.getText().substring(1))).findFirst().get();
	System.out.println(firstPrice);
	System.out.println("------");
	double lastPrice=price.stream().
			map(e->Double.parseDouble(e.getText().substring(1))).reduce((first, second) -> second).get();
	
	System.out.println(lastPrice);
	
	System.out.println("------");
	
double maxPrice=	price.stream().
	map(e->Double.parseDouble(e.getText().substring(1)))
	 .max(Double::compareTo).get();
System.out.println(maxPrice);	
double minPrices=	price.stream().
map(e->Double.parseDouble(e.getText().substring(1)))
 .min(Double::compareTo).get();

System.out.println(minPrices);


//
driver.get("https://demo.guru99.com/test/web-table-element.php");

//*[@id="leftcontainer"]/table/tbody/tr[]/td[4]
//*[@id="leftcontainer"]/table/tbody/tr[3]/td[4]

double maxStockPrice=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[4]"))
.stream().map(e ->Double.parseDouble(e.getText()))
.max(Double::compareTo).get();
System.out.println(maxStockPrice);

	}

	
}
