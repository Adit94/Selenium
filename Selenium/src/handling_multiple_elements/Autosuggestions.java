package handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb")).sendKeys("ICC");
		Thread.sleep(1000);
		List<WebElement>autoSugg=driver.findElements(By.xpath("//span[contains(text(),'Champions')]"));
		int count = autoSugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = autoSugg.get(i).getText();
			System.out.println(text);
		}
		autoSugg.get(count-1).click();
		driver.quit();
	}
}