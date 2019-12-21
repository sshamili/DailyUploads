package week4.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead extends ProjectSpecificMethods{
	
	@Test
	public  void edit() throws InterruptedException {

		
		Thread.sleep(5000);
		// Click on Leads
		driver.findElementByXPath("//a[text()='Leads']").click();

		//		Click Find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();

		//		Enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Shamili");

		//		Click Find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		Thread.sleep(10000);
		//		Click on first resulting lead
		String text = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		System.out.println("first result: "+text);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();

		//		Verify title of the page
		String viewPagetitle = driver.getTitle();
		if(viewPagetitle.equals("View Lead | opentaps CRM")) {
			System.out.println("You are in view page of the user");
		}else {
			System.out.println("You are not view page");
		}

		//		Click Edit
		driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();

		//		Change the company name
		driver.findElementById("updateLeadForm_companyName").sendKeys("site");

		//		Click Update
		driver.findElementByXPath("//input[@value='Update']").click();

		//		Confirm the changed name appears
		String newCompanyName = driver.findElementById("viewLead_companyName_sp").getText();
		if(newCompanyName.contains("site")) {
			System.out.println("Company name changed Successfully");
		}else {
			System.out.println("New company name not Reflected");
		}
		//		Close the browser (Do not log out)
		driver.close();
	}

}
