package webDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeafGround {

	public static void main(String[] args) {

		// Set the Driver Property

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Maximize Window
		driver.manage().window().maximize();

		// Open the given URL
		driver.get("http://leafground.com/");

		// Apply Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Click on Wait for Text Change
		driver.findElementByXPath("//h5[text()='Wait for Text Change']").click();
		
		WebElement clickMebutton = driver.findElementById("btn");
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.textToBePresentInElement(clickMebutton, "Click ME!"));
		
		clickMebutton.click();
		
		Alert alert =driver.switchTo().alert();
		alert.accept();
		
		
	}

}
