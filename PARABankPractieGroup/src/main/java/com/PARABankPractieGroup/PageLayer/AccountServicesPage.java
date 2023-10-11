package com.PARABankPractieGroup.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountServicesPage {


	private WebDriver driver;
	
	public AccountServicesPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By openNewAC_link = By.xpath("//a[text()='Open New Account']");
	private By accountoverview_link = By.xpath("//a[contains(text(),'Accounts Overview')]");
	private By TransferFund_Link=By.xpath("//*[@id='leftPanel']/ul/li[3]/a");
	
	public void clickOnOpenNewAccount()
	{
		driver.findElement(openNewAC_link).click();
	}
	
	public void clickOnAccountOverviewLink()
	{
		driver.findElement(accountoverview_link).click();
	}

	public void clickOnTransferFundLink()
	{
		
		driver.findElement(TransferFund_Link).click();
	}
		
		
	}


