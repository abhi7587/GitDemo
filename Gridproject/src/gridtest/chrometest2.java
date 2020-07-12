package gridtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class chrometest2 {

	DesiredCapabilities cap;
	
	/*@Test
	public void grid(String browserName) throws MalformedURLException
	{
		
		
		browserName = "chrome";
		if(browserName.equalsIgnoreCase("chrome"))
		{
		cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.109:4444/wd/hub"),cap);
		driver.get("https://rediff.com");
		}
		
		
	}*/
	
	

	/*@Test
	@Parameters("browser")
	public void grid(String browserName) throws MalformedURLException
	{
		
		
	
		//Define capabilities
		cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		//chrome options
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		
		
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.109:4444/wd/hub"),options);
		driver.get("https://rediff.com");
		
		
		
	}*/
	
	
	
	@Test
	@Parameters("browser")
	public void grid2(String browserName) throws MalformedURLException
	{
		
		
		//define capabilities
		cap = new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		
		
		//define firefoxoptions
		FirefoxOptions options = new FirefoxOptions();
		options.merge(options);
		
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.109:4444/wd/hub"),options);
		driver.get("https://www.facebook.com/");
		
		
		
	}
	
	
	

}
