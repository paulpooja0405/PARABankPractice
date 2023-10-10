package com.PARABankPractieGroup.TestLayer;

import org.testng.annotations.Test;

import com.PARABankPractieGroup.PageLayer.AccountDetailsPage;
import com.PARABankPractieGroup.PageLayer.AccountServicesPage;
import com.PARABankPractieGroup.PageLayer.HomePage;
import com.PARABankPractieGroup.TestBase.TestBaseClass;

public class AccountOverviewTest extends TestBaseClass {
	
	@Test
	
	public void VerifyAccountOverview() throws InterruptedException
	{
		HomePage homePage_obj = new HomePage (driver);
		AccountServicesPage accountServicesPage_obj = new AccountServicesPage(driver);
		AccountDetailsPage accountDetailsPage_obj = new AccountDetailsPage (driver);
		
		homePage_obj.EnterUserName("parabank2");
		homePage_obj.EnterPassword("parabank2");
		homePage_obj.ClickOnLoginBtn();
		Thread.sleep(2000);
		
		accountServicesPage_obj.clickOnAccountOverviewLink();
		Thread.sleep(2000);
		
		accountDetailsPage_obj.clickOnAccountNumber();
		accountDetailsPage_obj.selectAccountActivity("October");
		Thread.sleep(2000);
		accountDetailsPage_obj.selectAccountType("Credit");
		Thread.sleep(2000);
		accountDetailsPage_obj.selectgo_btn();
		
		
	}
	

}
