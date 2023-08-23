 package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FileUpload {
	
	public static void main(String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\Rahul\\Downloads\\logo.png");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"terms\"]")).click();
        Thread.sleep(1000);
		
        driver.findElement(By.xpath("//button[@id=\"submitbutton\"]")).click();
        Thread.sleep(1000);
        
        Thread.sleep(1000);
		driver.close();
		
		
	}

}