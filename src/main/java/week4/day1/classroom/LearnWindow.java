package week4.day1.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) throws InterruptedException {
		
		// Set Property 
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
				//Launch Chrome Browser
				ChromeDriver d = new ChromeDriver();
				
				// Add implict wait
				d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//Load URL
				d.get("http://leafground.com/pages/Window.html");
				
				// Click the Multiple Window button
				d.findElementByXPath("//button[text()='Open Multiple Windows']").click();
				
				// Sleep time
				Thread.sleep(5000);
				
				// Get the Windows
				Set<String> windowHandles = d.getWindowHandles();
				System.out.println("No.of Windows opened: "+windowHandles.size());
				
				// Move the window handles to list
				List<String> lstWindows = new ArrayList<String>(windowHandles);
				
				// Get window reference address
				for (String eachWindow : lstWindows) {
					// Move to each window 
					d.switchTo().window(eachWindow);
					
					// Verify the title is "Hyper"
					if(d.getTitle().contains("Hyper")) {
						
						// Print the title of that window
						System.out.println(d.getTitle());
						
						//close the window
						d.close();
						break;
					}
					
//					System.out.println("List of Windows names: "+string);
				}
				
//				d.switchTo().window(lstWindows.get(lstWindows.size()-1));
				
	}

}
