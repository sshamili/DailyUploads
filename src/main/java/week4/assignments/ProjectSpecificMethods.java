package week4.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {

	public ChromeDriver driver;
	@BeforeMethod
	public void login() throws InterruptedException {
		

		//Set system property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Launch chrome
		driver = new ChromeDriver();

		// Maximize window
		driver.manage().window().maximize();

		// Apply Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Launch URL
		driver.get("http://leaftaps.com/opentaps/");

		Thread.sleep(5000);

		// Enter the Username
		driver.findElementById("username").sendKeys("DemoSalesManager");

		// Enter the password
		driver.findElementById("password").sendKeys("crmsfaq");

		// Click Login button
		driver.findElementByClassName("decorativeSubmit").click();

		// Click crm/sfa link
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
	}
	
@AfterMethod
public void logout() {
	//		close browser
	driver.close();
	}
}
