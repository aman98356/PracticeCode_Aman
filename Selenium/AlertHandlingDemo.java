package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException; 
import org.openqa.selenium.Alert;
// Write a code to handle alert message on a Website browserstack.
public class AlertHandlingDemo {
public static void main(String[] args) throws NoAlertPresentException,InterruptedException { 
System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32_97\\chromedriver.exe"); //mention dummy path or variable that stores chrome driver path 
WebDriver driver = new ChromeDriver(); driver.get("https://www.browserstack.com/users/sign_up");

driver.findElement(By.xpath("//*[@id=\"signin_signup_form\"]/div[1]/div/div[1]/p/a")).click(); 
driver.switchTo().alert().accept();
driver.findElement(By.id("user_email_login")).sendKeys("amankumar91684@gmail.com");
driver.findElement(By.id("user_password")).sendKeys("123456");
driver.findElement(By.xpath("//input[@id='user_submit']")).click();
//driver.findElement(By.id("user_submit")).click();

Thread.sleep(5000);

Alert alert = driver.switchTo().alert(); // switch to alert

String alertMessage= driver.switchTo().alert().getText(); // capture alert message

System.out.println(alertMessage); // Print Alert Message
Thread.sleep(5000);
alert.accept();
}
}