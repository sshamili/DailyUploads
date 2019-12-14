package week4.day1;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindow {

	public static void main(String[] args) throws IOException {

		/*
		 * The first few lines are as usual
		 * Launch browser, load the URL and timeouts and maximise window 
		 */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/snap1.png");
		FileUtils.copyFile(source, target);

		/*
		 * Notes about Window : 
		 * 
		 * 1) window is a method inside RemoteTargetLocator
		 * 2) RemoteTargetLocator is inner class inside RemoteWebDriver class
		 * 3) window can be tab / new window itself
		 * 4) You cannot switch to a new window directly
		 * 5) At a time, the control will be there only in a window
		 * 6) If you want to switch another tab/window, you need to code to switch
		 * 
		 * Methods designed for switching to window:
		 * 1) window(windowhandle) 		- String (WindowHandle)
		 * 
		 * Exceptions when switch window
		 * 1) NoSuchWindowException 	- When the window handle does not exist
		 * 
		 */
		WebElement home = driver.findElementById("home");
		// click on the Open Home Page
		
			
		File source3 = home.getScreenshotAs(OutputType.FILE);
		File target3 = new File("./snaps/snap3.png");
		FileUtils.copyFile(source3, target3);

		driver.findElementById("home").click();








		// Find out how many windows you got?
		// Tip: getWindowHandles() -> get all opened windows

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lstWindowHandles  = new ArrayList<String>(windowHandles);	
		String secondWindow = lstWindowHandles.get(1);
		driver.switchTo().window(secondWindow);
		String title = driver.getTitle();
		System.out.println(title);
		
		File source1 = driver.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./snaps/snap2.png");
		FileUtils.copyFile(source1, target1);
		
		driver.quit();
		/*driver.close();
		driver.switchTo().window(lstWindowHandles.get(0));
		System.out.println(driver.getTitle());*/

























	}

}
