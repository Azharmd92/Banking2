package com.Banking.Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Banking.Pageobject.LoginPage;
import com.Banking.utilities.XLUtils;

public class TC_DataDrivenTest_02 extends Baseclass {
	
	@Test(dataProvider="LoginData")
	public void loginDDt(String username,String password) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setuserName(username);
		logger.info("user name provided");
		lp.setPassword(password);
		logger.info("password provided");
		lp.clicksubmit();
		lp.clickLogout();
	
	}
   
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/Banking/TestData/DDT.xlsx";
	
	    int rownum=XLUtils.getRowCount(path,"Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j);
			}
		}
		return logindata;
	}
	
}
