package com.Banking.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	

	WebDriver ldriver;
	public RegisterPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//a[normalize-space()='Sign Up For Free']")
	WebElement lnkSignUpForFree;
	
	@FindBy(name="name")
	WebElement txtName;
	
	@FindBy(name="email")
	WebElement txtEmail;
	
	@FindBy(name="user_signup")
	WebElement txtuserName;
	
	@FindBy(name="pass_signup")
	WebElement txtPassword;
	
	@FindBy(name="pass2")
	WebElement txtPassword2;
	
	@FindBy(xpath="//input[@id='useragree']")
	WebElement clickCheckbox;
	
	@FindBy(name="Submit")
	WebElement btnSubmit;
	
	public void clickSignUpForFree() {
	lnkSignUpForFree.click();
	}
	
	public void Name(String name) {
	txtName.sendKeys(name);
	}
	public void Email(String email) {
	txtEmail.sendKeys(email);
	}
	public void UserName(String username) {
    txtuserName.sendKeys(username);
	}
	public void Password(String password) {
	txtPassword.sendKeys(password);
		
	}
	public void Password2(String password2) {
	txtPassword2.sendKeys(password2);
	
	}
	public void clickCheckBox() {
		clickCheckbox.click();
		
	}
	public void Submit(String submit) {
	btnSubmit.click();	
	}

}
