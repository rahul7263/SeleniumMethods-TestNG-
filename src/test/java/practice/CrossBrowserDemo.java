package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserDemo {
    
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void startapp(String browser) throws InterruptedException {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
			driver = new FirefoxDriver();
			
		}else if (browser.equalsIgnoreCase("IE")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
		    driver = new InternetExplorerDriver();
		
		}else if (browser.equalsIgnoreCase("Edge")) {
			
			System.setProperty("webdriver.edge.driver", "D:\\Software Testing Course\\Automation Manual Testing\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
	    driver.get("https://opencart.com");
	    Thread.sleep(3000);
	    driver.close();
	}
}
