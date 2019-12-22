package projectDay;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
		
		
		//d.findElementById("buttonShowAll").click();
		Thread.sleep(5000);
		String text = d.findElementsByXPath("//table[@class='table']//td").get(0).getText();
		if (text.equals("Blue Lagoon")) {
			System.out.println(d.findElementsByXPath("//table[@class='table']//td").get(4).getText());
		}

		// close browser
		d.close();
		
	}

}
