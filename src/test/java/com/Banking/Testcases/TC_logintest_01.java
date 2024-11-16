package com.Banking.Testcases;

import org.testng.annotations.Test;

import com.Banking.Pageobject.LoginPage;

public class TC_logintest_01 extends Baseclass {
	
	@Test
	public void logintest() throws InterruptedException
	{
		
	    logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setuserName(username);
		logger.info("Entered the UserName");
		
		Thread.sleep(1000);
		lp.setPassword(password);
		logger.info("Entered the password");
		Thread.sleep(3000);
		lp.clicksubmit();
		Thread.sleep(3000);
		

	}

}
