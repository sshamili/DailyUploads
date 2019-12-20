package practice.leafgrounds.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) {

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

		// Verify the page is TestLeaf
		String tiltle = driver.getTitle();
		
		// Logic to verify the title
		if (tiltle.equalsIgnoreCase("TestLeaf - Selenium Playground")) {
			System.out.println("You are in Test Leaf home page");

			// Click on Edit icon
			driver.findElementByXPath("//a[@href='pages/Edit.html']//img").click();

			// Enter the Email Address
			driver.findElementById("email").sendKeys("kumar@testleaf.com");

			// Append the Text and Press Key Tab
			driver.findElementByXPath("//input[@value='Append ']").sendKeys(" text", Keys.TAB);

			// Verify the text is Appended
			String newattribute = driver.findElementByXPath("(//div[@class='large-6 small-12 columns'])[2]//input").getAttribute("value");
			
			if(newattribute.contains("text")) {
				System.out.println("Given Text Appended");
			} else {
				System.out.println("Try to Append text");
			}

			// Get the Default Text Entered 
			String DefaultText = driver.findElementByName("username").getAttribute("value");
			System.out.println(DefaultText);

			// Clear the Text
			driver.findElementByXPath("(//input[@name='username'])[2]").clear();

			// Confirm the box is disabled
			boolean buttonEnabled = driver.findElementByXPath("(//div[@class='large-6 small-12 columns'])[5]//input").isEnabled();

			if(!buttonEnabled) {
				System.out.println("Text box is disabled :"+!buttonEnabled);
				
			// Close browser
			driver.close();
			}
		} else {

			System.out.println("Go to TestLeaf home page");
		}



	}

}
