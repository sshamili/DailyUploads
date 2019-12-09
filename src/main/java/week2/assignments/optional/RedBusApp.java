package week2.assignments.optional;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Set the property for ChromeDriver
				System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");

				// Initiate the ChromeBroswer
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				ChromeDriver driver = new ChromeDriver(options);
//				ChromeDriver driver = new ChromeDriver();

				// Maximize the browser
				driver.manage().window().maximize();
				
				// Load the URL
				driver.get("https://www.redbus.in/");
				
				Thread.sleep(5000);
				// Enter From (Chennai) and Tab
				driver.findElementByXPath("//input[@id='src']").sendKeys("Chennai");
				
				// Enter To (Trichy) and Tab
				driver.findElementByXPath("//input[@id='dest']").sendKeys("Trichy");
				
				// Click on Current Date
				driver.findElementById("onward_cal").sendKeys("18-Dec-2019");
				
				String day = "15";
				
				// Click on return Date
				driver.findElementByXPath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[6]/td[5]").click();
				
				// Click on Current Date
				driver.findElementByXPath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[4]").click();
			
				// Click Search buses
				driver.findElementByXPath("//*[@id=\"search_btn\"]").click();
				
				// Click After 6pm checkbox
				driver.findElementByXPath("//*[@id=\"filter-block\"]/div/div[2]/ul[2]/li[4]/label[1]").click();
				
				// Click Bus type Ac Checkbox
				driver.findElementByXPath("//*[@id=\"filter-block\"]/div/div[2]/ul[3]/li[3]/label[1]").click();
				
				// Print the number of buses found
				String noOfAvalilableBuses = driver.findElementByXPath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/span[1]/span").getText();
				System.out.println(noOfAvalilableBuses);


	}

}
