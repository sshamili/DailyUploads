package projectDay;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acme {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://acme-test.uipath.com/account/login");
		d.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		d.findElementById("password").sendKeys("leaf@12");
		d.findElementById("buttonLogin").click();

		Actions act = new Actions(d);
		WebElement vendorButton = d.findElementByXPath("//button[text()[normalize-space()='Vendors']]");
		act.moveToElement(vendorButton);
		WebElement searchVendorButton = d.findElementByXPath("//a[text()='Search for Vendor']");
		act.click(searchVendorButton).perform();
		Thread.sleep(5000);
		d.findElementById("vendorName").sendKeys("Blue Lagoon");
		d.findElementByXPath("//button[text()='Search']").click();
		int value = 1;
		// To get the country name of the vendor 'Blue Lagoon'
		int sizeofColumns = d.findElementsByTagName("//th").size();
		List<WebElement> AllColumnName = d.findElementsByTagName("//th");
		for (WebElement eachColumnName : AllColumnName) {
			String UniqueColumnName = eachColumnName.getText();
			if(UniqueColumnName.equalsIgnoreCase("Vendor")) {
				for (int i = 0; i < sizeofColumns; i++) {
					String CountryColumn =d.findElementByXPath("//th["+i+"]").getText();
					if(CountryColumn.equals("Country")) {
						value = i;
					}
				}
			}
		}
		
		d.findElementByXPath("//table[@class='table']//th").getText();
		String vendorName = d.findElementByXPath("//table[@class='table']//td").getText();
		if (vendorName.equalsIgnoreCase("Blue Lagoon")) {
			String CountryName = d.findElementByXPath("//table[@class='table']//td["+value+"]").getText();
			System.out.println("Country Name is : "+CountryName);
			
			// Click Logout
			d.findElementByXPath("//a[text()='Log Out']").click();
			
		}else
		{
			System.out.println(" No Records Found");
		}
		
		
		
	}

}
