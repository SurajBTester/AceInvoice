package com.aceinvoice.pompages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aceinvoice.generic.BasePage;

public class AddProject extends BasePage{

	
	
	WebDriver driver;
	public AddProject(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	
	
	
	
	@FindBy(how=How.XPATH,using="//a[@title='Time Tracking']")
	WebElement clicktimetracking;
	public void clickTimeTracking() throws Exception {
		try {
			
			scrollDown(clicktimetracking);
			Thread.sleep(2000);
		verifyElementClickable(clicktimetracking);
			
			
			
			clicktimetracking.click();
			
			
		}
		catch(NoSuchElementException e) {
			System.out.println("clicktimetracking"+e);
			
		}
	
	}
	
	
	@FindBy(how=How.XPATH,using="//a[contains(normalize-space(),'click here to add your first project')]")
	WebElement addfirstproject;
	public void addFirstProject() {
		try {
		verifyElementClickable(addfirstproject);
			
			
			
		addfirstproject.click();
			
			
		}
		catch(NoSuchElementException e) {
			System.out.println("addfirstproject"+e);
			
		}
	
	}
	
	
	@FindBy(how=How.XPATH,using="//button[@type='button']")
	WebElement addlogtime;
	public void addLogTime() {
		try {
		verifyElementClickable(addlogtime);
			
			
			
		addlogtime.click();
			
			
		}
		catch(NoSuchElementException e) {
			System.out.println("addlogtime"+e);
			
		}
	
	}
	
	@FindBy(how=How.XPATH,using="//a[@data-test-id='project-add-new']")
	WebElement addnewproject;
	public void addNewProject() {
		try {
		verifyElementClickable(addnewproject);
			
			
			
		addnewproject.click();
			
			
		}
		catch(NoSuchElementException e) {
			System.out.println("addnewproject"+e);
			
		}
	
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@title='Please fill in this field.']")
	WebElement enterprojectname;
	public void enterProjectName(String un) {
		try {
			verifyElementPresent(enterprojectname);
			
			
			
			enterprojectname.sendKeys(un);
			
			
		}
		catch(NoSuchElementException e) {
			System.out.println("enterprojectname"+e);
			
		}
	
	}
	
	
	
	@FindBy(how=How.XPATH,using="//select[@name='billingMethod']")
	WebElement choosebillingmethod;
	public Select chooseBillingMethod() {
		
		try {
		
            verifyElementPresent(choosebillingmethod);
			
          
		}
		catch(Exception e) {
			System.out.println("choosebillingmethod"+e);
			
		}
		return new Select(choosebillingmethod);
	
	}
	
	
	@FindBy(how=How.XPATH,using="//input[contains(@data-test-id,'project-rate')]")
	WebElement enterprojecrate;
	public void addProjectRate(String un) {
		try {
			verifyElementPresent(enterprojecrate);
			
			
			
			enterprojecrate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			enterprojecrate.sendKeys(un);
			
			
		}
		catch(NoSuchElementException e) {
			System.out.println("enterprojecrate"+e);
			
		}
	
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Hours']")
	WebElement enterhours;
	public void enterHours(String un) {
		try {
			
			scrollDown(enterhours);
			verifyElementPresent(enterhours);
			
			
			
		
			enterhours.sendKeys(un);
			
			
		}
		catch(NoSuchElementException e) {
			System.out.println("enterhours"+e);
			
		}
	
	}
	
	@FindBy(how=How.XPATH,using="//textarea[@placeholder='Notes']")
	WebElement enternotes;
	public void enterNotes(String un) {
		try {
			
			scrollDown(enternotes);
			verifyElementPresent(enternotes);
			
			
			
		
			enternotes.sendKeys(un);
			
			
		}
		catch(NoSuchElementException e) {
			System.out.println("enternotes"+e);
			
		}
	
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Submit')]")
	WebElement clicksubmit;
	public void clickSubmitButton() {
		
		try {
			
			scrollDown(clicksubmit);
			Thread.sleep(2000);
			verifyElementClickable(clicksubmit);
			
			clicksubmit.click();
			
		}
		catch(Exception e) {
			System.out.println("clicksubmit"+e);
			
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
	
	
	
	@FindBy(how=How.XPATH,using="//select[contains(@data-test-id,'time-entry-project')]")
	WebElement chooseproject;
	public Select chooseProject() {
		
		try {
		scrollDown(chooseproject);
            verifyElementPresent(chooseproject);
			
          
		}
		catch(Exception e) {
			System.out.println("chooseproject"+e);
			
		}
		return new Select(chooseproject);
	
	}
	
	
	@FindBy(how=How.XPATH,using="//select[@data-test-id='time-entry-task']")
	WebElement chooseTASK;
	public Select chooseTask() {
		
		try {
			scrollDown(chooseTASK);
            verifyElementPresent(chooseTASK);
			
          
		}
		catch(Exception e) {
			System.out.println("chooseTASK"+e);
			
		}
		return new Select(chooseTASK);
	
	}
	
}
