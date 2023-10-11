package com.PARABankPractieGroup.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferFundpage {

	private  WebDriver driver;

	public TransferFundpage(WebDriver driver) 
	{
		this.driver = driver;
	}

	//...........obj repo..............
	private   By Ammount_txtbox =By.xpath("//input[@id=\"amount\"]");
	private By Transfer_btn =By.xpath("//input[@type=\"submit\"]");
	private By status_msg =By.xpath("//h1[@class='title']");
	public   void enterAmount(String data) 
	{
		driver.findElement(Ammount_txtbox).sendKeys(data);
	}
	public void  clickontransferbutton() 
	{
		driver.findElement(Transfer_btn).click();
	}

	public String getStatusMsg()
	{
		return driver.findElement(status_msg).getText();
	}


}
