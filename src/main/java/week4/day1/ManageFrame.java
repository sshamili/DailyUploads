package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageFrame {
	
	public static void main(String[] args) {
		
		/*
		 * The first few lines are as usual
		 * Launch browser, load the URL and timeouts and maximise window 
		 */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.switchTo().frame(6);
		
		
		driver.findElementById("Click").click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElementById("Click1").click();
		
		//driver.switchTo().parentFrame();
		
		
		/*
		 * Notes about Frame : 
		 * 
		 * 1) frame is a method inside RemoteTargetLocator
		 * 2) RemoteTargetLocator is inner class inside RemoteWebDriver class
		 * 3) Frame is a section inside the html (organized)
		 * 4) You cannot find element inside the frame directly
		 * 5) So, you need to go inside frame to see elements of frame
		 * 6) If you want look up for elements outside the frame, you need to switch out
		 * 7) You can have any number of frames inside an application!
		 * 8) You can also have inner (child) frame(s) inside a frame.
		 * 
		 * Methods designed for switching to frame:
		 * 1) frame(index) 		- Integer index starts at 0
		 * 2) frame(nameorid)	- String (either name or id attribute)
		 * 3) frame(WebElement)	- WebElement (element found by findElement method)
		 * 
		 * Exceptions while switch frame
		 * 1) NoSuchFrameException 		- When no frame (index/name/id) found
		 * 2) NoSuchElementException 	- When using WebElement to switch
		 * 
		 */
		
		
		
	}

}
