package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
     
	@Test
	public void screenshot_demo() throws IOException{
	     
		System.setProperty("webdriver.chrome.driver", "H:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//a[@class=\"btn btn-black navbar-btn\"]")).click();
		  
		 System.out.println("screenshot taken");
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFileToDirectory(src,new File("C:\\Users\\Rahul\\eclipse-workspace\\practice\\screenshots"));
			
			driver.close();
	}
}
