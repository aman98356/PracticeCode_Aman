package Selenium;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RedBusAutomation 
{
	WebDriver driver;
	public RedBusAutomation() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32_97\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public void Launch() 
	{
		driver.get("https://www.redbus.in/");
		
	}
	@Test
	public void WebTable() 
	{
		Launch();
		WebElement myCalender = driver.findElement(By.xpath("//table[@class='rb-monthTable first last']"));
		List<WebElement> myRows = myCalender.findElements(By.tagName("tr"));
		 int rowCount = myRows.size();
	        System.out.println("My Row Count :" + rowCount);
	        WebElement secondRow = myRows.get(1);
	        List<WebElement> myColumns = secondRow.findElements(By.tagName("th"));
	        System.out.println("My Column Count :" + myColumns.size());
	        List<WebElement> row3 = myRows.get(2).findElements(By.tagName("td"));
	        row3.get(0).getText();  // 3,0
	        //get cell data row = 4  col = 2
	        String val42 = myRows.get(4).findElements(By.tagName("td")).get(2).getText();
	        System.out.println("Cell Data at 4,2 :" + val42);
	}
}
