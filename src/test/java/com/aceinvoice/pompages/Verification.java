package com.aceinvoice.pompages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aceinvoice.generic.BasePage;


public class Verification extends BasePage{

	WebDriver driver;
	public Verification(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	
	
	@FindBy(how=How.XPATH,using="//table//tbody//td[2]//a")
	WebElement verifyname;
	public void verifyTeamName(String expected) {
		
		try {
		verifyElementPresent(verifyname);
        String actElement=verifyname.getText();

		verifyTitlePresent(expected,actElement,verifyname);
			
			
		}
		catch(Exception e) {
			System.out.println("verifyname"+e);
			
		}
	
	}
	
	
	@FindBy(how=How.XPATH,using="//table//tbody//td[3]")
	WebElement verifyteamemail;
	public void verifyTeamEmail(String expected) {
		
		try {
		verifyElementPresent(verifyteamemail);
        String actElement=verifyteamemail.getText();

		verifyTitlePresent(expected,actElement,verifyteamemail);
			
			
		}
		catch(Exception e) {
			System.out.println("verifyteamemail"+e);
			
		}
	
	}
	
	
	
	
	@FindBy(how=How.XPATH,using="//div[@data-test-id='client-name']")
	WebElement verifyclientname;
	public void verifyClientName(String expected) {
		
		try {
		verifyElementPresent(verifyclientname);
        String actElement=verifyclientname.getText();

		verifyTitlePresent(expected,actElement,verifyclientname);
			
			
		}
		catch(Exception e) {
			System.out.println("verifyclientname"+e);
			
		}
	
	}
	
	@FindBy(how=How.XPATH,using="//div[@data-test-id='client-secondary-name']")
	WebElement verifyclientsecondaryname;
	public void verifyClientSecondaryName(String expected) {
		
		try {
		verifyElementPresent(verifyclientsecondaryname);
        String actElement=verifyclientsecondaryname.getText();

		verifyTitlePresent(expected,actElement,verifyclientsecondaryname);
			
			
		}
		catch(Exception e) {
			System.out.println("verifyclientsecondaryname"+e);
			
		}
	
	}
	
	@FindBy(how=How.XPATH,using="//div[@data-test-id='client-address-line-one']")
	WebElement verifyclientaddress1;
	public void verifyClientAddress1(String expected) {
		
		try {
		verifyElementPresent(verifyclientaddress1);
        String actElement=verifyclientaddress1.getText();

		verifyTitlePresent(expected,actElement,verifyclientaddress1);
			
			
		}
		catch(Exception e) {
			System.out.println("verifyclientaddress1"+e);
			
		}
	
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@data-test-id='client-address-line-two']")
	WebElement verifyclientaddress2;
	public void verifyClientAddress2(String expected) {
		
		try {
		verifyElementPresent(verifyclientaddress2);
         String actElement=verifyclientaddress2.getText();

		verifyTitlePresent(expected,actElement,verifyclientaddress2);
			
			
		}
		catch(Exception e) {
			System.out.println("verifyclientaddress2"+e);
			
		}
	
	}
	
	
	
	
	@FindBy(how=How.XPATH,using="//div[@data-test-id='client-address-city-zipcode']")
	WebElement verifyclientcityandzipcode;
	public void verifyClientCityAndZipcode(String expected) {
		
		try {
		verifyElementPresent(verifyclientcityandzipcode);
        String actElement=verifyclientcityandzipcode.getText();

		verifyTitlePresent(expected,actElement,verifyclientcityandzipcode);
			
			
		}
		catch(Exception e) {
			System.out.println("verifyclientcityandzipcode"+e);
			
		}
	
	}
	
	
	
	
	@FindBy(how=How.XPATH,using="//div[@data-test-id='client-address-state']")
	WebElement verifyclientstate;
	public void verifyClientState(String expected) {
		
		try {
		verifyElementPresent(verifyclientstate);
        String actElement=verifyclientstate.getText();

		verifyTitlePresent(expected,actElement,verifyclientstate);
			
			
		}
		catch(Exception e) {
			System.out.println("verifyclientstate"+e);
			
		}
	
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@data-test-id='client-address-country']")
	WebElement verifyclientcountry;
	public void verifyClientCountry(String expected) {
		
		try {
		verifyElementPresent(verifyclientcountry);
         String actElement=verifyclientcountry.getText();

		verifyTitlePresent(expected,actElement,verifyclientcountry);
			
			
		}
		catch(Exception e) {
			System.out.println("verifyclientcountry"+e);
			
		}
	
	}
	
	
	
	
	@FindBy(how=How.XPATH,using="//span[@class='project-name']")
	WebElement verifyprojectname;
	public void verifyProjectName(String expected) {
		
		try {
			scrollDown(verifyprojectname);
		verifyElementPresent(verifyprojectname);
        String actElement=verifyprojectname.getText();

		verifyTitlePresent(expected,actElement,verifyprojectname);
			
			
		}
		catch(Exception e) {
			System.out.println("verifyprojectname"+e);
			
		}
	
	}
	
	
	
	@FindBy(how=How.XPATH,using="//div[@data-test-id='time-entry-hours-0']")
	WebElement verifyprojecthours;
	public void verifyProjectHours(String expected) {
		
		try {
			scrollDown(verifyprojecthours);
		verifyElementPresent(verifyprojecthours);
        String actElement=verifyprojecthours.getText();
		verifyTitlePresent(expected,actElement,verifyprojecthours);
			
			
		}
		catch(Exception e) {
			System.out.println("verifyprojecthours"+e);
			
		}
	
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@class='entry-notes']")
	WebElement verifyprojectnote;
	public void verifyProjectNote(String expected) {
		
		try {
			scrollDown(verifyprojectnote);
		verifyElementPresent(verifyprojectnote);
       String actElement=verifyprojectnote.getText();

		verifyTitlePresent(expected,actElement,verifyprojectnote);
			
			
		}
		catch(Exception e) {
			System.out.println("verifyprojectnote"+e);
			
		}
	
	}
	
	
	
	@FindBy(how=How.XPATH,using="//span[@class='task-name mr-3 grey-badge']")
	WebElement verifyprojecttask;
	public void verifyProjectTask(String expected) {
		
		try {
			scrollDown(verifyprojecttask);
		verifyElementPresent(verifyprojecttask);
        String actElement=verifyprojecttask.getText();

		verifyTitlePresent(expected,actElement,verifyprojecttask);
			
			
		}
		catch(Exception e) {
			System.out.println("verifyprojecttask"+e);
			
		}
	
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@data-test-id='project-name']")
	WebElement verifyprojecname;
	public void verifyProjecName(String expected) {
		
		try {
			scrollDown(verifyprojecname);
		verifyElementPresent(verifyprojecname);
        String actElement=verifyprojecname.getText();

		verifyTitlePresent(expected,actElement,verifyprojecname);
			
			
		}
		catch(Exception e) {
			System.out.println("verifyprojecname"+e);
			
		}
	
	}
	
	@FindBy(how=How.XPATH,using="//div[@data-test-id='project-billing-method']")
	WebElement verifyprojecbillingmethod;
	public void verifyProjecBillingMethod(String expected) {
		
		try {
			scrollDown(verifyprojecbillingmethod);
		verifyElementPresent(verifyprojecbillingmethod);
        String actElement=verifyprojecbillingmethod.getText();

		verifyTitlePresent(expected,actElement,verifyprojecbillingmethod);
			
			
		}
		catch(Exception e) {
			System.out.println("verifyprojecbillingmethod "+e);
			
		}
	
	}
	
}
