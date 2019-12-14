package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Cycle {
	public String getColor() {
		return "Black";
	}

	public String getColor(String who) {
		if (who.equals("Balaji")) {
			return "Black";
		} else {
			return "Grey";
		}

	}
	
	public String getColor(String who,int cycleNo) {
	
		if (who.equals("Ashwin")&&cycleNo==1234) {
			return "Black";
		} else {
			return "Grey";
		}

	}
	
	
	
	
	
	
	
	
	
	
}
