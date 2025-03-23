package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_select 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://output.jsbin.com/osebed/2");
		WebElement fruit = driver.findElement(By.id("fruits"));
		Select s = new Select(fruit);
		List<WebElement>allOpts=s.getOptions();
		for(int i=0;i<allOpts.size();i++)
		{
			String text = allOpts.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
