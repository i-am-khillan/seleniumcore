package seleniumSession;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.BrowserUtils;
import utils.ElementUtil;
import utils.StringUtils;

public class RegistrationPage {

	
	//change the email id unique each time
	
	//
	public static String getRadomEmail() {
		return "automation"+System.currentTimeMillis()+"@"+"opencat.com";
		//return "automation"+UUID.randomUUID()+"@opencat.com";
	
	//9999-98999-99999-988
	//automation1764916182114@opencat.com
	//automation1764916182114@opencat.com
	//automation1764916182114@opencat.com
	//automation1764916182114@opencat.com
	//automation1764916182114@opencat.com
	//automation1764916182114@opencat.com
		
		//delete from user where email like '%automation%';
	
	}

	public static void main(String[] args) {

		 BrowserUtils brUtil=new BrowserUtils();
		WebDriver driver= brUtil.launchBrowser("chrome");

		//driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	//	driver.get("https://naveenautomationlabs.com/opencart/index.php");
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
		By fn=By.id("input-firstname");
		By ln=By.id("input-lastname");
		By email=By.id("input-email");
		By tel=By.id("input-telephone");
		By pwd=By.id("input-password");
		By confirmPwd=By.id("input-confirm");
		
		By subcribeYes=By.xpath("//input[@name='newsletter' and @value='1']");
		By subcribeNo=By.xpath("//input[@name='newsletter' and @value='0']");
		
		By checkBoxPolicy= By.xpath("//input[@name='agree' and @value='1']");
		By continueButton=By.xpath("//input[@value='Continue' and @type='submit']");
		
		By successMessage=By.tagName("h1");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(fn, "vish");
		eleUtil.doSendKeys(ln, "bh");
		eleUtil.doSendKeys(email, StringUtils.getRadomEmail()); //vish@gmail.com
		eleUtil.doSendKeys(tel, "8874541254");
		eleUtil.doSendKeys(pwd, "admin123");
		eleUtil.doSendKeys(confirmPwd, "admin123");
		
		eleUtil.doClick(subcribeYes);
		eleUtil.doClick(checkBoxPolicy);
		eleUtil.doClick(continueButton);
		
		String actSuccMessage=eleUtil.doGetElementText(successMessage);
		//Your account has been created
		
		/**
		 * Your Account Has Been Created!
Congratulations! Your new account has been successfully created!

You can now take advantage of member privileges to enhance your online shopping experience with us.

If you have ANY questions about the operation of this online shop, please e-mail the store owner.

A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please contact us.

		 * 
		 */
		
		System.out.println(actSuccMessage);
		if(actSuccMessage.equalsIgnoreCase("Your account has been created!")) {
			
			System.out.println("user reg----PASSED");
		}
		else {
			System.out.println("user Reg---FAILED");
		}
		
		
		String url =brUtil.getPageURL();
	}
		
	//Excel 
	//DB 
	//selenium related thing will go for Utilitiy
	
	
	}
	
	
	

