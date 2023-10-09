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
	
	
	public void clickOnOpenNewAccount()
	{
		driver.findElement(openNewAC_link).click();
	}
	

}