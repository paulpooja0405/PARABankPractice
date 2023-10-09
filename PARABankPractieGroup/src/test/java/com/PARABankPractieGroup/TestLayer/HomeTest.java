package com.PARABankPractieGroup.TestLayer;

import org.testng.annotations.Test;

import com.PARABankPractieGroup.PageLayer.HomePage;
import com.PARABankPractieGroup.TestBase.TestBaseClass;

public class HomeTest extends TestBaseClass
{
	@Test
	
	public void validateRegisterLink()
	{
		HomePage homepage_obj = new HomePage(driver);
		homepage_obj.clickOnRegisterLink();
		homepage_obj.EnterUserName("parabank1");
		homepage_obj.EnterPassword("parabank1");
		homepage_obj.ClickOnLoginBtn();
	}

}
