package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		//Establishing runtime connection for Chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//To open a Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//Loading a url
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Finding an element and storing it into a variable
		WebElement userName = driver.findElementById("username");
		userName.sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		
		
		
		
		
		
		
		
		
	}

}
