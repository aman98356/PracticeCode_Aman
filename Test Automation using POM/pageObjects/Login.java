package pageObjects;
import org.openqa.selenium.WebDriver;


import gUtilities.ReadProperties;
import testBatches.TestBatches;


public class Login 
{
	WebDriver driver;
	ReadProperties data;
	
	
	public Login(WebDriver driver)
	{
		
		this.driver = driver;
		//TestBatches test = new TestBatches();
		data = new ReadProperties("TestData/"+TestBatches.env+"Data.properties");
	}

	public void LaunchApplication()
	{
		System.out.println("Reusable component : Launch the Application");
		driver.get(data.readData("URL"));
	}

	public void LoginApplication()
	{
		System.out.println("Reusable component : Login to Application");
	}

	public void LogoutFromApplication()
	{
		System.out.println("Reusable component : Logout from Application");
	}
	
	public void CloseApplication()
	{
		System.out.println("Reusable component : Close the Application");
	}
	
}
