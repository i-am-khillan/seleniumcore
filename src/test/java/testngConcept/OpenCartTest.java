package testngConcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {

//	DB connection
//	Bt--create user
//	BC---launchBrowser
	
//	BC---login
//	header test
//	logout
	
//	BC---login
//	title test
//	logout
	
//	BC---login
//	header test
//	logout
	
//	closebrowser
//	delete user
	
	//before annotions
	//1.
	@BeforeSuite
	public void dbConnection() {
		System.out.println("DB connection");
	}
	//2.
	@BeforeTest
	public void createUser() {
		System.out.println("Bt--create user");
		
	}
	//3.
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC---launchBrowser");
	}
	//4. //7 //10
	@BeforeMethod
	public void login() {
		System.out.println("BC---login");
	}
	//8
	@Test
	public void titleTest() {
		System.out.println("title test");
	}
	//5.
	@Test
	public void headerTest() {
		System.out.println("header test");
	}
	//11
	@Test
	public void urlTest() {
		System.out.println("header test");
	}
	//After annotations
	//6. //9 //12
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("closebrowser");
	}
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("delete user");
	}
	//15
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("disconnectWithDB ");
	}
}
