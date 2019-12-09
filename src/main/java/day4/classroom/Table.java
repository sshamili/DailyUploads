package day4.classroom;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set Property 
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
				//Launch Chrome Browser
				ChromeDriver d = new ChromeDriver();
				
				//Load URL
				d.get("https://erail.in/trains-between-stations/new-delhi-NDLS/mumbai-central-BCT");
				
				// Table
				
			List<WebElement> findElementsByXPath = d.findElementsByXPath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//td[2]");
				
				
	}

}
