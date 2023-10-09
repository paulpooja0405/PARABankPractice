package com.PARABankPractieGroup.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage 
{
	private WebDriver driver;
	
	public SignUpPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	//...........obj repo.............
	
	private By firstname_txtBox = By.xpath("//input[@id='customer.firstName']");
	private By lastname_txtBox = By.xpath("//input[@id='customer.lastName']");
	private By address_txtBox = By.xpath("//input[@id='customer.address.street']");
	private By city_txtBox = By.xpath("//input[@id='customer.address.city']");
	private By state_txtBox = By.xpath("//input[@id='customer.address.state']");
	private By zipcode_txtBox = By.xpath("//input[@id='customer.address.zipCode']");
	private By phone_txtBox = By.xpath("//input[@id='customer.phoneNumber']");
	private By SSN_txtBox = By.xpath("//input[@id='customer.ssn']");
	private By username_txtBox = By.xpath("//input[@id='customer.username']");
	private By password_txtBox = By.xpath("//input[@id='customer.password']");
	private By confirmPass_txtBox = By.xpath("//input[@id='repeatedPassword']");
	private By register_button = By.xpath("//tbody/tr[13]/td[2]/input[1]");

	
	//..........Action Perform............
	
	public void EnterFirstName(String firstname)
	{
		driver.findElement(firstname_txtBox).sendKeys(firstname);
	}
	
	public void EnterLastName(String lastname)
	{
		driver.findElement(lastname_txtBox).sendKeys(lastname);
	}
	
	public void EnterAddress(String Address)
	{
		driver.findElement(address_txtBox).sendKeys(Address);
	}
	
	public void EnterCity(String City)
	{
		driver.findElement(city_txtBox).sendKeys(City);
	}
	
	public void EnterState(String state)
	{
		driver.findElement(state_txtBox).sendKeys(state);
	}
	
	public void EnterZipCode(String zipcode)
	{
		driver.findElement(zipcode_txtBox).sendKeys(zipcode);
	}
	
	public void EnterPhoneNumber(String phoneno)
	{
		driver.findElement(phone_txtBox).sendKeys(phoneno);
	}
	
	public void EnterSSnNumber(String SSN)
	{
		driver.findElement(SSN_txtBox).sendKeys(SSN);
	}
	
	public void EnterUserName(String username)
	{
		driver.findElement(username_txtBox).sendKeys(username);
	}
	
	public void EnterPassword(String password)
	{
		driver.findElement(password_txtBox).sendKeys(password);
	}
	
	public void EnterConfirmPassword(String confirmPassword)
	{
		driver.findElement(confirmPass_txtBox).sendKeys(confirmPassword);
	}
	
	public void ClickOnRegisterButton()
	{
		driver.findElement(register_button).click();
	}

}
