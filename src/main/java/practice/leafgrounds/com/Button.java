package practice.leafgrounds.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		// Set the Driver Property

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Maximize Window
		driver.manage().window().maximize();

		// Open the given URL
		driver.get("http://leafground.com/");

		// Apply Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Click on Button Text
		driver.findElementByXPath("//h5[text()='Button']").click();
		
		// Click on "Go to home Page" button
		driver.findElementById("home").click();
		
		Thread.sleep(5000);
		// Verify browser navigated to home page
			// Verify the page is TestLeaf
					String title = driver.getTitle();
			// Logic to verify the title
					if (title.equalsIgnoreCase("TestLeaf - Selenium Playground")) {
						System.out.println("You are in Test Leaf home page");
						
						// Click on Button Text
						driver.findElementByXPath("//h5[text()='Button']").click();

	} else {
		System.out.println("Click on 'Go to Home' button again");
	}
					
		// Click on "Get Postion" button
		Point location = driver.findElementById("position").getLocation();
		System.out.println("Location of Get position button is : "+location);
		
		// Get X position
		int x = driver.findElementById("position").getLocation().getX();
		System.out.println("X Location of Get position button is : "+x);
		
		// Get Y position
		int y = driver.findElementById("position").getLocation().getY();
		System.out.println("Y Location of Get position button is : "+y);
		
		// Get Button Color
		String cssValue = driver.findElementById("color").getCssValue("background-color");
		System.out.println("Color of Get Button Color is : "+cssValue);
		
		// 	Get height and width
		Dimension size = driver.findElementById("size").getSize();
		System.out.println("Dimension of button is : "+size);
		
		// Get Height alone
		int height = driver.findElementById("size").getSize().getHeight();
		System.out.println("Height of button is : "+height);
		
		// Get Width alone
		int width = driver.findElementById("size").getSize().getWidth();
		System.out.println("Width of button is : "+width);
		
		// Close Browser
		driver.close();
		
		
	}

}
