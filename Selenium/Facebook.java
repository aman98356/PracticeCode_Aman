package Selenium;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook 
{
	public WebDriver driver;
	public Facebook() 
	{
		ChromeOptions options= new ChromeOptions();  // object creation for ChromeOptions interface
		options.addArguments("--disable-notifications"); //Handling notification
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32_97\\chromedriver.exe");
		driver = new ChromeDriver(options);
		
	}
	@Test
	public void Launch() 
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void Login() throws InterruptedException 
	{
		Launch();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9472301623");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Krishna@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		/*
		 * WebElement Input =
		 * driver.findElement(By.xpath("//input[@aria-label='Search Facebook']"));
		 * Input.sendKeys("Priya"); Thread.sleep(2000); List<WebElement> suggestions =
		 * driver.findElements(By.xpath("//span[contains(text(), 'Priya')]"));
		 * 
		 * System.out.println(suggestions.size());
		 * 
		 * for(int i=0; i<suggestions.size(); i++) {
		 * if(suggestions.get(i).getText().equalsIgnoreCase("Priya Sharma")) {
		 * suggestions.get(i).click(); break; } }
		 */
		/*
		 * Thread.sleep(3000); driver.findElement(By.
		 * xpath("//span[text() = 'Priya Sharma' and @class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5']"
		 * )).click(); Thread.sleep(3000); driver.findElement(By.
		 * xpath("//a[@href = '/100010318175096/' and @role='menuitem']")).click();
		 * Thread.sleep(2000);
		 * //driver.findElement(By.xpath("//div[@aria-label='Close chat']")).click();
		 * driver.findElement(By.xpath("//p[@class='kvgmc6g5 oygrvhab']")).
		 * sendKeys("I Love You");
		 * driver.findElement(By.xpath("//div[@aria-label='Press Enter to send']")).
		 * click();
		 */
		//Input.sendKeys(Keys.ARROW_DOWN);
		//Input.sendKeys(Keys.ENTER);
	}
}