package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

// Class contains Test Script for Launch on the website and validating the Title on "Yahoo"
public class Selenium_Practice 
{
	String expectedTitle = "Yahoo Search - Web Search";
	@Test
	public void launchApplication_Yahoo() throws InterruptedException
	{
	System.out.println("Test Case:Launch Application");
	System.setProperty("webdriver.chrome.driver", "D:\\\\softwares\\\\chromedriver_win32_97\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); // Creating driver object
	driver.get("https://yahoo.com");
	String actualTittle = driver.getTitle();
	System.out.println("My tittle :" +actualTittle);
	System.out.println("my url" +driver.getCurrentUrl());
	System.out.println("My session ID" +driver.getWindowHandle());
	if(expectedTitle.equals(actualTittle))
	{
	System.out.println("Tittle Validation Passed");
	}
	Assert.assertEquals(expectedTitle,actualTittle); //validating title
	WebElement emailObj = driver.findElement(By.id("yschsp"));
	if(emailObj.isDisplayed() && emailObj.isEnabled())
	{
	emailObj.click();
	emailObj.sendKeys("fgfgghh");
	Thread.sleep(2000);
	emailObj.clear();
	Thread.sleep(2000);
	emailObj.sendKeys("kawal@gmail.com");
	emailObj.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/form/button")).click();

	}
	else
	{
	System.out.println("email or phone number object not displayed");
	}
	//driver.findElement(By.name("identifier")).sendKeys("kawal@");

	}
}

