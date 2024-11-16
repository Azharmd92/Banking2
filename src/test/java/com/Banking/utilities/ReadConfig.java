package com.Banking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src =new File("./Configurations//Config.Properties");
		
	
	try {
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	}catch(Exception e) {
		System.out.println("Exception is " + e.getMessage());
	}

}
	 public String getApplicationURL()
	 {
		 String URL=pro.getProperty("baseURL");
		 return URL;
	 }
	 public String getUserName()
	 {
		 String UserName=pro.getProperty("username");
		 return UserName;
	 }
	 public String getpassword()
	 {
		 String Password=pro.getProperty("password");
		 return Password;
	 }
	public String getChromepath() {
		String Chromepath=pro.getProperty("Chromepath");
		return Chromepath;
	}
	public String getIEpath() {
		String iepath=pro.getProperty("iepath");
		return iepath;
	} 
	public String getFirefoxpath() {
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	} 
}
