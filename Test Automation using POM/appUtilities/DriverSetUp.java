package appUtilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import gUtilities.ReadProperties;

public class DriverSetUp 
{
	ReadProperties config;
	WebDriver driver;
	public DriverSetUp()
	{
		 config = new ReadProperties("TestData/config.properties");
	}
	
	public WebDriver getDriver()
	{
		if (config.readData("ExecutionType").equalsIgnoreCase("Local"))
		{
			driver = getLocalDriver();
			
		}
		else if  (config.readData("ExecutionType").equalsIgnoreCase("Remote"))
		{
			driver = getRemoteDriver();
		}
		else
		{
			System.out.println("Given Execution is not supported , :" + config.readData("ExecutionType").toUpperCase());
		}
		return driver;
	}
	
	URL url;
	public WebDriver getRemoteDriver()
	{		
		try {
			url = new URL(config.readData("SaucelabsURL"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("name", config.readData("ApplicationName"));
	    capabilities.setCapability(CapabilityType.BROWSER_NAME, config.readData("Browser"));
	    capabilities.setCapability(CapabilityType.VERSION, config.readData("BrowserVersion"));
	    capabilities.setCapability(CapabilityType.PLATFORM, config.readData("OS"));
	    capabilities.setCapability("screen-resolution", config.readData("ScreenResolution"));
	    capabilities.setCapability("username", config.readData("SaucelabsUserName"));
	    capabilities.setCapability("accessKey", config.readData("SaucelabsAccessKey"));
		driver = new RemoteWebDriver(url,capabilities);
		return driver;
	}
	
	public WebDriver getLocalDriver()
	{
		if (config.readData("Browser").equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32_97\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (config.readData("Browser").equalsIgnoreCase("EDGE"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\softwares\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32_97\\chromedriver.exe"); 
			driver = new ChromeDriver();
		}
		return driver;
	}
}
