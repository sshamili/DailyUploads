package week2.day1.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadWithSelect {

	public static void main(String[] args) {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		// Initiate the ChromeBroswer
		ChromeDriver d = new ChromeDriver();
		
		// Maximize the browser
		d.manage().window().maximize();
		
		// Load URL
		d.get("http://leaftaps.com/opentaps/control/main");
		
		// Enter the UserName
		d.findElementById("username").sendKeys("DemoSalesManager");
		
		// Enter the Password
		d.findElementById("password").sendKeys("crmsfa");

		// Click on Login Button
		d.findElementByClassName("decorativeSubmit").click();
		
		// Click on crm/sfa button
		d.findElementByLinkText("CRM/SFA").click();
		
		// Click on Leads
		d.findElementByLinkText("Leads").click();
		
		// Click on Create Lead button
		d.findElementByLinkText("Create Lead").click();
		
		// Enter Company Name
		d.findElementById("createLeadForm_companyName").sendKeys("CTS");
		
		// Enter First Name
		d.findElementById("createLeadForm_firstName").sendKeys("Shami");
		
		// Enter Last Name
		d.findElementById("createLeadForm_lastName").sendKeys("S");
		
		// Select 'Source' as 'Other' (Handling DropDown)
		WebElement source = d.findElementById("createLeadForm_dataSourceId");
		Select s = new Select(source);
		s.selectByVisibleText("Other");
		
		// Select 'Preferred Currency' as 'INR'
		WebElement currency = d.findElementById("createLeadForm_currencyUomId");
		Select c = new Select(currency);
		c.selectByVisibleText("INR - Indian Rupee");
		
		// Click on Create Lead (Submit) button
		d.findElementByClassName("smallSubmit").click();
		
		// Verify the Lead is created by checking the Company or First Name
		//String CompanyName = "CTS";
		String str = d.findElementById("viewLead_companyName_sp").getText();
		if (str.contains("CTS")) {
			System.out.println("Lead created successfully");
		}

	}

}
