package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.github.dockerjava.api.model.Driver;
import com.sun.org.apache.xerces.internal.impl.xs.identity.Field.XPath;

import io.github.bonigarcia.wdm.WebDriverManager;


public class practice{
	  WebDriver chrome = new ChromeDriver();
	
	 @BeforeSuite
     public void beforesuite(){
		 System.out.println("before suite");
	 }
	 @BeforeTest 
     public void beforetest(){
		 System.out.println("before test");
	 }
	 @BeforeClass
     public void beforeclass(){
		 System.out.println("before class");
	 }
	 @BeforeMethod
     public void beforemethod(){
		 System.out.println("before method");
	 }
	 
	 @Test
	 public void logic() throws InterruptedException {
         
		System.setProperty("webdriver.chrome.driver","H:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
		
		
		chrome.get("https://www.flipkart.com/");
		chrome.manage().window().maximize();
        
		chrome.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)chrome;
		
		js.executeScript("window.scrollBy(0,2400)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-2400)");
		Thread.sleep(3000);
	 }
	 
	 @AfterMethod
	 public void aftermethod(){
		 System.out.println("after method");
	 }
	 @AfterClass
     public void afterclass(){
		 System.out.println("after class");
	 }
	 @AfterTest
      public void aftertest(){
		 System.out.println("after test");
		    chrome.close();
	        chrome.quit();
	 }
	 @AfterSuite
	 public void aftersuite(){
		 System.out.println("after suite");
	 }
    	
}

