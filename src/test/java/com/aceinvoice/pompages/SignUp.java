package com.aceinvoice.pompages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aceinvoice.generic.BasePage;


public class SignUp extends BasePage{

	WebDriver driver;
	public SignUp(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Email Address']")
	WebElement emailaddress;
	public void emailAddress(String un) {
		try {
			verifyElementPresent(emailaddress);
			
			
			
			emailaddress.sendKeys(un);
			
			
		}
		catch(NoSuchElementException e) {
			System.out.println("emailaddress"+e);
			
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
	
	@FindBy(how=How.XPATH,using="//a[.=\"Don't have an account? Sign Up\"]")
	WebElement clickSignup;
	public void click_Signup() {
		
		try {
	scrollDown(clickSignup);
			verifyElementClickable(clickSignup);
			
			clickSignup.click();
			
		}
		catch(Exception e) {
			System.out.println("btnlogin"+e);
			
		}
	
	}
	


	
	@FindBy(how=How.XPATH,using="//input[@value='Get Started']")
	WebElement clickgetstarted;
	public void clickGetstarted() {
		
		try {
		

			verifyElementClickable(clickgetstarted);
			
			clickgetstarted.click();
	
		}
		catch(Exception e) {
			System.out.println("clickgetstarted"+e);
			
		}
	
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@value='Continue']")
	WebElement clickcontinue;
	public void clickContinue() {
		
		try {
		

			verifyElementClickable(clickcontinue);
			
			clickcontinue.click();
			
		}
		catch(Exception e) {
			System.out.println("clickcontinue"+e);
			
		}
	
	}
	
	
	@FindBy(how=How.XPATH,using="//h1[contains(text(),'Basic details')]")
	WebElement verifytitle;
	public void verifyTitle() {
		
		try {
		
        String actElement=verifytitle.getText();

		verifyTitlePresent("Basic details",actElement,verifytitle);
			
			
		}
		catch(Exception e) {
			System.out.println("clickcontinue"+e);
			
		}
	
	}
}
