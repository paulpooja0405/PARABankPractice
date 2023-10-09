package com.PARABankPractieGroup.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {

private WebDriver driver;
	
	
	
	public NewAccountPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------- Obj repo --------------------
	@FindBy(xpath="//select[@id='type']")
	private WebElement ckecking_dropdown;
	
	@FindBy(xpath="//select[@id='fromAccountId']")
	private WebElement account_id_dropdown;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement openAc_btn;
	
	
	public void selectOptionSavingAccount(String data)
	{
		Select s = new Select( ckecking_dropdown);
		s.selectByVisibleText(data);
	}
	
	public void selectOptionAccountNumber()
	{
		account_id_dropdown.click();
	}
	
	public void clickOnOpenAccountBtn()
	{
		openAc_btn.click();
	}
}
