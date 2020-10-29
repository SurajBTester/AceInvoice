package com.aceinvoice.pompages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aceinvoice.generic.BasePage;


public class ClientDetails extends BasePage{

	WebDriver driver;
	public ClientDetails(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(how=How.XPATH,using="//input[@name='client[name]']")
	WebElement clientname;
	public void clientName(String un) {
		try {
			verifyElementPresent(clientname);
			
			
			
			clientname.sendKeys(un);
			
			
		}
		catch(NoSuchElementException e) {
			System.out.println("clientname "+e);
			
		}
	
	}
	
	@FindBy(how=How.XPATH,using="//table//td//a")
	WebElement clickclientname;
	public void clickClientName() {
		
		try {
		

			verifyElementClickable(clickclientname);
			
			clickclientname.click();
			
		}
		catch(Exception e) {
			System.out.println("clickclientname"+e);
			
		}
	
	}
	
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Clients')]")
	WebElement clickclientsMenu;
	public void clickClientsMenu() {
		
		try {
		

			verifyElementClickable(clickclientsMenu);
			
			clickclientsMenu.click();
			
		}
		catch(Exception e) {
			System.out.println("clickclientsMenu"+e);
			
		}
	
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='client[secondary_name]']")
	WebElement entersecondaryname;
	public void enterSecondaryName(String un) {
		try {
			verifyElementPresent(entersecondaryname);
		
			entersecondaryname.sendKeys(un);
			
			
		}
		catch(NoSuchElementException e) {
			System.out.println("entersecondaryname"+e);
			
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
	
	
	@FindBy(how=How.XPATH,using="//input[@name='client[address_attributes][address_line_1]']")
	WebElement enteraddress1;
	public void enterAddress1(String ln) {
		
		try {
		
            verifyElementPresent(enteraddress1);
			
            enteraddress1.sendKeys(ln);
		}
		catch(Exception e) {
			System.out.println("enteraddress1"+e);
			
		}
	
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='client[address_attributes][address_line_2]']")
	WebElement enteraddress2;
	public void enterAddress2(String ln) {
		
		try {
		
            verifyElementPresent(enteraddress2);
			
            enteraddress2.sendKeys(ln);
		}
		catch(Exception e) {
			System.out.println("enteraddress2"+e);
			
		}
	
	}


	@FindBy(how=How.XPATH,using="//input[@name='client[address_attributes][city]']")
	WebElement enterclientcity;
	public void enterClientCity(String ln) {
		
		try {
		
            verifyElementPresent(enterclientcity);
			
            enterclientcity.sendKeys(ln);
		}
		catch(Exception e) {
			System.out.println("enterclientcity"+e);
			
		}
	
	}
	
	
	///////////
	
	
	@FindBy(how=How.XPATH,using="//input[@name='client[address_attributes][state]']")
	WebElement enterclientstate;
	public void enterClientState(String ln) {
		
		try {
		
            verifyElementPresent(enterclientstate);
			
            enterclientstate.sendKeys(ln);
		}
		catch(Exception e) {
			System.out.println("enterclientstate"+e);
			
		}
	
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='client[address_attributes][country]']")
	WebElement enterclientcountry;
	public void enterClientCountry(String ln) {
		
		try {
		
            verifyElementPresent(enterclientcountry);
			
            enterclientcountry.sendKeys(ln);
		}
		catch(Exception e) {
			System.out.println("enterclientcountry"+e);
			
		}
	
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@name='client[address_attributes][zip_code]']")
	WebElement enterclientzipcode;
	public void enterClientZip_Code(String ln) {
		
		try {
		
            verifyElementPresent(enterclientzipcode);
			
            enterclientzipcode.sendKeys(ln);
		}
		catch(Exception e) {
			System.out.println("enterclientzipcode"+e);
			
		}
	
	}
	
	
	
	
	@FindBy(how=How.XPATH,using="//select[@data-test-id='client-due-terms']")
	WebElement choosedueterms;
	public Select chooseDue_Terms() {
		
		try {
		
            verifyElementPresent(enterclientzipcode);
			
          
		}
		catch(Exception e) {
			System.out.println("enterclientzipcode"+e);
			
		}
		return new Select(choosedueterms);
	
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
	
	@FindBy(how=How.XPATH,using="//button[contains(.,'Continue')]")
	WebElement clickcontinuebutton;
	public void clickContinueButton() {
		
		try {
		scrollDown(clickcontinuebutton);
			verifyElementClickable(clickcontinuebutton);
			
			clickcontinuebutton.click();
		
		}
		catch(Exception e) {
			System.out.println("clickcontinuebutton"+e);
			
		}
	
	}
	
	
	@FindBy(how=How.XPATH,using="//h4[contains(text(),\"Congratulations, you're all set!\")]")
	WebElement verifycongratulationmessage;
	public void verifyCongratulationMessage(String expected) {
		
		try {
		verifyElementPresent(verifycongratulationmessage);
        String actElement=verifycongratulationmessage.getText();

		verifyTitlePresent(expected,actElement,verifycongratulationmessage);
			
			
		}
		catch(Exception e) {
			System.out.println("verifycongratulationmessage"+e);
			
		}
	
	}
	
	
	
	
	@FindBy(how=How.XPATH,using="//p[contains(.,'You have successfully set up your profile, now start')]")
	WebElement verifysuccessmessage;
	public void verifySuccessMessage(String expected) {
		
		try {
		verifyElementPresent(verifysuccessmessage);
        String actElement=verifysuccessmessage.getText();
       
	if(expected.equalsIgnoreCase(actElement)) {
		
		System.out.println("Success message is Verified with actual");
	}
	else {
		
		
		System.out.println("Success message is not Verified with actual");
	}
			
			
		}
		catch(Exception e) {
			System.out.println("verifysuccessmessage"+e);
			
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
