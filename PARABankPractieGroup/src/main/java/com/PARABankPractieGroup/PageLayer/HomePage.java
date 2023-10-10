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
	private By username_txtBox = By.xpath("//input[@name='username']");
	private By password_txtBox = By.xpath("//input[@name='password']");
	private By login_btn = By.xpath("//input[@type='submit']");
	
	public void clickOnRegisterLink()
	{
		driver.findElement(register_link).click();
	}

	public void EnterUserName(String username)
	{
		driver.findElement(username_txtBox).sendKeys(username);
	}
	
	public void EnterPassword(String password)
	{
		driver.findElement(password_txtBox).sendKeys(password);
	}
	public void ClickOnLoginBtn() 
	{
		driver.findElement(login_btn).click();	
		
	}

}
