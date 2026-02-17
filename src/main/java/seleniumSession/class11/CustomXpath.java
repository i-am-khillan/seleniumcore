package seleniumSession.class11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	
	//https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		
		//Xpath  : Address of the element in the DOM
		//Xmlpath 
		// 1. absolute xpath
		// html/body/div[2]
		//html/body/div[2]/div/div/div[4]/div[1]/div/div[1]/a/img
		//2. relative xpayh (custom xpath)
				
		
		// 1. using the any attr:
		 //tagname[@attrName='value']
		
		 //input[@id='input-email']
		//input[@name='email']
		
		//input[@name]  --5
		//input[@value='Login'] --1
		
		//2. using multiple attribute
	
		//tagname[@attri='value' and @attri2='value' and @attri3='value;]
		
		//input[@name='firstname' and @type='text' and @id='input-firstname'] 		
		
		//input[@type and @value]
		
		//a[@href]   --- 81  --all attribute =href
		
		//3. text()
		//tagname[text()='value']  -- text() is fuction
		//h2[text()='New Customer']
		//a[text()='Register']  ----2
		
		//a[text()='']
		
		
		//4 text() and attributes:
		//tagname[@attri='value' and text()='value']
		
		
		//a[@class='dropdown-toggle' and text()='test']
		
		//5 . contains()  with attri;
		
		//tagname[contains(@attrNmae,'value']
		//input[contains(@placeholder,'E-mail']
		
		//tagname[contains(@attrNmae,'value') and @attri2='value']
		//input[contains(@placeholder,'Address') and @name='email']
		//a[contains(@href,'wishlist')]		

		//dynamic ids:-
		//input id = firstname_123 />
		//input id = firstname_112 />
		//input id = firstname_131 />
		//input id = firstname_101 />
		
		
		//input[contains(@id,'firstname_')]
		
		//6. contains() with text():
		
		//tagname[contains(@attri,'value') and text()='value']
		//a[contains(@href,'signup') and text()='Try it free']
		
		//a[contains(text(),'Try it free')]  ---11
		
		
		//7. contains() with text() and attri:
		//tagname[contains(text(),'value) and contain(@attri ,'value']
		//a[contains(text(),'Notebooks) and contain(@href ,'category')]
		
		//8. 
		//tagname[contains(text(),'value) and contain(@attri ,'value') and @attri2 ='value']
		
		//8 starts-with()
		//tagname[starts-with(@attri, 'value')]
		
		//input[starts-with(@placeholder,'E-Mail')]
		

		//9. starts-with() with text()
		//tagname[starts-with(),'value' and text()='value']
		
		//dynamic ids:-
				//input id = firstname_123 />
				//input id = firstname_112 />
				//input id = firstname_131 />
				//input id = firstname_101 />
		
		
		
		//10. ends-with() is not supported in xpath
		
		//11. Index based xpath
		
		// (//a[text()='Forgotten Password'])[1]
		//(//a[text()='Forgotten Password'])[1]
		
		//(//a[@class='list-group-item])[3]
		
		//(//input[@class='conform-control'])[1]
		//(//input[@class='conform-control'])[position=4]
		
		//(//input[@class='conform-control'])[last()]
		//(//input[@class='conform-control'])[last()-1]
		
		//input[contains(@id,'firstname_') and contains(@id,'_login')]
		
		//Interview question: capture group
		
		//foter link at the last --help verify using the xpath only
		//(((//div[@class='navFooterLinkCol navAccessibility'])[last()])//a[@class='nav_a'])[last()]
		//second last-- element 
		//(((//div[@class='navFooterLinkCol navAccessibility'])[last()])//a[@class='nav_a'])[last()-1]
		
		//second last---element 
		//(((//div[@class='navFooterLinkCol navAccessibility'])[last()-1])//a[@class='nav_a'])[last()-1]
		
		//(((//div[@class='navFooterLinkCol navAccessibility'])[last()-1])//a[@class='nav_a'])[last()]
		
		
		//*
		//*[@id]
		//*[@class='form-control']
		//input[@class='form-control']

		//*[@href]  ---88
		//a[@href]  ---81
		//form/div
		
		
		//parent to direct child:  /
		//form/div/input
		
		//parent to direct + indirect child: //
		
		//select[@id='Form_getForm']//option
		
		//div[@id='content']//img not single / not application
		
		
		
		
		
		
		//html/body//div  --- 
		//indirect --- //
		//direct ----/
		
		
		//child to parent
		
		//input[@id='input-email']//parent::div
		//input[@id='input-email']//ancestor::form
		//input[@id='input-email']//ancestor::body/ancestor::html
		
		//a[text()='Recurring payments']/ancestor::div
		
		//sibling --- following-sibling ( donw)
		//sibling --- preceding-sibling ( up)
		//ancestor --- top to down 
		//parent --- direct parent
		//child --- direct or indirect child
		
		//a[text()='Recurring payments']/following-sibling::a --4
		
		//a[text()='Recurring payments']/preceding-sibling::a ---8
		
		//input[@id='input-email']/preceding-sibling::label  -- up
		//label[text()='E-Mail Address']/following-sibling::input ---down
		
		//-----
		//a[text()='Joe.Root']//ancestor::tr/td/input[@type='checkbox']
		
		//a[text()='Joe.Root']//parent::td/preceding-sibling::td/input[@type='checkbox']
	
		//a[text()='Joe.Root']//ancestor::tr//input[@type='checkbox']  --- better
		
		
		//*
		//*[@id]
		//*[@href]
		//*[@class='form-control']
		
		//xpath   only for text
		
				//label[text()='Yes']
				//label[contains(),'Yes']
				
				//table[nomalize-space()='Yes']
		
		
	}
}
