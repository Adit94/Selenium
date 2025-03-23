package testNG;

import org.testng.annotations.DataProvider;

public class Actitime 
{
	@DataProvider(name="Login")
	public Object[][] data() 
	{
		return new Object[][] {{"admin", "manager"}};
	}
}