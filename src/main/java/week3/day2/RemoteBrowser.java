package week3.day2;

// This class need to implement Browser interface
public class RemoteBrowser implements Browser {

	public void locateElement(String locator) {
		System.out.println("The Locator is: ");

	}

	public String getTitle() {

		return "HomePage";
	}

	public void close() {

		System.out.println("The Browser closed");
	}
	
	
	
	
	// Also I need to have additional method
	// other than defined inside the Browser
	public void getCurrentUrl() {
		System.out.println("https://www.google.com");
	}
	
	
	
	
	
	
	
	
	
}
