package com.Banking.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter {


	   public ExtentSparkReporter htmlReporter;
	   public ExtentReports extent;
	   public ExtentTest logger;


	   public void onStart(ITestContext testContext)
	   {
	      
	      String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
	      String repName="Test-Report-"+timeStamp+".html";
	      htmlReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/"+repName);//specify location 
	      try {
			htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  

	      extent=new ExtentReports();

	      extent.attachReporter(htmlReporter);
	      extent.setSystemInfo("Host name","localhost");
	      extent.setSystemInfo("Environment","QA");
	      extent.setSystemInfo("user","Azhar");

	      htmlReporter.config().setDocumentTitle("InetBanking Test Project");//Title of Report
	      htmlReporter.config().setReportName("Functional Test Report");// name of the Report
	      htmlReporter.config().setTheme(Theme.DARK);
	  
	   }
	  
	  public void onTestSuccess(ITestResult tr)
	  {
	      logger=extent.createTest(tr.getName());// create new entry in the report
	      logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));//send the passed information 
	  }

	  public void onTestFailure(ITestResult tr)
	  {
	      logger=extent.createTest(tr.getName());//create new entry in the report
	      logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));// send the passed information

	   
	  
	}

	    public void onTestSkipped(ITestResult tr)
	   {
	       logger=extent.createTest(tr.getName());//creat new entry in the report
	       logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
	     }
	 
	    public void onFinish(ITestContext testContext)
	    {
	     extent.flush();
	    }
	} 


