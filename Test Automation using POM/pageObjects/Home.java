package pageObjects;



import org.openqa.selenium.WebDriver;


import appUtilities.ApplicationUtilities;
import gUtilities.GeneralUtilities;
import gUtilities.ReadProperties;
import testBatches.TestBatches;


public class Home 
{
	WebDriver driver;
	ReadProperties data;
	ApplicationUtilities appUtils;
	
	//GeneralUtilities generalUtilities;
	
	public Home(WebDriver driver)
	{
		this.driver = driver;
		
		data = new ReadProperties("TestData/"+TestBatches.env+"Data.properties");
		appUtils = new ApplicationUtilities(driver);
		//generalUtilities = new GeneralUtilities();
	}
	public void NavigateToHome() 
	{
		System.out.println("Reusable component : Navigate to Home");
		appUtils.getElement("//a[@title='Home']").click();
	}
	
	public void BookTicket()
	{
		System.out.println("Reusable component : Book the ticket");
		
		
		
		appUtils.getElement("//input[@name='source']").sendKeys(data.readData("FromCity")); 
		GeneralUtilities.fixedWait(1); 
		appUtils.clickEnter();
		appUtils.getElement("//input[@name='destination']").sendKeys(data.readData("ToCity")); 
		GeneralUtilities.fixedWait(1);
		appUtils.clickEnter();
		GeneralUtilities.fixedWait(1);
		//driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		appUtils.getElement("//input[@name='txtJourneyDate']").click();
		appUtils.getElement("//a[text()='"+ data.readData("JDate")+"']").click();
		appUtils.getElement("//input[@name='searchBtn']").click();
		GeneralUtilities.fixedWait(1);
		appUtils.getElement("//a[@title='Home']").click();

	}
	
	public void PrintTicket()
	{
		System.out.println("Reusable component : Print the ticket");

	}
}



