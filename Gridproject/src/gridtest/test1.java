package gridtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {

	
	@Test
	@Parameters("browser")
	public void testmethod1(String browserName)
	{
		
		System.out.println("testmethod1 = " + browserName);
		
	}
	
	
	@Test
	public void test2firefox()
	{
		
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.quit();
		
	}
}
