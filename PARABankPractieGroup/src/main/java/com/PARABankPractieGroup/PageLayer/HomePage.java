package com.PARABankPractieGroup.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By register_link = By.xpath("//a[contains(text(),'Register')]");
	
	public void clickOnRegisterLink()
	{
		driver.findElement(register_link).click();
	}

}
