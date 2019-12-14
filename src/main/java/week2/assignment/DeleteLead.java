package week2.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Enter the UserName
		WebElement userName = driver.findElementById("username");
		userName.sendKeys("DemoSalesManager");

		// Enter the Password
		WebElement password = driver.findElementById("password");
		password.sendKeys("crmsfa");

		// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();

		// Click on crm/sfa button
		driver.findElementByLinkText("CRM/SFA").click();

		// Click on Leads
		driver.findElementByLinkText("Leads").click();

		// Click on Find Leads
		driver.findElementByLinkText("Find Leads").click();
		
		// Click on phone
		driver.findElementByXPath("//span[text()='Phone']").click();
		
		// Enter Country Code
		driver.findElementByXPath("//input[@name='phoneCountryCode']").clear();
		
		// Enter Country Code
		driver.findElementByXPath("//input[@name='phoneCountryCode']").sendKeys("91");
		
		// Enter Area Code
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("044");
		
		// Enter Phone Number
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9632587410");
		
		// Click on Find Leads
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		// Get the First Result
		System.out.println("Lead ID of first Resultant: ");
		Thread.sleep(3000);
		String str = driver.findElementByXPath(("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).getText();
		
		// Click on the First result
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
		
		// Click on Delete
		driver.findElementByXPath("//a[text()='Delete']").click();
		
		// Click on Find Leads
		driver.findElementByLinkText("Find Leads").click();
		
		
		//Enter the Captured Lead ID
		Thread.sleep(2000);
		driver.findElementByXPath("(//span[text()='Advanced']/following::input)[1]").sendKeys(str);
		
		// Click on Find Leads
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		
		// Verify "No records to displayed"
		String ActualText="No records to display";
		String text2 = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if (text2.equals(ActualText)) {
			System.out.println("Lead Deleted Susscessfully");
		}
		
		//Close the Browser
		driver.close();
	}

}
