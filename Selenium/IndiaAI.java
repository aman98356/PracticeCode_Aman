package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//Class contains TestScript for launch, SignIn, logout and Scrolling on the home page of "IndiAI" official website
public class IndiaAI 
{
	public WebDriver driver;
	public JavascriptExecutor js;
	Actions act;
	public IndiaAI()  // constructor
	{
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32_97\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor)driver;
		act = new Actions(driver);
	}
	@Test
	public void Launch()
	{
	
		// WebDriver driver = new ChromeDriver();
		driver.get("https://indiaai.gov.in/");
		driver.manage().window().maximize();
	}
	// Test Script for signing in and Logout from the IndiaAI official website 
	@Test
	public void SignIn() throws InterruptedException 
	{
		Launch();
		driver.findElement(By.xpath("//button[@ class='signup-button signup-signin-btn']")).click();
		//Thread.sleep(2000);
		fixedwait(1);
		driver.findElement(By.xpath("/html/body/div[8]/div/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/input")).sendKeys("testbluelupin@rediffmail.com");
		driver.findElement(By.xpath("//input[@placeholder= 'Password']")).sendKeys("Aman@123");
		//button[@class='basic-cta']
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(5000);
		Logout();
	}
	private void fixedwait(int i) {
		// TODO Auto-generated method stub
		
	}
	
	public void Logout() throws InterruptedException 
	{
		driver.findElement(By.xpath("//img[@id='letter-close']")).click();
		driver.findElement(By.xpath("//div[@id='profile']")).click();
		driver.findElement(By.xpath("/html/body/div[8]/div/div/div[1]/header/div/div[3]/div[3]/div/a[1]/div")).click();
		Thread.sleep(5000);
		WebElement LogoutButton = driver.findElement(By.xpath("//button[@class='bttn_ logout_bttn']"));
		
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,600)");
		js.executeScript("arguments[0].click();", LogoutButton);

		//Actions act = new Actions(driver);
		//act.moveToElement(LogoutButton).click();
		//Thread.sleep(5000);
		//LogoutButton.click();	
	}	
	//test case for Launching the website and navigating to Article module
	@Test
	public void Article() {
		Launch();
		
		WebElement art = driver.findElement(By.xpath("//li[text()='ARTICLES']"));
		act.click(art).perform();
	}
	//Test script for scrolling on Home page of IndiaAI official website
	@Test
	public void Home() 
	{
		Launch();
		js.executeScript("window.scrollBy(0,2000)");
		
		
		
	}
}
