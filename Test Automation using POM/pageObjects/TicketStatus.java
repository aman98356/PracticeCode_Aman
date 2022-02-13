package pageObjects;

import org.openqa.selenium.WebDriver;


import appUtilities.ApplicationUtilities;
import gUtilities.ReadProperties;
import testBatches.TestBatches;

public class TicketStatus 
{
	WebDriver driver;
	ReadProperties data;
	ApplicationUtilities appUtilities;
	
	public TicketStatus(WebDriver driver)
	{
		
		this.driver = driver;
		data = new ReadProperties("TestData/"+TestBatches.env+"Data.properties");
		appUtilities = new ApplicationUtilities(driver);
	}
	public void NavigateToTicketStatus()
	{
		System.out.println("Reusable component : Navigate to Ticket Status Page ");
		appUtilities.getElement("//a[@title='Ticket Status']").click();
		
	}
	
	public void CheckTicketStatus()
	{
		System.out.println("Reusable component : Check Ticket Status ");
		appUtilities.getElement("//input[@type='text' and @class='searchTktCancel' and @id='id']").sendKeys(data.readData("TicketNum"));
		appUtilities.clickEnter();
		
	}
}
