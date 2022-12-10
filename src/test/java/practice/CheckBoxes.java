package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
      
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 // Selecting CheckBox	(guru99)
		WebElement box = driver.findElement(By.xpath("//input[@id=\"vfb-6-2\"]"));
		// This will Toggle the Check box
		box.click();
		
		
		//Selecting all check boxes at once
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[contains(@id,'day')]"));
		System.out.println("Total Number Of CheckBoxes "+checkboxes.size());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		for(int i =0; i<checkboxes.size();i++) {
			
			checkboxes.get(i).click();
			Thread.sleep(3000);
		}
		
		driver.close();
				
	}
}
