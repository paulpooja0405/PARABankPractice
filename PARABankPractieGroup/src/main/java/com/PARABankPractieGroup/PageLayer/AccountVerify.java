package com.PARABankPractieGroup.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountVerify {
	
	private WebDriver driver ;
	
	public AccountVerify (WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By accountNo_link = By.xpath("//a[@class='ng-binding']");
	
	public void clickOnAccountNo ()
	{
		driver.findElement(accountNo_link).click();
	}

}
