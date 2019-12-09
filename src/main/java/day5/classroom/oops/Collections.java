package day5.classroom.oops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set Property 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Launch Chrome Browser
		ChromeDriver d = new ChromeDriver();

		
		//Load URL
		d.get("https://erail.in/trains-between-stations/new-delhi-NDLS/mumbai-central-BCT");

		// Search for Source
		WebElement source = d.findElementByXPath("//input[@id='txtStationFrom']");
		source.clear();
		source.sendKeys("MAS",Keys.TAB);

		// Search for Destination
		WebElement destin = d.findElementByXPath("//input[@id='txtStationTo']");
		destin.clear();
		destin.sendKeys("SBC",Keys.TAB);

		//Uncheck the Select on Date checkbox
		d.findElementByXPath("//input[@id='chkSelectDateOnly']").click();

		// Declare another set to store the List <String>
		List <String> name = new ArrayList<>();

		// Get all the Train names	
		List<WebElement> trainNames = d.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");
		for (WebElement webElement : trainNames) {
			String text = webElement.getText();
			name.add(text);
		}

		// Create a set to Remove duplicates
		Set <String> value =new HashSet<>();
		value.addAll(name);

		// Confirm for duplicate values
		if(value.size()== name.size()) {
			System.out.println("No Duplicate Train Names");
		}else
		{
			System.out.println("Has Duplicate Train Names");
		}


	}

}
