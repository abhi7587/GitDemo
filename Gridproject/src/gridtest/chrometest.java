package gridtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class chrometest {

	
	
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		//Desired capabilities
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.109:4444/wd/hub"),cap);
		driver.get("https://rediff.com");
		
		
		
		
		
		
		
	}

}
