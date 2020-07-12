package gridtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class multiplebrowser {
	
	WebDriver driver;
	String browserName;
	
	@Test
	@Parameters("browser")
	
	public void browser(String browserName)
	{
		
		this.browserName = browserName;
		
		if(browserName.equalsIgnoreCase("chrome"))
		
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://google.com");
			driver.quit();
		}
		
		
	}
	
	
	
	@Test
	@Parameters("browser")
	public void parallelbrowser(String browserName)
	{
		
		this.browserName = browserName;
		 if(browserName.equalsIgnoreCase("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.quit();
			
		}
		
		
		
		
	}

}
