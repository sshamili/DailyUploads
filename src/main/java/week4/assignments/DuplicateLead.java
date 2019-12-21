package week4.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {

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

		//				Click Find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();

		//				Click on Email
		driver.findElementByXPath("//span[text()='Phone']").click();

		//		Enter Email
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9912345678");

		//				Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		//				Capture lead ID of First Resulting lead
		String text = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		System.out.println("first result: "+text);

		Thread.sleep(5000);
		//				Click First Resulting lead
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();

		//		Click Duplicate Lead
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();

		//		Verify the title as 'Duplicate Lead'
		String duplicatePageTitle = driver.getTitle();
		System.out.println(duplicatePageTitle);
		if (duplicatePageTitle.equals("Duplicate Lead | opentaps CRM")) {
			System.out.println("You are in duplicate Lead Page");
		}else {
			System.out.println("You are not in Duplicate Lead Page");
		}

		//		Click Create Lead
		driver.findElementByXPath("//input[@class='smallSubmit']").click();

		//		Confirm the duplicated lead name is same as captured name
		String firstname = driver.findElementById("createLeadForm_firstName").getText();
		String capturedfirstName = driver.findElementById("viewLead_firstName_sp").getText();
		if (firstname.equals(capturedfirstName)) {
			System.out.println("Confirm the duplicated lead name is same as captured name");
		}else {
			System.out.println("names are not same");
		}
		//		Close the browser (Do not log out)
		driver.close();

	}

}
