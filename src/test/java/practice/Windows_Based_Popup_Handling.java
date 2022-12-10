package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windows_Based_Popup_Handling {
 
	WebDriver driver;
	
   @BeforeSuite
   public void setup() {
	   
	System.out.println("Windows based popup handling");
	System.setProperty("webdriver.chrome.driver", "D:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	
	
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("1234567890");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
    driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
    driver.switchTo().alert().accept();
    driver.switchTo().alert().accept();
    
    driver.findElement(By.xpath("//input[@name=\"res\"]")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.close();
   }
   
   @BeforeTest
   @BeforeClass
   @BeforeMethod
   @Test
   @AfterMethod
   @AfterClass
   @AfterTest
   @AfterSuite
   public void aftersuite() {
	   System.out.println("after suite block is excuted ");
   }
}
