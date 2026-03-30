package seleniumSession.class_single_MultiSelectionWebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ElementUtil;

public class HandleCalender {
	
	static WebDriver driver;
	static ElementUtil elementUtil;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		Thread.sleep(6000);

		elementUtil = new ElementUtil(driver);

		driver.findElement(By.id("datepicker")).click();
		//driver.findElement(By.xpath("//a[text()='9']")).click();
	
	//	selectFutureDate("June 2028","9");
	//	selecteDatePrevious("June 2025","9");
		selectDate("June 2024","9","prev");
		
	}
	public static void selectDate(String expectedMonthYear,String date,String type) {
	
		String actmonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			System.out.println(actmonthYear);
			
			while(!actmonthYear.equalsIgnoreCase(expectedMonthYear))//"May 2027"
				{
				//click on next icon;
				switch(type) {
				case "next":
					driver.findElement(By.xpath("//span[text()='Next']")).click();
					break;
				case "prev":
					driver.findElement(By.xpath("//span[text()='Prev']")).click();
					break;
					default:
						break;
				}
				 actmonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText(); //div.ui-datepicker-title
				
			}
			selectDate(date);//date="9"
	}
	
//makeMytrip
//red.bus
//spikeJet
	
	
	public static void selectFutureDate(String expectedMonthYear,String date) {
		
		if(expectedMonthYear.contains("February")) {
			//feb check: 
			//leap year : 29 days
			if(Integer.parseInt(date) >29 &&Integer.parseInt(date)<=0 ) {
				throw new EleException("WRONG DATE PASSED... PLZ PASS Date bw 1 to 29");
			}
		}
		
		if(Integer.parseInt(date) >31 &&Integer.parseInt(date)<=0 ) {
			throw new EleException("WRONG DATE PASSED... PLZ PASS Date bw 1 to 31");
		}
		
		
		String actmonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actmonthYear);
		
		while(!actmonthYear.equalsIgnoreCase(expectedMonthYear))//"May 2027"
			{
			//click on next icon;
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			 actmonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText(); //div.ui-datepicker-title
			
		}
		selectDate(date);//date="9"
	}
	public static void selecteDatePrevious(String expectedMonthYear,String date) {
		String actmonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actmonthYear);
		
		while(!actmonthYear.equalsIgnoreCase(expectedMonthYear))//"May 2027"
			{
			//click on next icon;
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			 actmonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText(); //div.ui-datepicker-title
			
		}
		selectDate(date);//date="9"
	}
	public static void selectDate(String date ) {
		driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
			}
}

