package week3.day2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		WebElement elesource = driver.
				findElementById("txtStationFrom");
		elesource.clear();
		elesource.sendKeys("MAS",Keys.TAB);
		WebElement eledestiny = driver
				.findElementById("txtStationTo");
		eledestiny.clear();
		eledestiny.sendKeys("SBC",Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();

		// Find all the train names
		List<WebElement> allTrainNames = driver.
				findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[1]");
		// count of all train names
		System.out.println("All train names "+allTrainNames.size());
		// Create a set for train names
		Set<String> uniqueTrainNames = new HashSet<String>();
		// Loop through the train names and add to Set
		for (WebElement eachTrainElement : allTrainNames) {
			String eachTrainName = eachTrainElement.getText();
			uniqueTrainNames.add(eachTrainName);
		}
		// count of unique train names
		int size = uniqueTrainNames.size();
		System.out.println("Unique train names count "+size);
		
		
		
		
		
		
		
		
		
		


	}

}
