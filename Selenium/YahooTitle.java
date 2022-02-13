package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;
// class content different Test scripts for validation web page title on Yahoo, Amazon, Fipkart Website
public class YahooTitle 
{
	String expectedTitle = "Yahoo Search - Web Search";
	String expectedAmazonTitle = "Amazon.com. Spend less. Smile more.";
	String expectedFlipkartTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	
	//Yahoo Title Validation : Assignment
	@Test
	public void Practice() throws InterruptedException 
	{
		System.out.println("Assignment for title : Yahoo ");
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32_97\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title Title is =     " + actualTitle);
		System.out.println("Window Handle =     " + driver.getWindowHandle());
		System.out.println("" +driver.getCurrentUrl());
		
		if(expectedTitle.equals(actualTitle))   // Custom Assertions
		{
			System.out.println("Yahoo Title Validation : Passed");
		}
		else
		{
			System.out.println("Yahoo Title Validation : failed");
		}
		
		
		Assert.assertEquals(expectedTitle, actualTitle); // Junit Assertions
		
		
		WebElement emailobj = driver.findElement(By.name("p"));
		if(emailobj.isDisplayed() && emailobj.isEnabled()) 
		{
			emailobj.clear();
			Thread.sleep(2000);
			emailobj.sendKeys("rcerc");
			Thread.sleep(2000);
			emailobj.clear();
			emailobj.sendKeys("amansingh@gmail.com");
			driver.findElement(By.className("mag-glass")).click();
		}
		
		else
		{
			System.out.println("Email or phone number object is not displayed / not enabled");
		}
		
		// driver.findElement(By.name("p")).sendKeys("rvre");
	}
	
	
	
	// Amazon title Validation : Assignment
	@Test
	public void AmazonTitle()
	{
		System.out.println("Test Case : Amazon Title check");
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32_97\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\Amazon.com");
		String actualTitle = driver.getTitle();
		// System.out.println(actualTitle);
		Assert.assertEquals(expectedAmazonTitle, actualTitle);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("black T-shirt");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
	
	
	// Flipkart title Validation : Assignment
	@Test
	public void flipkart() 
	{
		System.out.println("Test Case : FlipKart title Validation");
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32_97\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://flipkart.com");
		String actualFlipkartTitle = driver.getTitle();
		
		
		 // System.out.println(actualFlipkartTitle);
			
		
		if(expectedFlipkartTitle.equals(actualFlipkartTitle))
		{
			System.out.println("FlipKart Title Validation : Passed");
		}
		else
		{
			System.out.println("FlipKart Title Validation : Failed");
		}
		
		Assert.assertEquals(expectedFlipkartTitle, actualFlipkartTitle);
		
		
		//WebElement obj = driver.findElement(By.className("_2KpZ6l _2doB4z"));
		//obj.click();
		//obj.sendKeys("gbg");
		//driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU")).sendKeys("abcdefghi");
		
	}
}
