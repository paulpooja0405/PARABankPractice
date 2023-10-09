package com.PARABankPractieGroup.TestLayer;

import org.testng.annotations.Test;

import com.PARABankPractieGroup.PageLayer.AccountDetailsPage;
import com.PARABankPractieGroup.PageLayer.AccountServicesPage;
import com.PARABankPractieGroup.PageLayer.HomePage;
import com.PARABankPractieGroup.TestBase.TestBaseClass;

public class AccountOverviewTest extends TestBaseClass {
	
	@Test
	
	public void VerifyAccountOverview()
	{
		HomePage homePage_obj = new HomePage (driver);
		AccountServicesPage accountServicesPage_obj = new AccountServicesPage(driver);
		AccountDetailsPage accountDetailsPage_obj = new AccountDetailsPage (driver);
		
		homePage_obj.EnterUserName("rajaram123");
		homePage_obj.EnterPassword("rajaram123");
		homePage_obj.ClickOnLoginBtn();
		
		accountServicesPage_obj.clickOnAccountOverviewLink();
		
		accountDetailsPage_obj.selectAccountActivity("October");
		accountDetailsPage_obj.selectAccountType("Credit");
		accountDetailsPage_obj.selectgo_btn();
		
		
	}
	

}
