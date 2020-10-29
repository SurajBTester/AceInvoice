package com.aceinvoice.pompages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aceinvoice.generic.BasePage;


public class BasicDetails extends BasePage{

	WebDriver driver;
	public BasicDetails(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(how=How.XPATH,using="//input[@name='user[first_name]']")
	WebElement firstname;
	public void enterFirstName(String un) {
		try {
			verifyElementPresent(firstname);
			
			
			
			firstname.sendKeys(un);
			
			
		}
		catch(NoSuchElementException e) {
			System.out.println("firstname"+e);
			
		}
	
	}
	
	@FindBy(how=How.XPATH,using="//input[@type='password']")
	WebElement enterpassword;
	public void enterPassword(String un) {
		try {
			verifyElementPresent(enterpassword);
		
			enterpassword.sendKeys(un);
			
			
		}
		catch(NoSuchElementException e) {
			System.out.println("enterpassword"+e);
			
		}
	
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='user[last_name]']")
	WebElement lastname;
	public void enterLastName(String ln) {
		
		try {
		
            verifyElementPresent(lastname);
			
			lastname.sendKeys(ln);
		}
		catch(Exception e) {
			System.out.println("lastname"+e);
			
		}
	
	}
	


	
	@FindBy(how=How.XPATH,using="//div[@data-test-id='introduction-terms-service-input']")
	WebElement checkterms;
	public void checkTermsAndConditions() {
		
		try {
		

			verifyElementClickable(checkterms);
			
			checkterms.click();
			
		}
		catch(Exception e) {
			System.out.println("clickgetstarted"+e);
			
		}
	
	}
	
	@FindBy(how=How.XPATH,using="//div[@role='alert']")
	WebElement successtoastmessage;
	public void successToastMessage() {
		
		try {
		

		verifyElementPresent(successtoastmessage);
			
			System.out.println("Success message : "+successtoastmessage.getText());
			
		}
		catch(Exception e) {
			System.out.println("successtoastmessage not found :"+e);
			
		}
	
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@data-test-id='introduction-marketing-email-consent-input']")
	WebElement checkfornotification;
	public void checkForNotification() {
		
		try {
		scrollDown(checkfornotification);
			verifyElementClickable(checkfornotification);
			
			checkfornotification.click();
			
		}
		catch(Exception e) {
			System.out.println("checkfornotification"+e);
			
		}
	
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@value='Continue']")
	WebElement clickcontinue;
	public void clickContinue() {
		
		try {
		scrollDown(clickcontinue);
			verifyElementClickable(clickcontinue);
			
			clickcontinue.click();
		
		}
		catch(Exception e) {
			System.out.println("clickcontinue"+e);
			
		}
	
	}
	
	
	
	@FindBy(how=How.XPATH,using="//h1[contains(text(),'Basic details')]")
	WebElement verifytitle;
	public void verifyBasicDetails(String expected) {
		
		try {
		verifyElementPresent(verifytitle);
        String actElement=verifytitle.getText();
    
		verifyTitlePresent(expected,actElement,verifytitle);
			
			
		}
		catch(Exception e) {
			System.out.println("clickcontinue"+e);
			
		}
	
	}
	
	
	
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Add your details and preferences.')]")
	WebElement verifyAddDetails;
	public void verifySubDetails(String expected) {
		
		try {
		
         String actElement=verifyAddDetails.getText();
       
		verifyTitlePresent(expected,actElement,verifyAddDetails);
			
			
		}
		catch(Exception e) {
			System.out.println("clickcontinue"+e);
			
		}
	
	}
	
	
	@FindBy(how=How.XPATH,using="//h1[contains(.,'Add your company')]")
	WebElement verifyaddcompany;
	public void verifyAddCompany(String expected) {
		
		try {
		verifyElementPresent(verifyaddcompany);
        String actElement=verifyaddcompany.getText();
      
		verifyTitlePresent(expected,actElement,verifyaddcompany);
			
			
		}
		catch(Exception e) {
			System.out.println("verifyAddCompany"+e);
			
		}
	
	}
	
	@FindBy(how=How.XPATH,using="//input[@title='Please fill in this field.']")
	WebElement companyname;
	public void enterCompanyName(String ln) {
		
		try {
		
            verifyElementPresent(companyname);
			
            companyname.sendKeys(ln);
		}
		catch(Exception e) {
			System.out.println("companyname"+e);
			
		}
	
	}
	
	@FindBy(how=How.XPATH,using="//h4[.=' Add your first client ']")
	WebElement verifyaddfirstclient;
	public void verifyAddYourFirstClient(String expected) {
		
		try {
		verifyElementPresent(verifyaddfirstclient);
        String actElement=verifyaddfirstclient.getText();

		verifyTitlePresent(expected,actElement,verifyaddfirstclient);
			
			
		}
		catch(Exception e) {
			System.out.println("verifyaddfirstclient"+e);
			
		}
	
	}
	
}
