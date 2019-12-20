package practice.leafgrounds.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLink {

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
				
				// Click on Hyper Link icon
				driver.findElementByXPath("//h5[text()='HyperLink']").click();
				
				// Click on the "Go to Home Page Link"
				driver.findElementByXPath("//a[text()='Go to Home Page']").click();
				
				Thread.sleep(5000);
				
				System.out.println("Now the Title of Page after Navigation Back : "+driver.getTitle());
				
				// Click on Hyper Link icon
				driver.findElementByXPath("//h5[text()='HyperLink']").click();
				
				// Get the attribute of href
				String attribute = driver.findElementByXPath("//a[text()='Find where am supposed to go without clicking me?']").getAttribute("href");
				System.out.println("This link has to go to : "+attribute);
				
				//
	
	}

}
