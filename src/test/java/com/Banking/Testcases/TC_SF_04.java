package com.Banking.Testcases;

import org.testng.annotations.Test;

import com.Banking.Pageobject.SampleformsPage;

public class TC_SF_04 extends Baseclass {
	
	@Test
	public void SF() throws Exception  {
		
		SampleformsPage sf=new SampleformsPage(driver);
		sf.clickSampleForms();;
		Thread.sleep(3000);
		sf.CheckBox();
		Thread.sleep(1000);
		sf.Subject("ABCDEF");
		sf.Email("hdjikljd@gmail.com");
	}
	
	
}
