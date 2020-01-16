package practice.leafgrounds.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import practice.leafgrounds.Base.BaseProjectMethods;

public class LeafgroundHomePage extends BaseProjectMethods{

	public LeafgroundHomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public LeafgroundHomePage test() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "TestLeaf - Selenium Playground";
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("LeafGround home page opened successfully");
		}
		return this;
	}

	public Button button() {

		// Click on Button Text
		driver.findElementByXPath("//h5[text()='Button']").click();
		System.out.println("Navigated to buttons page successfully");
		return new Button(driver);

	}

	public Edit edit() {

		// Click on Edit icon
		driver.findElementByXPath("//a[@href='pages/Edit.html']//img").click();
		System.out.println("Navigated to edit page successfully");
		return new Edit(driver);

	}
	
	public HyperLink hyperLink() {

		// Click on Edit icon
		driver.findElementByXPath("//a[@href='pages/Edit.html']//img").click();
		System.out.println("Navigated to edit page successfully");
		return new HyperLink(driver);

	}

}
