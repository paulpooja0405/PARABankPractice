package com.PARABankPractieGroup.TestLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.PARABankPractieGroup.PageLayer.AccountServicesPage;
import com.PARABankPractieGroup.PageLayer.HomePage;
import com.PARABankPractieGroup.PageLayer.NewAccountPage;
import com.PARABankPractieGroup.PageLayer.SignUpPage;
import com.PARABankPractieGroup.TestBase.TestBaseClass;

public class OpenNewAccountTest extends TestBaseClass {

	@Test
	public void validateNewAccount() throws InterruptedException
	{
		
		HomePage homepage_obj = new HomePage(driver);
		//SignUpPage signup_obj = new SignUpPage(driver);
        AccountServicesPage accountServicesPage_obj = new AccountServicesPage(driver);
		NewAccountPage newAccountPage_obj = new NewAccountPage (driver);
		
		homepage_obj.clickOnRegisterLink();
//		signup_obj.EnterFirstName("David");
//		signup_obj.EnterLastName("Miller");
//		signup_obj.EnterAddress("Noida");
//		signup_obj.EnterCity("Noida");
//		signup_obj.EnterState("Noida");
//		signup_obj.EnterZipCode("422605");
//		signup_obj.EnterPhoneNumber("1234567892");
//		signup_obj.EnterSSnNumber("23456789");
//		signup_obj.EnterUserName("parabank2");
//		signup_obj.EnterPassword("parabank2");
//		signup_obj.EnterConfirmPassword("parabank2");
//		signup_obj.ClickOnRegisterButton();
//		Thread.sleep(3000);
//		
		
		homepage_obj.EnterUserName("parabank2");
		homepage_obj.EnterPassword("parabank2");
		Thread.sleep(2000);
		homepage_obj.ClickOnLoginBtn();
		
			
		accountServicesPage_obj.clickOnOpenNewAccount();
		Thread.sleep(2000);

		newAccountPage_obj.selectOptionSavingAccount("SAVINGS");
		Thread.sleep(2000);
		newAccountPage_obj.selectOptionAccountNumber();
		Thread.sleep(2000);
		newAccountPage_obj.clickOnOpenAccountBtn();
	}
	}

