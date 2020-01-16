package practice.leafgrounds.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import practice.leafgrounds.Base.BaseProjectMethods;
//import practice.leafgrounds.pages.LeafgroundHomePage;
public class Button extends BaseProjectMethods{

	//public ChromeDriver driver;

	public Button(ChromeDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.ID,using = "home")
	private WebElement gotohome;

	public Button clickHomeButton() throws InterruptedException {
		PageFactory.initElements(driver,this);
		// Click on "Go to home Page" button
		//WebElement gotohome = driver.findElementById("home");
		WebDriverWait Wait = new WebDriverWait(driver,5);
		Wait.until(ExpectedConditions.elementToBeClickable(gotohome)).click();
		

		//Thread.sleep(5000);
		// Verify browser navigated to home page
		// Verify the page is TestLeaf
		String title = driver.getTitle();
		// Logic to verify the title
		if (title.equalsIgnoreCase("TestLeaf - Selenium Playground")) {
			System.out.println("You are in Test Leaf home page");

			// Click on Button Text
			driver.findElementByXPath("//h5[text()='Button']").click();

		} else {
			System.out.println("Click on 'Go to Home' button again");
		}

		return this;

	}


	public Button getPostion() {

		// Click on "Get Position" button
		WebElement ele = findElement("id","position");
		Point location = ele.getLocation();
		System.out.println("Location of Get position button is : "+location);
		return this;
	}
	public Button getPostionX() {

		// Get X position
		int x = driver.findElementById("position").getLocation().getX();
		System.out.println("X Location of Get position button is : "+x);
		return this;
	}

	public Button getPostionY() {

		// Get Y position
		int y = driver.findElementById("position").getLocation().getY();
		System.out.println("Y Location of Get position button is : "+y);
		return this;
	}

	public Button getButtonColor() {

		// Get Button Color
		String cssValue = driver.findElementById("color").getCssValue("background-color");
		System.out.println("Color of Get Button Color is : "+cssValue);

		return this;
	}
	public Button getWidthheigth() {

		// 	Get height and width
		Dimension size = driver.findElementById("size").getSize();
		System.out.println("Dimension of button is : "+size);
		return this;
	}
	public Button getHeight() {

		// Get Height alone
		int height = driver.findElementById("size").getSize().getHeight();
		System.out.println("Height of button is : "+height);

		return this;
	}		
	public Button getWidth() {

		//Get Width alone
		int width = driver.findElementById("size").getSize().getWidth();
		System.out.println("Width of button is : "+width);
		return this;
	}	

}
