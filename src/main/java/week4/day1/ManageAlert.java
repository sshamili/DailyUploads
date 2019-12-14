package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageAlert {
	
	public static void main(String[] args) {
		
		/*
		 * The first few lines are as usual
		 * Launch browser, load the URL and timeouts and maximise window 
		 */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		/*Options manage = driver.manage();
		Timeouts timeouts = manage.timeouts();
		timeouts.implicitlyWait(time, unit);*/
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// Click the Alert Box (Normal Alert -> OK)
		driver.findElementByXPath("//button[.='Prompt Box']").click();
		
		
		
		/*
		 * Notes about Alert : 
		 * 
		 * 1) Alert is an Interface, implemented by RemoteAlert
		 *    and RemoteAlert is called by RemoteTargetLocator class
		 * 2) RemoteTargetLocator is inner class inside RemoteWebDriver class
		 * 3) Alert is modal dialog and cannot be inspected (Javascript)
		 * 4) Alert does not appear more than once at a time !!
		 * 5) It is modal, hence you need to handle it.
		 * 6) You cannot take snapshot of the alert (you will know why later?)
		 * 7) If it is inspectable, it is not an alert
		 * 
		 * Methods designed in Alert interface:
		 * 1) accept 	- Positive response
		 * 2) dismiss 	- Negative response
		 * 3) sendKeys 	- Enter text (but you will not see this action)
		 * 4) getText	- Get the text on the alert (do this before accept/dismiss)
		 * 
		 * 
		 * Exceptions in Alert:
		 * 1) NoAlertPresentException - You are expecting an alert, 
		 * 								so trying to switch 
		 * 								but there is no alert present
		 * 2) UnhandledAlertException - You did not expect an alert,
		 * 								so did not switch
		 * 								but alert appeared unexpectedly
		 */
		
		// Now, you are expected to have an alert
		// So -> 
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("abc");
		String text = alert.getText();
		System.out.println(text);
		alert.accept();	
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		// Now, you to perform action on the alert
		
		
		
		
		
		
		
		
		
		
		// Did you notice alert is closed?
		
		
	}

}
