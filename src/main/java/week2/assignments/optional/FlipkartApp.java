package week2.assignments.optional;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set the property for ChromeDriver
				System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");

				// Initiate the ChromeBroswer
				ChromeDriver driver = new ChromeDriver();

				// Maximize the browser
				driver.manage().window().maximize();
				
				// Load the URL
				driver.get("https://www.flipkart.com/");
				driver.findElementByXPath("//button[text()='✕']").click();
				// Hover the mouse cursor on Electronics
				Actions b = new Actions(driver);
				WebElement ele = driver.findElementByXPath("//span[text()='Electronics']");
				b.moveToElement(ele);
				// Click on Mi
				WebElement Mi = driver.findElementByXPath("//a[text()='Mi']");
				b.click(Mi).perform();
				
				// Verify the title contains as MI Mobile
				String webpageTitle = driver.findElementByXPath("//h1[text()='Mi Mobiles']").getText();
				if(webpageTitle.equals("Mi Mobiles")){
					System.out.println("You are in MI Mobiles page");
				}
				// Print all the phone numbers 
				String model = driver.findElementByXPath("//div[@class='_3wU53n'])[1]").getText();
				System.out.println(model);
				// Close the Number

	}

}
