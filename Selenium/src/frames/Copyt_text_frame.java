package frames;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Copyt_text_frame 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new EdgeDriver();
		/*driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Nested iframe")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		String Email = driver.findElement(By.xpath("//p[text()='Default Email']/following-sibling::p[1]")).getText();
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.switchTo().parentFrame();
		String Pwd = driver.findElement(By.xpath("//p[text()='Default Password']/following-sibling::p[1]")).getText();
		driver.switchTo().frame(0);
		driver.findElement(By.id("password")).sendKeys(Pwd);
		driver.switchTo().parentFrame();
		String Cnfpwd = driver.findElement(By.xpath("//p[text()='Default Confirm Password']/following-sibling::p[1]")).getText();
		driver.switchTo().frame(0);
		driver.findElement(By.id("confirm-password")).sendKeys(Cnfpwd);
		driver.findElement(By.id("submitButton")).click();
		driver.quit();*/
		
	}
}



