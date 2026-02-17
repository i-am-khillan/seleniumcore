package seleniumSession.class22_24;

public class WaitConcepts {

	//script--- sync--- app(slow ,,server slowness,network)
	
	//sync : wait
	//1. static wait : Thread.sleep(10000) : 10sec : 2sec
	//2. dynamic wait : 10 secs: 2 sec : 8 sec will be cancelled
	
	//2.a : implicitlyWait : Gloabl wait for all the webelements
	//2.b : explicitly Wait: only for specific elements
	 		 // 1: WebDriverWait   (c)
			//2. FluentWait    (c)
	
	//Wait(i) : until();-----> FluentWait(c) : until(){} + other methods  -->WebDriverWait (c)
	
	
}
