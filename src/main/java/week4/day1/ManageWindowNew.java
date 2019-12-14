package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindowNew {
	
	public static void main(String[] args) {
		
		/*
		 * The first few lines are as usual
		 * Launch browser, load the URL and timeouts and maximise window 
		 */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		// How to open a new window myself
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		
		
		
	}

}
