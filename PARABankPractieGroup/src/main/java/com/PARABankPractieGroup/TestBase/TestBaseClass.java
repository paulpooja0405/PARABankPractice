package com.PARABankPractieGroup.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBaseClass 
{
	public WebDriver driver;
	
	@Test		
	
	public void setup()		
	{
		String Browser = "chrome";
		if(Browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
	driver.manage().window().maximize();
	driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		
	}
}
