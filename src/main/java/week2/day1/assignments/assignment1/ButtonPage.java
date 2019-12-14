package week2.day1.assignments.assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set Property 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Launch Chrome Browser
		ChromeDriver d = new ChromeDriver();
		
		//Load URL
		d.get("http://leafground.com/pages/checkbox.html");
		
		/*
		 * // Get Title System.out.println("Title: "+d.getTitle());
		 * 
		 * // Get Current URL System.out.println("Current URL: "+d.getCurrentUrl());
		 * 
		 * // Get Page Source System.out.println("Page Source: "+d.getPageSource());
		 * 
		 * // Get Attribute
		 * System.out.println("Attribute name of first button: "+d.findElementById(
		 * "home").getAttribute("onclick"));
		 * 
		 * // Get CssVALUE
		 * System.out.println("CssValue: "+d.findElementById("home").getCssValue(
		 * "font-family"));
		 * 
		 * // Get Text System.out.println("Text: "+d.findElementById("home").getText());
		 * 
		 * // Get Location
		 * System.out.println("Location: "+d.findElementById("home").getLocation());
		 * System.out.println("Location X: "+d.findElementById("home").getLocation().
		 * getX());
		 * System.out.println("Location Y: "+d.findElementById("home").getLocation().
		 * getY());
		 * 
		 * // Get Size System.out.println("size: "+d.findElementById("home").getSize());
		 * System.out.println("size height: "+d.findElementById("home").getSize().
		 * getHeight());
		 * System.out.println("size width: "+d.findElementById("home").getSize().
		 * getWidth());
		 * 
		 * // Get Tagname
		 * System.out.println("Tagname: "+d.findElementById("home").getTagName());
		 * 
		 * // Get isDisplayed()
		 * System.out.println("Button Displayed? "+d.findElementById("home").isDisplayed
		 * ());
		 * 
		 * // Get isEnabled()
		 * System.out.println("Button enabled? "+d.findElementById("home").isEnabled());
		 * 
		 * // Get isSelected()
		 * System.out.println("Button Selected? "+d.findElementById("home").isSelected()
		 * );
		 */
		
		// Get isSelected()
				System.out.println("Button Selected? "+d.findElementByXPath("(//label[text()='DeSelect only checked']/following::input)[1]").isSelected());
		
	}

}
