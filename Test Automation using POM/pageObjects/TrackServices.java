package pageObjects;

import org.openqa.selenium.WebDriver;


import appUtilities.ApplicationUtilities;
import gUtilities.ReadProperties;
import testBatches.TestBatches;

public class TrackServices 
{
	WebDriver driver;
	ReadProperties data;
	ApplicationUtilities appUtilities;
	
	public TrackServices(WebDriver driver)
	{
		this.driver = driver;
		data = new ReadProperties("TestData/DevData.properties");
		appUtilities = new ApplicationUtilities(driver);
	}
	public void NavigatetoTrackServices()
	{
		System.out.println("Reusable component : Navigate to Track Services");
		appUtilities.getElement("//a[@title='Track Service']").click();
	}
	public void TrackTheService()
	{
		System.out.println("Reusable component :  Track Services");
		appUtilities.getElement("//input[@name='serviceCode']").sendKeys(data.readData("TicketNum"));
	}
	
}
