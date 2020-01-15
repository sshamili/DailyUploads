package practice.leafgrounds.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundHomePage {
	
	public static ChromeDriver driver;
	public static int i=5;
	public ChromeDriver setup() {
		// Set the Driver Property
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		// Launch Chrome Browser
		driver = new ChromeDriver();

		// Maximize Window
		driver.manage().window().maximize();
		
		// Apply Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open the given URL
		driver.get("http://leafground.com/");
		System.out.println(i);
		return driver;
		
	}
	
	public Button button() {
	
	// Click on Button Text
	driver.findElementByXPath("//h5[text()='Button']").click();
	System.out.println(i);
	return new Button();
	
	}

}
