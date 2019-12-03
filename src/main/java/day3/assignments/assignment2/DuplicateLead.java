package day3.assignments.assignment2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
				
				// Click on Email
				driver.findElementByLinkText("Email").click();
				
				// Enter Email Address
				driver.findElementByClassName("emailAddress").sendKeys("sthesiva88@gmail.com");
				
				// Click on Find Leads
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				Thread.sleep(2000);
				
				// Get the First Result
				
				// Click on the First result
				
				Thread.sleep(3000);
				
				// Click on the Duplicate Lead
				driver.findElementByLinkText("Duplicate Lead").click();
				
				
				// Get Title
				String etitle = "Duplicate Lead";
				String title = driver.getTitle();
				if(etitle.contains(title)) {
					System.out.println("Current page is in Duplicate Lead");
				}
				
				// Click on Create Lead (Submit) button
				driver.findElementByClassName("smallSubmit").click();
				
				// Verify Duplicate Lead name as captured
				String name = "Sam";
				String RevisedName = driver.findElementById("viewLead_firstName_sp").getText();
				if (name.equals(RevisedName)) {
					System.out.println("Duplicate Lead is created Successfully");
				}

	}

}
