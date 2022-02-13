package Selenium;

import java.util.List;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// Practicing different locators to locate different Web Elements on Gmail
public class Xpath_Practice 
{
	public WebDriver driver;
	
	public Xpath_Practice() 
		
	{
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32_97\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test
	public void LaunchApplication()
	{
		driver.get("https://www.gmail.com");
	}
	
	//Login 
	@Test
	public void LoginApplication() 
	{
		LaunchApplication();
		driver.findElement(By.id("identifierId")).sendKeys("amankumar91684@gmail.com");         //Id locator
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();                              //class locators
		
		
	}
	@Test
	public void ForgotEmail() throws InterruptedException 
	{
		LaunchApplication();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//driver.findElement(By.tagName("button")).click();                                       //Tagname Locator
		//driver.findElement(By.linkText("Forgot email?")).click();                               //linktext Locator
		//driver.findElement(By.xpath("//button[@jsname='Cuz2Ue']")).click();                     //xpath by attribute
		//driver.findElement(By.xpath("//button[text()='Forgot email?']")).click();               //xpath by text() function
		//driver.findElement(By.xpath("//*[text()='Forgot email?']")).click();                    //Xpath by text() function
		driver.findElement(By.xpath("//button[contains(text(),'Forgot email?')]")).click();     //Xpath by contains
		Thread.sleep(4000);
		driver.quit();
	}
	@Test
	public void LearnMore()
	{
		LaunchApplication();
		//driver.findElement(By.tagName("a")).click();                      //tagName Locators
		driver.findElement(By.linkText("Learn more")).click();              //LinkText Locators
		//driver.findElement(By.partialLinkText("Learn")).click();          //Partial LinkText Locators
		//driver.findElement(By.xpath("//a[@jsname='JFyozc']")).click();    //xpath by Attribute
		driver.quit();
	}
	
	// locating Create Account button through conditional statement on gmail
	@Test
	public void CreateAccount() 
	{
		LaunchApplication();
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		for(int i=0; i<elements.size() ; i++) 
		{
			WebElement element = elements.get(i);
			String a = element.getText();
			if(a.equals("Create account")) 
			{
				element.click();
				break;
			}
		}
				
	}
	
	
}
