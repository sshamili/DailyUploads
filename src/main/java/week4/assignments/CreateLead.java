package week4.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class CreateLead extends ProjectSpecificMethods{
	@BeforeClass
	public void setData() {
		excelFileName ="CreateLead";
	}
	
	@Test(dataProvider = "getData")
	
	public  void Create(String cName, String fName, String lName) throws InterruptedException {


		Thread.sleep(5000);

		// Click Create Lead
		driver.findElementByXPath("//a[text()='Create Lead']").click();

		//		Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);

		//		Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);

		//		Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);

		//		Enter First Name(Local)
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Shamili");

		//		Enter Last Name(Local)
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("S");

		//		Enter Salutation
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Ms");

		//		Choose Source
		WebElement sourceElement = driver.findElementById("createLeadForm_dataSourceId");

		Select dropdown = new Select(sourceElement);
		dropdown.selectByIndex(1);
		dropdown.selectByValue("LEAD_PARTNER");
		dropdown.selectByVisibleText("Word of Mouth");

		//		Enter Title
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Testing");

		//		Enter Annual Revenue
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("50000000");

		//		Choose Industry
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select industryDropdown = new Select(industry);
		industryDropdown.selectByVisibleText("Non-profit");

		//		Choose Ownership
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select ownershipDropdown = new Select(ownership);
		ownershipDropdown.selectByIndex(3);

		//		Enter SIC Code
		driver.findElementById("createLeadForm_sicCode").sendKeys("SCI00233");

		//		Enter Description
		driver.findElementById("createLeadForm_description").sendKeys("Creating a new lead to manage Team members");

		//		Enter Important Note
		driver.findElementById("createLeadForm_importantNote").sendKeys("New lead access all portals");

		//		Enter Country Code
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");

		//		Enter Area Code
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");

		//		Enter Extension
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("123");

		//		EnterDepartment
		driver.findElementById("createLeadForm_departmentName").sendKeys("Quality Assurance");

		//		Choose Preferred Currency
		WebElement prefCurrency = driver.findElementById("createLeadForm_currencyUomId");
		Select prefCurrencyDropdown = new Select(prefCurrency);
		prefCurrencyDropdown.selectByValue("USD");

		//		Enter Number Of Employees
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("5200");

		//		Enter Ticker Symbol
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("$$$");

		//		Enter Person to Ask For
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Frequent queries");

		//		Enter Web Url
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://www.duckduckgo.com");

		//		Enter To Name
		driver.findElementById("createLeadForm_generalToName").sendKeys("Babu");

		//		Enter Address Line 1 and 2
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Adambakkam");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Kancheepuram");

		//		Enter City
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");

		//		Choose State/Province
		WebElement stateProvince = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select stateDropdown = new Select(stateProvince);
		stateDropdown.selectByVisibleText("Alabama");

		//		Choose Country
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select countryDropdown = new Select(country);
		countryDropdown.selectByValue("USA");

		//		Enter Zip/Postal Code
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600088");

		//		Enter Zip/Postal Code Extension
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("022");

		//		Choose Marketing Campaign
		//		Enter phone number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9876543210");

		//		Enter email address
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("test@testleaf.com");

		//		Click Create lead
		driver.findElementByClassName("smallSubmit").click();

		Thread.sleep(5000);

		//		Verify the first name
		String firstName = driver.findElementById("viewLead_firstName_sp").getText();

		if (firstName.equalsIgnoreCase("Shamili")) {
			System.out.println("Lead Created Successfully with " +firstName);
		}else {
			System.out.println("Again Create a lead");
		}


	}

}
