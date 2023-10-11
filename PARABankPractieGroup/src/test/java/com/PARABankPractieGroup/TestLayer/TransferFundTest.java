package com.PARABankPractieGroup.TestLayer;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.PARABankPractieGroup.PageLayer.AccountServicesPage;
import com.PARABankPractieGroup.PageLayer.HomePage;
//import com.PARABankPractieGroup.PageLayer.SignUpPage;
import com.PARABankPractieGroup.PageLayer.TransferFundpage;
import com.PARABankPractieGroup.TestBase.TestBaseClass;

public class TransferFundTest extends TestBaseClass{
	
	@Test
	public void validateTransferFund() throws InterruptedException 
	{
         String expected_result ="Transfer Complete!";
		HomePage homepage_obj = new HomePage(driver);
		AccountServicesPage accountpage_obj =new AccountServicesPage(driver);
		TransferFundpage transferfund_obj = new TransferFundpage(driver);
		homepage_obj.EnterUserName("parabank1");
		homepage_obj.EnterPassword("parabank1");
		homepage_obj.ClickOnLoginBtn();
		accountpage_obj.clickOnTransferFundLink();
		transferfund_obj.enterAmount("10");
		Thread.sleep(2000);
		transferfund_obj.clickontransferbutton();
		Thread.sleep(2000);
		Assert.assertEquals(transferfund_obj.getStatusMsg(),expected_result );
	}

}

