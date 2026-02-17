package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TottalLinksConcepts {

	// 1. total links
// 2.print the text of the each link
	// 3. avoid blank text
	// 4.broken link ---- >later

	//

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.freshworks.com");

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		// find out all the elements ----FEs
//
//		List<WebElement> listElement = driver.findElements(By.tagName("a"));
//		// order base collections
//
//		System.out.println("total links : " + listElement.size());
//
//		for (int i = 0; i < listElement.size(); i++) {
//
//			String text = listElement.get(i).getText();
//
//			if (text.length() != 0) {
//
//				Thread.sleep(1000);
//				System.out.println(text);
//
//			}
//		}
			/*
			 * Exception in thread "main"
			 * org.openqa.selenium.StaleElementReferenceException: stale element reference:
			 * stale element not found in the current frame (Session info:
			 * chrome=142.0.7444.176) For documentation on this error, please visit:
			 * https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#
			 * staleelementreferenceexception Build info: version: '4.38.0', revision:
			 * '6b412e825c*' System info: os.name: 'Windows 11', os.arch: 'amd64',
			 * os.version: '10.0', java.version: '21.0.9' Driver info:
			 * org.openqa.selenium.chrome.ChromeDriver Command:
			 * [53df7a107bb3116c85bdd4547caff055, getElementText
			 * {id=f.6F3DA20729D8DE280240F6284914B350.d.792F214A61EB16F9E8CD14DA4543EE92.e.
			 * 72}] Capabilities {acceptInsecureCerts: false, browserName: chrome,
			 * browserVersion: 142.0.7444.176, chrome: {chromedriverVersion: 142.0.7444.175
			 * (302067f14a4..., userDataDir: C:\Users\kverma\AppData\Loc...},
			 * fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:64911},
			 * goog:processID: 15708, networkConnectionEnabled: false, pageLoadStrategy:
			 * normal, platformName: windows, proxy: Proxy(), se:cdp:
			 * ws://localhost:64911/devtoo..., se:cdpVersion: 142.0.7444.176, setWindowRect:
			 * true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad:
			 * 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify,
			 * webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true,
			 * webauthn:extension:minPinLength: true, webauthn:extension:prf: true,
			 * webauthn:virtualAuthenticators: true} Element: [[ChromeDriver: chrome on
			 * windows (53df7a107bb3116c85bdd4547caff055)] -> tag name: a] Session ID:
			 * 53df7a107bb3116c85bdd4547caff055 at
			 * java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(
			 * DirectConstructorHandleAccessor.java:62) at
			 * java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.
			 * java:502) at
			 * java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486) at
			 * org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167) at
			 * org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(
			 * W3CHttpResponseCodec.java:138) at
			 * org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(
			 * W3CHttpResponseCodec.java:50) at
			 * org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.
			 * java:215) at
			 * org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(
			 * DriverCommandExecutor.java:216) at
			 * org.openqa.selenium.remote.service.DriverCommandExecutor.execute(
			 * DriverCommandExecutor.java:174) at
			 * org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:557)
			 * at org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:
			 * 223) at
			 * org.openqa.selenium.remote.RemoteWebElement.getText(RemoteWebElement.java:
			 * 191) at seleniumSession.TottalLinksConcepts.main(TottalLinksConcepts.java:39)
			 * 
			 */

	

		//tottal text fields on the page :
		System.out.println("----------------------");
		List<WebElement> listOfTextField=driver.findElements(By.className("form-control"));
		
		System.out.println(listOfTextField.size());
		
		for(WebElement e: listOfTextField) {
			String text =e.getText();
			System.out.println(text);
		}
	}

}
