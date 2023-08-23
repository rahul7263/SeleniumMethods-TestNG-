package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;




public class ExtentReport {
    

	
	@Test
	public void report() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Creating HTML Report
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		//Attching Reports to HTML Fie
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		//For Getting Test Logs 
        ExtentTest test = extent.createTest("FirstTest","Discription");
		
		test.info("user on home page");
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		test.info("user searching a product");
		driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys("iphone 14 pro");
		
		test.info("user is clicked on search button");
		driver.findElement(By.xpath("//button[@class=\"_2iLD__\"]")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		test.info("user found the Respective product");
		driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro (Space Black, 256 GB)')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		test.info("moving to new tab");
		//window handles moving to new opened tab of website
		
		Set<String> NewTab = driver.getWindowHandles();
		for(String x:NewTab) {
			
			driver.switchTo().window(x);
		}
		
		test.info("getting product price and verify we are on new tab");
		String iprice = driver.findElement(By.xpath("//div[@class=\"_30jeq3 _16Jk6d\"]")).getText();
		System.out.println(iprice);
		
		test.info("getting back to main page");
		//using window handle we get parent page  of website
		String MainTab = driver.getWindowHandle();
		
		driver.switchTo().window(MainTab);
		
		test.info("Closed Second Tab");
		driver.close();
		Thread.sleep(3000);
		
	   	test.info("Closed main tab");
		driver.quit();
		Thread.sleep(3000);
		
		//To end the Report 
		extent.flush();

	}
}
