package listbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_alphabetical 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		WebElement fruit = driver.findElement(By.id("fruits"));
		Select s = new Select(fruit);
		List<WebElement>allOpt = s.getOptions();
		List<String>texts=new ArrayList<>();
		for(WebElement a:allOpt)
		{
			texts.add(a.getText());
		}
		Collections.sort(texts);
		for(String f:texts)
		{
			System.out.println(f);
		}
	}
}
