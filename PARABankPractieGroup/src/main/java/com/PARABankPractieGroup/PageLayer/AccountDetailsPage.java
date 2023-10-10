package com.PARABankPractieGroup.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage {
	
	private WebDriver driver;
	
	public AccountDetailsPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By AccountNumber_link = By.xpath("//a[@href='activity.htm?id=20670']"); 
	
	private By AccountActivity_dropdown = By.xpath("//*[@name='month']"); 
	
	private By AccountType_dropdown = By.xpath("//*[@name='transactionType']"); 
	
	private By Go_btn = By.xpath("//input[@class='button']"); 
	
	
	public void clickOnAccountNumber ()
	{
		driver.findElement(AccountNumber_link).click();
	}
	
	public void selectAccountActivity (String Activity)
	{
		driver.findElement(AccountActivity_dropdown).sendKeys(Activity);
	}
	
	public void selectAccountType (String Type)
	{
		driver.findElement(AccountType_dropdown).sendKeys(Type);
	}
	
	public void selectgo_btn ()
	{
		driver.findElement(Go_btn).click();
	}

}
