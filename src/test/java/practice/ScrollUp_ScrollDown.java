package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUp_ScrollDown {
  
	@Test
	public void up_down() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://tus.io/demo.html");
	      driver.manage().window().maximize();
	      
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      
	      //Scroll down
	      js.executeScript("window.scrollBy(0,1200)");
	      Thread.sleep(2000);
	      
	      //Scroll Up
	      js.executeScript("window.scrollBy(0,-1200)");
	      Thread.sleep(2000);
	      
          driver.get("https://demo.guru99.com/test/guru99home/");
		  driver.manage().window().maximize();
			
		  WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		  Thread.sleep(3000);
			
	      js.executeScript("arguments[0].scrollIntoView();", facebook);
		  driver.close();
	}
}
