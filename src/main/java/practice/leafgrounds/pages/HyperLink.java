package practice.leafgrounds.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import practice.leafgrounds.Base.BaseProjectMethods;

public class HyperLink extends BaseProjectMethods{

public HyperLink(ChromeDriver driver) {
	this.driver = driver;
}

@FindBy(how=How.LINK_TEXT, using="Verify am I broken?")
private WebElement brokenLink;

	public HyperLink clickHyperLinkButton() throws InterruptedException {
		// Click on Hyper Link icon
		driver.findElementByXPath("//h5[text()='HyperLink']").click();

		// Click on the "Go to Home Page Link"
		driver.findElementByXPath("//a[text()='Go to Home Page']").click();

		Thread.sleep(5000);

		System.out.println("Now the Title of Page after Navigation Back : "+driver.getTitle());

		// Click on Hyper Link icon
		driver.findElementByXPath("//h5[text()='HyperLink']").click();
		return this;
	}

	public HyperLink withoutClickLink() {
		// Get the attribute of href
		String attribute = driver.findElementByXPath("//a[text()='Find where am supposed to go without clicking me?']").getAttribute("href");
		System.out.println("This link has to go to : "+attribute);
		return this;
	}
	
	public HyperLink brokenLink() {
		
		// Click on the Broken Link
		brokenLink.click();
		String actualTitle = driver.getTitle();
		if (actualTitle.contains("404")) {
			System.out.println("Opened a error Page");
		}else {
			System.out.println("Redirected to correct page");
		}
		return this;
	}
	
	

}
