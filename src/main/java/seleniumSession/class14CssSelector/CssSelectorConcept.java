package seleniumSession.class14CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//driver.findElement(By.cssSelector("cssSelector"));
		
		//id 
		//#id
		//tagname#id
		
		//#username
		//input#username
		
		//class:
		// .class
		//tagname.class
		//input.TextInput__StyledInput-dZxQPg.eaGEy
		
		//class + id
		//.class#id
		//#id.class
		//input.login-email#username
		//input.TextInput__StyledInput-dZxQPg#username
		//#username.TextInput__StyledInput-dZxQPg
		///.c1.c2.c3.c4...cn
		/////tagname.c1.c2.c3.....cn
		///.TextInput__StyledInput-dZxQPg.eaGEy
		///.eaGEy.TextInput__StyledInput-dZxQPg
		///
		///
		//css with attributes:
		//tagname[attr='value'] --css
		//tagname[@attr='value'] --xpath
		
		//input[name='email']  -- not forward // or @ 
		//input[id='username']
		
		//tagname[attr='value'][attr='value'][][]
		//input[id='username'][type='email']
		
		//tagname#id[Attribute='value']
		//input#username[type='email']
		
		//contain or starts-with or --not applicable
		
		//contains
		//tagname[Attri*='Address']
		//input[placeholder*='Mail']	
		
		//starts-with
		//tagname[Attri^='Address']
		//input[placeholder^='E-Mail']
		
		//ends-with
		//tagname[attr$='Address'
		//input[placeholder$='Address']
		
		//text in css: Not available --- text
		
		//parent to child:
		//> direct child
		//form#hs-login >div   ---> direct child
		//.form-group > input
		
		//form#hs-login div  --- > direct + indirect child
		//.container div
		
		//select#Form_getForm_Country>option  -- a// direct
		//select#Form_getForm_Country> option -- //all indirect +direct
		
		//child to parent : not allowed -- backward traversing not allowed in css
		//child to ancestor : not allowed -- backward traversing not allowed in css
		//preceding-sibing: not allowed -- backward traversing not allowed in css
		
		
		//following-sibing:
		//label[for='input-email']+input#input-email----> immediate following --1
		
		//option[value='Algeria']~option  ---> all options  --more
		
		//comma in css
	//	input#username ,input#password,button#loginBtn,inpuy#remember
		
		//
//		int mand_field_count=driver.findElements(By.cssSelector("")).size();
//		if(mand_field_count==4) {
//			System.out.println("all imp mandatory fields are present on the page");
//		}
//		
		
		//not in css:
		//div.from-group>input.form-control:not(#input-password)  --> exclude one of them
		
		//index in css:
		//select#Form_getForm_Country > option:nth-of-type(5)
		//select#Form_getForm_Country > option:nth-of-type(n)  --all
		
		//select#Form_getForm_Country > option:first-child --- first child
		
		//select#Form_getForm_Country > option:last-child --- first child
		
		//select#Form_getForm_Country > option:nth-child(4)  -- 4th one
		
		//select#Form_getForm_Country > option:nth-last-child(3)  -- 3 last one
		
		//select#Form_getForm_Country > option:nth-child(even)  -- even one
		
		//select#Form_getForm_Country > option:nth-child(odd)  -- odd one
		
		//select#Form_getForm_Country > option:nth-of-type(n+4)  -- start from n+4
		
		//select#Form_getForm_Country > option:nth-of-type(n4)  -- start from n4
		

		//xpath: odd /even
		//(select[@id=''Form_getForm_Country']/option)[position() mod 2=0] --even
		//(select[@id=''Form_getForm_Country']/option)[position() mod 2=1]  --odd
		
		
		//cascaded class in css:
		//#username.TextInput__StyledInput-dZxQPg
				///.c1.c2.c3.c4...cn
				/////tagname.c1.c2.c3.....cn
				///.TextInput__StyledInput-dZxQPg.eaGEy
				///.eaGEy.TextInput__StyledInput-dZxQPg
				///
				///
		
								//xpath vs 						css:
		
		//1.  performance     good 	                          good                        
		//2. syntax :        complex                       	single
		// backward            yes							No
		//4. sibling 	       yes						    yes --only following
		//5. text              yes							no
		//6. ancestor /parent  yes                          no
		//7.ends-with:         no                          yes
		//8.index              yes                         yes+1
		//not:                 yes                         yes
		//comma:               no                          yes
		//SVG:                Yes                         not
		//shadownDOM          no                        yes
		//Psuedo:            no                         yes
		//last:             yes						   no
		//first             no                         yes
		
		//cypress --not support xpath
		
		
		//xpath 
		
		//label[text()='Yes']
		//label[contains(),'Yes']
		
		//table[nomalize-space()='Yes']
	}
	

}
