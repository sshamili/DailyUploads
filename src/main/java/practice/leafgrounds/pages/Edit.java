package practice.leafgrounds.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import practice.leafgrounds.Base.BaseProjectMethods;

public class Edit extends BaseProjectMethods{

	public Edit(ChromeDriver driver) {
		this.driver = driver;
	}

	public Edit clickEdit(){

		// Click on Edit icon
		driver.findElementByXPath("//a[@href='pages/Edit.html']//img").click();
		return this;
	}

	public Edit enterEmailAddress(){
		// Enter the Email Address
		driver.findElementById("email").sendKeys("kumar@testleaf.com");
		return this;
	}

	public Edit appendText() {
		// Append the Text and Press Key Tab
		driver.findElementByXPath("//input[@value='Append ']").sendKeys(" text", Keys.TAB);
		// Verify the text is Appended
		String newattribute = driver.findElementByXPath("(//div[@class='large-6 small-12 columns'])[2]//input").getAttribute("value");

		if(newattribute.contains("text")) {
			System.out.println("Given Text Appended");
		} else {
			System.out.println("Try to Append text");
		}
		return this;
	}

	public Edit defaultText() {
		// Get the Default Text Entered 
		String DefaultText = driver.findElementByName("username").getAttribute("value");
		System.out.println(DefaultText);
		return this;
	}
	public Edit clearText() {
		// Clear the Text
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
		return this;
	}

	public Edit confirmDisabled() {
		// Confirm the box is disabled
		boolean buttonEnabled = driver.findElementByXPath("(//div[@class='large-6 small-12 columns'])[5]//input").isEnabled();
		if(!buttonEnabled) {
			System.out.println("Text box is disabled :"+!buttonEnabled);

		} else {

			System.out.println("Go to TestLeaf home page");
		}
		return this;
	}

}
