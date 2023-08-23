package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

//@Ignore
//@Test
public class Complete_TestNG {
     
	WebDriver driver;
	

	@BeforeSuite(groups={"functional"})
    public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "H:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}
	
	@BeforeTest
	public void beforetest() {
		
		System.out.println("this is before test");
	}
	
	@BeforeClass
	public void beforeclass() {
		
		System.out.println("this is before class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		
	}
    
	@Test(priority =1,description="lunch the website",groups={"functional"})
	public void lunchsite1() {
		
		driver.get("https://www.mercurytravels.co.in ");
	  
		
	}
	
	@Parameters({"username","password"})
	@Test(priority = 2,dataProvider="DP",description = "User Login Test",alwaysRun=true,dependsOnMethods= {"lunchsite1"},invocationCount =1,groups= {"functional"})	
	public void login2(String name,@Optional("Sushil@123")String pass) throws InterruptedException {
		
		 Actions act = new Actions(driver);
		act.click(driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[2]"))).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[contains(text(),\"User Login\")])[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"sign_user_email\"]")).sendKeys(name);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"sign_user_password\"]")).sendKeys(pass);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[contains(text(),\"Log in\")])[1]")).click();
	    Thread.sleep(3000);
	    
	    act.click(driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[4]"))).perform();
	    Thread.sleep(3000);
	     
	    driver.findElement(By.xpath("(//a[contains(text(),\"Log Out\")])[2]")).click();
	    Thread.sleep(3000);
		
		
	}
	
	@Test(priority = 3,description = "current url")
	public void currenturl3() {
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	@Test(priority = 4,description = "title")
	public void titletest4() {
		
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=5,description="take a screenshot",groups={"functional"})
	public void screenshot() throws IOException {
		
		System.out.println("screenshot taken");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src,new File("C:\\Users\\Rahul\\git\\Selenium_Lectures\\Selenium_Lectures\\Screenshots"));
	}
	
   	   @DataProvider(name ="DP")
      //public static Object[][] loginCredentails{
	  //return new [][] {"sushilsonawane@gmail.com","Sushil@123"},{"sushilsonawane@gmail.com","Sushil@123"},{"sushilsonawane@gmail.com","Sushil@123"}
   	  //}
	
	@AfterMethod
	public void after_mehtod() {
		
		System.out.println("this is the after method");
	}
	
	
	//@Ignore
	@AfterClass
     public void after_class() {
		
		
	}
	
	@AfterTest
	public void after_test() {
		
		System.out.println("this is after test");
	}
	
	@AfterSuite(groups= {"functional"})
	public void after_suite() {
		
		driver.close();
		System.out.println("this is the after suite");
		
	} 
}
