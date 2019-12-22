package week4.assignments;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import learnexcel.LearnExcel;

public class ProjectSpecificMethods {

	public ChromeDriver driver;
	public String excelFileName;
	@BeforeMethod
	@Parameters({"url","userName","password"})
	public void login(String url, String username, String password) throws InterruptedException {
		

		//Set system property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Launch chrome
		driver = new ChromeDriver();

		// Maximize window
		driver.manage().window().maximize();

		// Apply Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Launch URL
		driver.get(url);

		Thread.sleep(5000);

		// Enter the Username
		driver.findElementById("username").sendKeys(username);

		// Enter the password
		driver.findElementById("password").sendKeys(password);

		// Click Login button
		driver.findElementByClassName("decorativeSubmit").click();

		// Click crm/sfa link
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
	}
	
@AfterMethod
public void logout() {
	//		close browser
	driver.close();
	}

@DataProvider
public String[][] getData() throws IOException{
	
	LearnExcel lrn= new LearnExcel();
	
	
		/*
		 * String[][] data = new String[2][3];
		 * 
		 * data[0][0] = "Testleaf"; data[0][1] ="Sam"; data[0][2]="Anderzen";
		 * 
		 * data[1][0] = "Testleaf"; data[1][1] ="balaji"; data[1][2]="S";
		 */
	return lrn.readExcel(excelFileName);
	
	
}
}
