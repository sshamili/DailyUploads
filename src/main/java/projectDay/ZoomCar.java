package projectDay;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.zoomcar.com/chennai");
		driver.findElementByXPath("//a[text()='Start your wonderful journey']").click();
		driver.findElementByXPath("//div[text()[normalize-space()='Thuraipakkam']]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		
		Date date = new Date(); // Get the current date 
		DateFormat sdf = new SimpleDateFormat("dd"); //Get only the date (and not month, year, time etc) 
		String today = sdf.format(date); // Get today's date 
		int tomorrow = Integer.parseInt(today)+1; // Convert to integer and add 1 to it 
		System.out.println(tomorrow); // Print tomorrow's date
		
		driver.findElementByXPath("//div[contains(text(),'"+tomorrow+"')]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		String pickUpDate = driver.findElementByXPath("//div[text()='PICKUP TIME']/following::div[2]").getText();
		if (pickUpDate.contains(String.valueOf(tomorrow))) {
			System.out.println("Correct date is picked");
		}else {
			System.out.println("Not picked the correct date");
		}
		driver.findElementByXPath("//button[text()='Done']").click();
		Thread.sleep(10000);
		//String carName = "";
		Map<String, String> map = new LinkedHashMap<>();
	List<WebElement> carDisplayed = driver.findElementsByTagName("h3");
	System.out.println("Number of Cars Displayed : "+carDisplayed.size());
	for (int i = 1; i <= carDisplayed.size(); i++) {
		String carName = driver.findElementByXPath("(//h3)["+i+"]").getText();
		String carPrice = driver.findElementByXPath("(//div[@class='price'])["+i+"]").getText().replaceAll("[^0-9]","");
		map.put(carName, carPrice);
	}
	System.out.println(map);
	
	
	Map<String, String> result = sortMap(map);
    for (Map.Entry<String, String> entry : result.entrySet())
    {
        System.out.print("Key: " + entry.getKey());
        System.out.println(" Value: " + entry.getValue());
    }
}



public static LinkedHashMap<String, String> sortMap(Map<String, String> map) {
    List<Map.Entry<String, String>> capitalList = new LinkedList<>(map.entrySet());
    Collections.sort(capitalList, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
    Collections.reverse(capitalList);
    LinkedHashMap<String, String> result = new LinkedHashMap<>();
    for (Map.Entry<String, String> entry : capitalList)
    {
        result.put(entry.getKey(), entry.getValue());
    }
    return result;
}
		/*
		 * for (WebElement car : carDisplayed) { System.out.println(car.getText()); }
		 * List<Integer> amt = new ArrayList<>(); List<WebElement> price =
		 * driver.findElementsByXPath("//div[@class='price']"); for (WebElement allPrice
		 * : price) { String lstPrice = allPrice.getText().replaceAll("[^0-9]", "");
		 * amt.add(Integer.parseInt(lstPrice)); } System.out.println(amt);
		 * Collections.sort(amt); Collections.reverse(amt);
		 */
	
	//System.out.println("After Sort: "+amt);
	
	//System.out.println("Highest Amount: "+amt.get(0));
	
//	Map<String, Integer> map = new TreeMap<>();
//	map.put(carDisplayed, price);
	
}