package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_deselect 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		WebElement fruit = driver.findElement(By.id("fruits"));
		Select s = new Select(fruit);
		List<WebElement>allOpt = s.getOptions();
		int count = allOpt.size();
		for(int i=0;i<count;i++)
		{
			Thread.sleep(500);
			s.selectByIndex(i);
		}
		for(int i=count-1;i>=0;i--)
		{
			Thread.sleep(500);
			s.deselectByIndex(i);
		}


	}

}
