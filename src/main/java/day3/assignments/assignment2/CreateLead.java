package day3.assignments.assignment2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {

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

		// Click on Create Lead button
		driver.findElementByLinkText("Create Lead").click();

		// Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("Bussiness gateways");

		// Enter First Name
		WebElement firstName = driver.findElementById("createLeadForm_firstName");
		firstName.sendKeys("Shamili");

		// Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("S");
		
		// Enter First Name ( Local)
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("sha");
		
		// Enter Last Name (Local)
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("s");
		
		// Enter Salutation
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Madam");
		
		// Enter Birth Date
		driver.findElementById("createLeadForm_birthDate").sendKeys("3/29/19");
		
		// Enter Title
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Project Manager");
		
		// Enter Department
		driver.findElementById("createLeadForm_departmentName").sendKeys("Developing");
		
		// Enter Annual Revenue
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("20,000,000");
		
		
		// Enter Number of Employees
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("10000");
		
		// Enter SIC Code
		driver.findElementById("createLeadForm_sicCode").sendKeys("85241");
		
		// Enter Description
		driver.findElementById("createLeadForm_description").sendKeys("HI");
		
		// Enter Ticker Symbol
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("SuDeep");
		
		// Enter Important Note
		driver.findElementById("createLeadForm_importantNote").sendKeys("Project started");
		
		// Enter Country Code
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+91");
		
		// Enter Area code
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
		
		// Enter Extension
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("000");
		
		// Enter Phone Number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("8956385214");
		
		// Enter Person to ask for
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("gopi");
		
		// Enter e-Mail Address
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("hasurakhan12@gmail.in");
		
		// Enter Web URL
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("https://hsura.co.in");
		
		// Enter To Name
		driver.findElementById("createLeadForm_generalToName").sendKeys("Shamili");
		
		// Enter Attention Name
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("SuDeep");
		
		// Enter Address line1
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Mandalen");
		
		// Enter Address Line 2
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Mandaken");
		
		// Enter City 
		driver.findElementById("createLeadForm_generalCity").sendKeys("Newark");
		
		// Enter Zip/postal Code
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("19008");
		
		// Enter Code Extension
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("128");

		// Select the Drop down "Source"
		WebElement sourcefield = driver.findElementById("createLeadForm_dataSourceId");
		Select s = new Select(sourcefield);
		s.selectByVisibleText("Conference");

		// Select the Drop down "marketing Campaign"
		WebElement marketing = driver.findElementById("createLeadForm_marketingCampaignId");
		Select m = new Select(marketing);
		m.selectByValue("CATRQ_AUTOMOBILE");

		// Select the Drop down "industry"
		WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
		Select i = new Select(Industry);
		i.selectByIndex(0); // HTML Index Starts from 0 //aerospace

		// Select the Drop down "Currency"
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		Select c = new Select(currency);
		List<WebElement> options = c.getOptions();
		int sizeofoptions = options.size();
		c.selectByIndex(sizeofoptions - 1);

		// Select the Drop down "Ownership"
		WebElement Ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select o = new Select(Ownership);
		o.selectByIndex(3);

		// Select the Drop down "State/province"
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select st = new Select(state);
		st.selectByVisibleText("Alaska");// Alaska

		// Select the Drop down "Country"
		WebElement Country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select co = new Select(Country);
		co.selectByVisibleText("United States"); 

		// Click on Create Lead (Submit) button
		driver.findElementByClassName("smallSubmit").click();
		  
		  //Verify the Lead is created by checking the Company or First Name String
		    String text = driver.findElementById("viewLead_firstName_sp").getText(); 
		  if(text.contains("Shamili")) {
		  System.out.println("Lead is created successfully");
		  }
		  
		// Close the Browser
		driver.close();

	}

}
