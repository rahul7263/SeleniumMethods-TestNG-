package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic_TestNG {

	@BeforeSuite
	public void openbrowser() {
		System.out.println("openbrowser");
	}
	@BeforeTest
	public void url() {
		System.out.println("enter url");
	}
	@BeforeClass
	public void maximize() {
		System.out.println("maximize browser");
	}
	@BeforeMethod
	public void getcookies() {
		System.out.println("get cookies");
	}
	@Test
	public void BusinessLogic() {
		System.out.println("Business Logic");
	}
	@AfterMethod
	public void TakeScreenshot() {
		System.out.println("Take Screeshot");
	}
	@AfterClass
	public void dlcookies() {
		System.out.println("dlcookies");
	}
	@AfterTest
	public void dbconnectionclosed() {
		System.out.println("CloseBrowser");
	}
	@AfterSuite
	public void CloseBrowser() {
		System.out.println("Close Browser");
	}
}
