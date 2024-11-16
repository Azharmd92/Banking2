package com.Banking.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleformsPage {

	

	WebDriver ldriver;
	public SampleformsPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[@class='highlighttab']")
	WebElement lnkSampleForms;
	
	@FindBy(xpath="//input[@value='0']")
	WebElement clickCheckbox;
	
	@FindBy(name="subject")
	WebElement txtSubject;
	
	@FindBy(name="email")
	WebElement txtEmail;
	

	
public void clickSampleForms() {
	lnkSampleForms.click();
}

public void CheckBox() {
	clickCheckbox.click();
}

public void Subject(String subject) {
	txtSubject.sendKeys(subject);
}

public void Email(String email) {
	txtEmail.sendKeys(email);
}

	
}
	
