 package com.Banking.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	public LoginPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="user")
	WebElement txtuserName;
    
	@FindBy(name="pass")
	WebElement txtPassword;
	
	  
    @FindBy(name="btnSubmit")
	WebElement btnSubmit;
		
    
    @FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement lnkLogout;
    
	public void setuserName(String uname)
	{
		txtuserName.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void clicksubmit()
	{
		btnSubmit.click();
	}
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	
}
