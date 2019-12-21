package week4.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

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
		
		
		
//		Click Merge leads
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		
//		Click on Icon near From Lead
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		
//		Move to new window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lstwindows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstwindows.get(1));
		
//		Enter Lead ID
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[13]").sendKeys("10033");

//		Click Find Leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
//		Click First Resulting lead
		String text = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		System.out.println("first result: "+text);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		
//		Switch back to primary window
		driver.switchTo().window(lstwindows.get(0));
		
//		Click on Icon near To Lead
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
//		Move to new window
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> lstwindows1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(lstwindows1.get(1));
		
//		Enter Lead ID
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[13]").sendKeys("10033");
//		Click Find Leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
//		Click First Resulting lead
		String text1 = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		System.out.println("first result: "+text1);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		
//		Switch back to primary window
		driver.switchTo().window(lstwindows.get(0));
		
//		Click Merge
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		
//		Accept Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
//		Click Find Leads link
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
//		Enter From Lead ID
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[13]").sendKeys("10033");
		
//		Click Find Leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
//		Verify message "No records to display" in the Lead List. This message confirms that the successful merge of leads
		String message = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if (message.equals("No records to display")) {
			System.out.println("Record merged successfully");
		}else {
			System.out.println("Merge the record");
		}
//		Close the browser (Do not log out)
		driver.close();


	}

}
