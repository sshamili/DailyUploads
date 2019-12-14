package week2.day1.assignments.assignment1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set Property 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
						
		//Launch Chrome Browser
		ChromeDriver d = new ChromeDriver();
		
		//Load URL
		d.get("http://leafground.com/pages/Dropdown.html");
		
		// Get Title
		System.out.println("Title: "+d.getTitle());
		
		// Get Current URL
		System.out.println("Current URL: "+d.getCurrentUrl());
		
		// Get Page Source
		System.out.println("Page Source: "+d.getPageSource());
		
		// Get Attribute
		System.out.println("Attribute name of first Dropdown: "+d.findElementById("dropdown1").getAttribute("id"));
		
		// Get CssVALUE
		System.out.println("CssValue: "+d.findElementById("dropdown1").getCssValue("font-family"));
		
		// Get Text
		System.out.println("Text: ");
		Select s=new Select(d.findElementById("dropdown1"));
		
		List<WebElement> options = s.getOptions();
		int size = options.size();
		for (WebElement c : options) {
			System.out.println(c.getText());
		}
		
		for (int i = 0; i < size; i++) {
			
			s.selectByIndex(i);
		}
		
		// Get Location
		System.out.println("Location: "+d.findElementById("dropdown1").getLocation());
		System.out.println("Location X: "+d.findElementById("dropdown1").getLocation().getX());
		System.out.println("Location Y: "+d.findElementById("dropdown1").getLocation().getY());
		
		// Get Size 
		System.out.println("size: "+d.findElementById("dropdown1").getSize());
		System.out.println("size height: "+d.findElementById("dropdown1").getSize().getHeight());
		System.out.println("size width: "+d.findElementById("dropdown1").getSize().getWidth());
		
		// Get Tagname
		System.out.println("Tagname: "+d.findElementById("dropdown1").getTagName());
		
		// Get isDisplayed()
		System.out.println("Dropdown Displayed? "+d.findElementById("dropdown1").isDisplayed());
		
		// Get isEnabled()
		System.out.println("Dropdown enabled? "+d.findElementById("dropdown1").isEnabled());
		
		// Get isSelected()
		System.out.println("Dropdown Selected? "+d.findElementById("dropdown1").isSelected());

	}

}
