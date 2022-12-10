package practice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement source = driver.findElement(By.xpath("//div[@id=\"box6\"]"));
		WebElement target = driver.findElement(By.xpath("//div[@id=\"box106\"]"));
		
		Actions A = new Actions(driver);
		A.dragAndDrop(source, target).build().perform();
		Thread.sleep(3000);

		
	}


}

