package com.aceinvoice.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;



import io.github.bonigarcia.wdm.WebDriverManager;



public abstract class BaseTest implements Autoconst
{
	public static WebDriver driver = null;
	public WebDriverWait wait = null;
	

	
	@BeforeSuite
	public void launchApp() throws Exception
	{
		
		 WebDriverManager.chromedriver().setup();
		

		driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,10);
		System.out.println("reading base test.....");
	driver.get(APP_URL);
	}
	@AfterSuite
	public void closeApp()
	{
		driver.quit();
	}

}