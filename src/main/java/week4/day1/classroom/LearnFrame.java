package week4.day1.classroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		
		// Set Property 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Launch Chrome Browser
		ChromeDriver d = new ChromeDriver();
		
		// Add implict wait
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Load URL
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		// Find the Frame
		d.switchTo().frame("iframeResult");
		
		// Click the button inside the Frame
		d.findElementByXPath("//button[@onclick='myFunction()']").click();
		
		// Switch to alert
		Alert alert = d.switchTo().alert();
		
		// Send text to alert text box
		alert.sendKeys("Shamili");
		
		// Get the text in the alert box
		System.out.println(alert.getText());
		
		// Click on OK button in the alert box
		alert.accept();
		
		// Verify the name is displayed
		String text = d.findElementById("demo").getText();
		if(text.contains("Shamili")) {
			System.out.println("Name printed successfully");
		}
		else
		{
			System.out.println("Not Printed");
		}
	}

}
