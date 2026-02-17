package testngConcept;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PriorityTheTest {

	@Test(priority=1)
	public void aTest() {
		System.out.println("atest---");
	}

	@Test(priority=3)
	public void bTest() {
		System.out.println("bTest----");
	}

	@Test(priority=2)
	public void cTest() {
		System.out.println("cTest----");
	}

	//Default priority is zero 
	//non priority ==?> priority
	@Test(priority=-1)
	public void dTest() {
		System.out.println("dTest----");
	}

	@Test(invocationCount=2)
	public void eTest() {
		System.out.println("eTest----");
	}

}
