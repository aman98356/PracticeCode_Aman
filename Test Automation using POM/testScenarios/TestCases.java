package testScenarios;



import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.CancelTicket;
import pageObjects.Home;
import pageObjects.Login;
import pageObjects.TicketStatus;
import pageObjects.TrackServices;

public class TestCases 
{
	
	WebDriver driver;
	Login login;
	Home home;
	TicketStatus ticketStatus;
	CancelTicket cancelTicket;
	TrackServices TrackServices;
	
	public TestCases(WebDriver driver)
	{
		this.driver = driver;
		
		//System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32_97\\chromedriver.exe");
		//driver = new ChromeDriver();
		login = new Login(driver);
		home= new Home(driver);
		ticketStatus = new TicketStatus(driver);
		cancelTicket = new CancelTicket(driver);
		TrackServices= new TrackServices(driver);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@Test
	public void BookBusTicketAndPrint()
	{
		driver.manage().window().maximize();
		System.out.println("Test Case : Book Bus Ticket And then Print");
		login.LaunchApplication();
		login.LoginApplication();
		home.NavigateToHome();
		home.BookTicket();
		home.PrintTicket();
		login.LogoutFromApplication();
		login.CloseApplication();
	}
	@Test
	public void BookBusTicketAndCheckTicketStatus()
	{
		System.out.println("Test Case : Book Bus Ticket And then Ticket Status");
		login.LaunchApplication();
		login.LoginApplication();
		home.NavigateToHome();
		home.BookTicket();
		ticketStatus.NavigateToTicketStatus();
		ticketStatus.CheckTicketStatus();
		login.LogoutFromApplication();
		login.CloseApplication();
		
		
	}
	@Test
	public void BookBusTicketAndCancelTicket() 
	{
		System.out.println("Test Case : Book Bus Ticket And then Cancel ticket");
		login.LaunchApplication();
		login.LoginApplication();
		home.NavigateToHome();
		home.BookTicket();
		cancelTicket.NavigatetoCancelTicket();
		cancelTicket.CancelTheTicket();
		login.LogoutFromApplication();
		login.CloseApplication();
		
		
	}
	@Test
	public void BookBusTicketAndTrackService() 
	{
		System.out.println("Test Case : Book Bus Ticket And then Track Service");
		login.LaunchApplication();
		login.LoginApplication();
		home.NavigateToHome();
		home.BookTicket();
		TrackServices.NavigatetoTrackServices();
		TrackServices.TrackTheService();
		login.LogoutFromApplication();
		login.CloseApplication();
		
	}
	@Test
	public void BookBusTicketPrintAndTrackService() 
	{
		System.out.println("Test Case : Book Bus Ticket And Print and then Track Service");
		login.LaunchApplication();
		login.LoginApplication();
		home.NavigateToHome();
		home.BookTicket();
		home.PrintTicket();
		TrackServices.NavigatetoTrackServices();
		TrackServices.TrackTheService();
		login.LogoutFromApplication();
		login.CloseApplication();
		
	}
}
