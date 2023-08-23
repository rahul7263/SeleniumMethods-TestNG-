package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Drop_Down_Select {
                  
	@Test
	public void drop_down() {
		
		System.setProperty("webdriver.driver.chrome", "H:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
	
		Select drop = new Select(driver.findElement(By.xpath("//select[@name=\"country\"]")));
		drop.selectByValue("INDIA");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.close();
		
		
	}
}
