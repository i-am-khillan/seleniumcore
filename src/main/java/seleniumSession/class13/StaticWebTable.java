package seleniumSession.class13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		//driver.get("https://classic.crmpro.com/index.html");
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
	List<WebElement>elementList=driver.findElements(By.xpath("//table[@id='customers']//tr"));
	int rowAcount=elementList.size();
	System.out.println(elementList.size()-1);
	int colCount=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	System.out.println(colCount);
	//*[@id="customers"]/tbody/tr[2]/td[1]
	//*[@id="customers"]/tbody/tr[3]/td[1]
	//*[@id="customers"]/tbody/tr[4]/td[1]
	//*[@id="customers"]/tbody/tr[5]/td[1]
	
	String beforeXpath="//*[@id=\"customers\"]/tbody/tr[";
	String afterXpath="]/td[1]";
	
	for(int row=2;row<rowAcount;
			row++) {
		
		String companyXpath=beforeXpath+row+afterXpath;
		//System.out.println(companyXpath);
		String text=driver.findElement(By.xpath(companyXpath)).getText();
		System.out.println(text);
	}
	
	
	List<WebElement> tableDataList=driver.findElements(By.xpath("//table[@id='customers']//child::tr/td"));
	
	for(WebElement e: tableDataList) {
		System.out.println(e.getText());
		
	}
	
	//
	for(int col=1;col<=colCount;col++) {
		List<WebElement> colListData=driver.findElements(By.xpath("//table[@id='customers']//tr/td["+col+"]"));
		
		for(WebElement e: colListData) {
			System.out.println(e.getText());
		}
	
	}
	
	}
	//give me contact and country list
	

}
