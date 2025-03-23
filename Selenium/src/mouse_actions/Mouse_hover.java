package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) 
	{
		// Open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Enter www.vtiger.com
		driver.get("https://www.vtiger.com/");
		// Mouse hover to Company
		WebElement target = driver.findElement(By.partialLinkText("Company"));
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
		// Click on Contact Us in dropdown
		driver.findElement(By.partialLinkText("Contact Us")).click();
		// Print Bengaluru, India phone number
		String pNo = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
		System.out.println(pNo);
		driver.quit();
	}
}