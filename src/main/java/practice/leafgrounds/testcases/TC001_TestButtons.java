package practice.leafgrounds.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import practice.leafgrounds.Base.BaseProjectMethods;
import practice.leafgrounds.pages.LeafgroundHomePage;

public class TC001_TestButtons extends BaseProjectMethods{

	@Test
	public void moveToButtonPage() {
	
		new LeafgroundHomePage(driver)
		.test()
		.button();
		
	}
	
//	@Test
//	  public void checkAllButtons() throws InterruptedException {
//		
//		new LeafgroundHomePage(driver)
//		.test()
//		.button()
//		.clickHomeButton()
//		.getPostion()
//		.getPostionX()
//		.getPostionY().getWidthheigth()
//		.getHeight()
//		.getWidth()
//		.getButtonColor();
//	  }
}
