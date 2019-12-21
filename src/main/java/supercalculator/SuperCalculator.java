package supercalculator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SuperCalculator {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Loading a url
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://juliemr.github.io/protractor-demo/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@ng-model='first']").sendKeys("2");
		driver.findElementByXPath("//input[@ng-model='second']").sendKeys("4");
		driver.findElementByXPath("//button[@id='gobutton']").click();
		Thread.sleep(7000);
		String result = driver.findElementByTagName("h2").getText();
		if (result.equals("7")) {
			System.out.println("Result successfully Printed");
		}else
			System.out.println("Wrong Result");
		

	}

}
