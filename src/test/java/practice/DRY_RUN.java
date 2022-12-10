package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class DRY_RUN {
    
    @Test
    public void dryrun() throws InterruptedException {
    
        System.setProperty("webdriver.chrome.driver", "H:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        
        WebElement logo = driver.findElement(By.xpath("//img[@title=\"Flipkart\"]"));
        boolean True = logo.isDisplayed();
        
        if(True) {
        	
        	driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("iphone 14 pro");
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        	driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys(Keys.ENTER);
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        	driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro (Space Black, 512 GB)')]")).click();
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }else {
        	driver.close();
        }
        
        Set<String> AllTabs = driver.getWindowHandles();
        for(String x : AllTabs) {
        	
        	driver.switchTo().window(x);
        }
        
        String s = driver.findElement(By.xpath("//div[@class=\"_30jeq3 _16Jk6d\"]")).getText();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println(s);
        
        String parent = driver.getWindowHandle();
        
        driver.switchTo().window(parent);
        
        driver.close();
        Thread.sleep(3000);
        driver.quit();
        Thread.sleep(3000);
    }
}