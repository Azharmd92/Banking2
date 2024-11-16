package com.Banking.Testcases;

import org.testng.annotations.Test;

import com.Banking.Pageobject.RegisterPage;

public class TC_SignUp_03 extends Baseclass {
	
	@Test
	public void SignUP() throws Exception {
		
		RegisterPage register=new RegisterPage(driver);
		register.clickSignUpForFree();
		Thread.sleep(1000);
		register.Name("Azhar");
		register.Email("mdazhar.4ever@gmail.com");
		register.UserName("azhar123");
		register.Password("12345");
		register.Password2("12345");
		register.clickCheckBox();
		
	}

}
