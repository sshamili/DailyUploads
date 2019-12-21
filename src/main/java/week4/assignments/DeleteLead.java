package week4.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead {
	@Test
	public  void Delete() throws InterruptedException {

		// Set property for browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Maximize window
		driver.manage().window().maximize();

		// Apply Implicit Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Launch URL
		driver.get("http://leaftaps.com/opentaps/");

		Thread.sleep(5000);

		// Enter the Username
		driver.findElementById("username").sendKeys("DemoSalesManager");

		// Enter the password
		driver.findElementById("password").sendKeys("crmsfa");

		// Click Login button
		driver.findElementByClassName("decorativeSubmit").click();

		// Click crm/sfa link
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();

		Thread.sleep(5000);
		// Click on Leads
		driver.findElementByXPath("//a[text()='Leads']").click();

		//		Click Find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();

		//		Click on Phone
		driver.findElementByXPath("//span[text()='Phone']").click();

		//		Enter phone number
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9912345678");

		//		Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		//		Capture lead ID of First Resulting lead
		String text = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		System.out.println("first result: "+text);

		Thread.sleep(5000);
		//		Click First Resulting lead
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();

		//		Click Delete
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();

		//		Click Find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();

		//		Enter captured lead ID
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[13]").sendKeys(text);

		//		Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		//		Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String message = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if (message.equals("No records to display")) {
			System.out.println("Record deleted successfully");
		}else {
			System.out.println("Delete the record");
		}

		//		Close the browser (Do not log out)
		driver.close();

	}

}
