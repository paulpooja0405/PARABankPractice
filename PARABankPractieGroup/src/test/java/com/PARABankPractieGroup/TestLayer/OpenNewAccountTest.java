package com.PARABankPractieGroup.TestLayer;

import org.testng.annotations.Test;

import com.PARABankPractieGroup.PageLayer.AccountServicesPage;
import com.PARABankPractieGroup.PageLayer.HomePage;
import com.PARABankPractieGroup.PageLayer.NewAccountPage;
import com.PARABankPractieGroup.PageLayer.SignUpPage;
import com.PARABankPractieGroup.TestBase.TestBaseClass;

public class OpenNewAccountTest extends TestBaseClass {

	@Test
	public void validateNewAccount()
	{
		//HomePage homepage_obj = new HomePage(driver);
		HomePage homepage_obj = new HomePage(driver);
		SignUpPage signup_obj = new SignUpPage(driver);
        AccountServicesPage accountServicesPage_obj = new AccountServicesPage(driver);
		NewAccountPage newAccountPage_obj = new NewAccountPage (driver);
		
		homepage_obj.clickOnRegisterLink();
		signup_obj.EnterFirstName("David");
		signup_obj.EnterLastName("Miller");
		signup_obj.EnterAddress("Noida");
		signup_obj.EnterCity("Noida");
		signup_obj.EnterState("Noida");
		signup_obj.EnterZipCode("422605");
		signup_obj.EnterPhoneNumber("1234567892");
		signup_obj.EnterSSnNumber("23456789");
		signup_obj.EnterUserName("parabank2");
		signup_obj.EnterPassword("parabank2");
		signup_obj.EnterConfirmPassword("parabank2");
		signup_obj.ClickOnRegisterButton();
		
		
		
		homepage_obj.EnterUserName("parabank2");
		homepage_obj.EnterPassword("parabank2");
		homepage_obj.ClickOnLoginBtn();
		accountServicesPage_obj.clickOnOpenNewAccount();
		System.out.println("click");
		 newAccountPage_obj.selectOptionSavingAccount("SAVINGS");
		 newAccountPage_obj.selectOptionAccountNumber();
		 newAccountPage_obj.clickOnOpenAccountBtn();
	}
	}

