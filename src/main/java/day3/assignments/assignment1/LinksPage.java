package day3.assignments.assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LinksPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set Property 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
		//Launch Chrome Browser
		ChromeDriver d = new ChromeDriver();
		
		//Load URL
		d.get("http://leafground.com/pages/Link.html");
		
		// Get Title
		System.out.println("Title: "+d.getTitle());
		
		// Get Current URL
		System.out.println("Current URL: "+d.getCurrentUrl());
		
		// Get Page Source
		System.out.println("Page Source: "+d.getPageSource());
		
		// Get Attribute
		System.out.println("Attribute name of first Link: "+d.findElementByLinkText("Go to Home Page").getAttribute("href"));
		
		// Get CssVALUE
		System.out.println("CssValue: "+d.findElementByLinkText("Go to Home Page").getCssValue("font-family"));
		
		// Get Text
		System.out.println("Text: "+d.findElementByLinkText("Go to Home Page").getText());
		
		// Get Location
		System.out.println("Location: "+d.findElementByLinkText("Go to Home Page").getLocation());
		System.out.println("Location X: "+d.findElementByLinkText("Go to Home Page").getLocation().getX());
		System.out.println("Location Y: "+d.findElementByLinkText("Go to Home Page").getLocation().getY());
		
		// Get Size 
		System.out.println("size: "+d.findElementByLinkText("Go to Home Page").getSize());
		System.out.println("size height: "+d.findElementByLinkText("Go to Home Page").getSize().getHeight());
		System.out.println("size width: "+d.findElementByLinkText("Go to Home Page").getSize().getWidth());
		
		// Get Tagname
		System.out.println("Tagname: "+d.findElementByLinkText("Go to Home Page").getTagName());
		
		// Get isDisplayed()
		System.out.println("Link Displayed? "+d.findElementByLinkText("Go to Home Page").isDisplayed());
		
		// Get isEnabled()
		System.out.println("Link enabled? "+d.findElementByLinkText("Go to Home Page").isEnabled());
		
		// Get isSelected()
		System.out.println("Link Selected? "+d.findElementByLinkText("Go to Home Page").isSelected());
		

	}

}
