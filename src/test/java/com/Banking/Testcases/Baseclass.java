package com.Banking.Testcases;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Banking.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	ReadConfig readconfig= new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUserName();
	public String password=readconfig. getpassword();
	public static WebDriver driver;
	public static Logger logger;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		logger=Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
	if(br.equals("chrome"))	
	{
		System.setProperty("webdriver.chrome.driver","C://Users//mdazh//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		 ChromeOptions co = new ChromeOptions();
	       co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	else if(br.equals("ie"))
	{
		System.setProperty("webdriver.ie.driver",readconfig.getIEpath() );
		 driver=new InternetExplorerDriver();
	}
	else if(br.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxpath() );
		 driver=new FirefoxDriver();
	}
	
	driver.get(baseURL);
		
	driver.manage().window().maximize();
		
		 
		
	} 
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

}
