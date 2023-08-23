package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframe {
     
	 public static WebDriver driver;
    
	 
	  @Test
	  public static void iframedemo(){
		  
		  System.setProperty("webdriver.driver.chrome", "H:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.globalsqa.com/demo-site/draganddrop");
		  driver.manage().window().maximize();
		  
		  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]")));
		  
		  WebElement soruce = driver.findElement(By.xpath("//img[@src=\"images/high_tatras2_min.jpg\"]"));
		  WebElement target = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		  
		   Actions act = new Actions(driver);
		  act.dragAndDrop(soruce, target).build().perform();
		  
		  driver.switchTo().defaultContent();
		  String s = driver.findElement(By.xpath("//div/h1[contains(text(),'Drag And Drop')]")).getText();
		  System.out.println(s);
		  
		  driver.close();
		        
	  }
	  

}
