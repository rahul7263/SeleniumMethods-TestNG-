package practice;

import org.openqa.selenium.By;
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
import org.testng.annotations.Test;

public class Single_Test {
	
	
	WebDriver driver;
	
	@BeforeSuite
	public void openbrowser() {
		
		System.out.println("openbrowser");
		System.setProperty("webdriver.chrome.driver", "H:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@BeforeTest
	public void url() {
		
		System.out.println("enter url");
		driver.get("https://www.mercurytravels.co.in/");
	}
	@BeforeClass
	public void maximize() {
		
		System.out.println("maximize browser");
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void getcookies() {
		
	}
	
	@Test
	public void businesslogic_1() throws InterruptedException {
		
		System.out.println("Test one Completed");
		
		Actions act = new Actions(driver);
		act.click(driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[2]"))).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'User Login')])[2]")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@id=\"sign_user_email\"]")).sendKeys("sonawanesushil5700@gmail.com");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@id=\"sign_user_password\"]")).sendKeys("Sushil@123");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//button[contains(text(),\"Log in\")])[1]")).click();
        Thread.sleep(3000);
        
        WebElement x = driver.findElement(By.xpath("//button[@class=\"close open_parent\"]"));
        boolean True = x.isDisplayed();
        
        if(True) {
        	
        	  x.click();
        	  Thread.sleep(3000);
        	
        	 driver.findElement(By.xpath("//input[@id=\"sign_user_email\"]")).clear();
             Thread.sleep(3000);
             
             driver.findElement(By.xpath("//input[@id=\"sign_user_password\"]")).clear();
             Thread.sleep(3000);
             
             driver.findElement(By.xpath("//input[@id=\"sign_user_email\"]")).sendKeys("sonawanesushil57@gmail.com");
             Thread.sleep(3000);
             
             driver.findElement(By.xpath("//input[@id=\"sign_user_password\"]")).sendKeys("Sushil@123");
        	 Thread.sleep(3000);
        	 
        	 driver.findElement(By.xpath("(//button[contains(text(),\"Log in\")])[1]")).click();
             Thread.sleep(3000);
             
             
             
        }else {
        	
        }
        
        Thread.sleep(3000);
        String title = driver.getTitle();
        System.out.println(title);
		
        act.click(driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[4]"))).perform();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//a[contains(text(),\"Log Out\")])[2]")).click();
		
	}
	
	@Test
	public void businesslogic_2() throws InterruptedException {
		
		System.out.println("Test Two Completed");
		
		Actions act = new Actions(driver);
		act.click(driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[2]"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[contains(text(),'User Login')])[2]")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@id=\"sign_user_email\"]")).sendKeys("sonawanesushil5700@gmail.com");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@id=\"sign_user_password\"]")).sendKeys("Sushil@123");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//button[contains(text(),\"Log in\")])[1]")).click();
        Thread.sleep(3000);
        
        WebElement x = driver.findElement(By.xpath("//button[@class=\"close open_parent\"]"));
        boolean True = x.isDisplayed();
        
        if(True) {
        	
        	  x.click();
        	  Thread.sleep(3000);
        	
        	 driver.findElement(By.xpath("//input[@id=\"sign_user_email\"]")).clear();
             Thread.sleep(3000);
             
             driver.findElement(By.xpath("//input[@id=\"sign_user_password\"]")).clear();
             Thread.sleep(3000);
             
             driver.findElement(By.xpath("//input[@id=\"sign_user_email\"]")).sendKeys("sonawanesushil57@gmail.com");
             Thread.sleep(3000);
             
             driver.findElement(By.xpath("//input[@id=\"sign_user_password\"]")).sendKeys("Sushil@123");
        	 Thread.sleep(3000);
        	 
        	 driver.findElement(By.xpath("(//button[contains(text(),\"Log in\")])[1]")).click();
             Thread.sleep(3000);
             
        }else {
        	
        }
        
        Thread.sleep(3000);
        String title = driver.getTitle();
        System.out.println(title);
		
        act.click(driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[4]"))).perform();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//a[contains(text(),\"Log Out\")])[2]")).click();
		
	}
	
	@AfterMethod
	public void takescreenshot() {
		
	}
	@AfterClass
	public void dlcookies() {
		
	}
	@AfterTest
	public void dbconnectionclosd() {
		
	}
	@AfterSuite
	public void closebrowser() {
		
		System.out.println("closebrowser");
		driver.close();
	}

}
