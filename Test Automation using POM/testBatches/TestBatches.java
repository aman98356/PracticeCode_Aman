package testBatches;

//import org.junit.After;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import appUtilities.DriverSetUp;
import gUtilities.ReadProperties;
import testScenarios.TestCases;

public class TestBatches 
{
	WebDriver driver;
	TestCases testCases;
	ReadProperties config;
	public static String env;
	
	public TestBatches()
	{
		driver = new DriverSetUp().getDriver();
		config = new ReadProperties("TestData/config.properties");
		env = config.readData("Environment");
		testCases = new TestCases(driver);
		
	}
	@Test
	public void RunByUserChoice() 
	{
		System.out.println("Implementing env Properties");
		System.out.println("***********Execution summary****");
		System.out.println("Testing Type : " + config.readData("TestingType"));
		System.out.println("Environment : " + config.readData("Environment"));
		System.out.println("Browser : " + config.readData("Browser"));
		System.out.println("******************************************");
		 
		if(config.readData("TestingType").equalsIgnoreCase("Smoke"))
		{
			SmokeSuites();
		}
		else if (config.readData("TestingType").equalsIgnoreCase("Regression")) 
		{
			RegressionSuites();
		}
		else {
			System.out.println(config.readData("TestingType") + ": Testing type not supported");
		}
	}
	@Test
	public void SmokeSuites()
	{
		System.out.println("Smoke Test");
		testCases.BookBusTicketAndPrint();
		testCases.BookBusTicketAndTrackService();
		testCases.BookBusTicketAndCancelTicket();
	}
	@Test
	public void RegressionSuites()
	{
		System.out.println("Regression Test");
		testCases.BookBusTicketAndPrint();
		testCases.BookBusTicketAndCheckTicketStatus();
		testCases.BookBusTicketAndCancelTicket();
		testCases.BookBusTicketAndTrackService();
		testCases.BookBusTicketPrintAndTrackService();
	}
	
	@AfterTest
	public void Quit()
	{
		driver.quit();
	}
}
