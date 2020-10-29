package com.aceinvoice.generic;


import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;

	public class BasePage
	{
		WebDriver driver = null;
	
		
		public BasePage(WebDriver driver)
		{
			this.driver = driver;
		}

	public void scrollDown(WebElement scrollElement) {
		
		
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			w.until(ExpectedConditions.elementToBeClickable(scrollElement));
			JavascriptExecutor executor3 = (JavascriptExecutor)driver;
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement);
		}
		catch(Exception e)
		{
			System.out.println("Unable to click the element "+scrollElement +": "+ e);
			
		}
		
		
		
	}
	
	
	
		
		
		
		
	
		
		public void verifyTitlePresent(String expTitle,String actTitle,WebElement bd)
		{
			WebDriverWait w = new WebDriverWait(driver, 30);
			
			try
			{
				w.until(ExpectedConditions.visibilityOf(bd));
				
				Assert.assertEquals(actTitle, expTitle);
	
			}
			catch(Exception e)
			{
				System.out.println(expTitle+" and "+actTitle +" didnot match "+e);
			}
		}
		public void verifyElementClickable(WebElement eles)
		{
			WebDriverWait w = new WebDriverWait(driver, 10);
			try
			{
				w.until(ExpectedConditions.elementToBeClickable(eles));
			
			}
			catch(Exception e)
			{
				System.out.println("Unable to click the element "+eles +": "+ e);
				
			}
		}
		public void verifyElementPresent(WebElement ele)
		{
			WebDriverWait w = new WebDriverWait(driver, 30);
			try
			{
				w.until(ExpectedConditions.visibilityOf(ele));
			
			}
			catch(Exception e)
			{
				System.out.println("Unable to find the element "+ele +": "+ e);
				
			}
		}
		
	
	

		
	}