package week2.day1.assignments.assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifications {
	
	public static void main(String[] args) {
		
		// Set Property for Chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load Url
		driver.get("https://testleaf.herokuapp.com/pages/Button.html");
		
		// Wait for 30 Seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Maximize the Window
		driver.manage().window().maximize();
		
		// Get Title 
		String title = driver.getTitle();
		System.out.println("The title is : "+title);
		
		// Verify the title 
		if(title.equals("TestLeaf - Selenium Playground")) {
			System.out.println("You are on TestLeaf page");
		}else
		{
			System.out.println("You are not on TestLeaf page");
		}
		
		// Get CurrentURL 
		System.out.println("The Current URL is: "+driver.getCurrentUrl());
		
		// Get Source code 
		System.out.println("The  Source Code is: "+driver.getPageSource());
		
		/*
		 * // Get Attribute String attribute = driver.
		 * findElementByLinkText("Find where am supposed to go without clicking me?").
		 * getAttribute("href"); System.out.println("The Attritube is: "+attribute);
		 */
		
		// Get Css Value
		String cssValue = driver.findElementById("color").getCssValue("font-family");
		System.out.println("The CssValue is: "+cssValue);
		
		//how to find the font family in the DOM?
		
		// Get Text
		String text = driver.findElementById("color").getText();
		System.out.println("The Text is: "+text);
		
		// Get Location
		Point location = driver.findElementById("color").getLocation();
		System.out.println("The location coordinates is: "+location);
		
		// Get Location of x Coordinate only
		int locationX = driver.findElementById("color").getLocation().getX();
		System.out.println("The location coordinates X is: "+locationX);
				
		// Get Location of y coordinate only
		int locationY = driver.findElementById("color").getLocation().getY();
		System.out.println("The location coordinates Y is: "+locationY);
		
		// Get Size
		Dimension size = driver.findElementById("color").getSize();
		System.out.println("The size is: "+size);
		
		// Get Size Width
		int sizeWidth = driver.findElementById("color").getSize().getWidth();
		System.out.println("The size width is: "+sizeWidth);
		
		// Get Size Heigth
		int sizeheight = driver.findElementById("color").getSize().getHeight();
		System.out.println("The size heightis: "+sizeheight);
		
		// Get Tagname
		String tagName = driver.findElementById("color").getTagName();
		System.out.println("The Tagname is: "+tagName);
		
		// Get isDisplayed
		System.out.println("Element isDisplayed: "+ driver.findElementById("color").isDisplayed());
		
		
		  // Get isEnabled System.out.println("Element is Editable " +);
		  System.out.println("Element isDisplayed: "+ driver.findElementById("color").isEnabled());
		  
		  //Get isSelected System.out.println("Element isSelected: "+);
		  System.out.println("Element isDisplayed: "+ driver.findElementById("color").isDisplayed());
		 
		
	}

}
