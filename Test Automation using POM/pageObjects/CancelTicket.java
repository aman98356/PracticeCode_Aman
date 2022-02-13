package pageObjects;

import org.openqa.selenium.WebDriver;


import appUtilities.ApplicationUtilities;
import gUtilities.ReadProperties;
import testBatches.TestBatches;

public class CancelTicket 
{
	WebDriver driver;
	ReadProperties data;
	ApplicationUtilities appUtilities;
	
	public CancelTicket(WebDriver driver)
	{
		this.driver = driver;
		data = new ReadProperties("TestData/"+TestBatches.env+"Data.properties");
		appUtilities = new ApplicationUtilities(driver);
	}
	public void NavigatetoCancelTicket()
	{
		System.out.println("Reusable component : Navigate to cancel Ticket");
		appUtilities.getElement("//a[@title='Cancel Ticket']").click();
		
	}
	public void CancelTheTicket()
	{
		System.out.println("Reusable component :  Cancel the ticket");
		appUtilities.getElement("//input[@name='id']").sendKeys(data.readData("TicketNum"));
	}

}
