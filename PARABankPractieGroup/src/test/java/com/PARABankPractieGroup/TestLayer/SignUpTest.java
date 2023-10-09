package com.PARABankPractieGroup.TestLayer;

import org.testng.annotations.Test;

import com.PARABankPractieGroup.PageLayer.HomePage;
import com.PARABankPractieGroup.PageLayer.SignUpPage;
import com.PARABankPractieGroup.TestBase.TestBaseClass;

public class SignUpTest extends TestBaseClass
{
	@Test
	public void verifySignUpPage()
    {
		HomePage homepage_obj = new HomePage(driver);
		SignUpPage signup_obj = new SignUpPage(driver);
		homepage_obj.clickOnRegisterLink();
		signup_obj.EnterFirstName("David");
		signup_obj.EnterLastName("Miller");
		signup_obj.EnterAddress("Noida");
		signup_obj.EnterCity("Noida");
		signup_obj.EnterState("Noida");
		signup_obj.EnterZipCode("422605");
		signup_obj.EnterPhoneNumber("1234567892");
		signup_obj.EnterSSnNumber("23456789");
		signup_obj.EnterUserName("parabank1");
		signup_obj.EnterPassword("parabank1");
		signup_obj.EnterConfirmPassword("parabank1");
		signup_obj.ClickOnRegisterButton();
	}
}
