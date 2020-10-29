package com.aceinvoice.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.aceinvoice.generic.BaseTest;
import com.aceinvoice.pompages.AddProject;
import com.aceinvoice.pompages.BasicDetails;
import com.aceinvoice.pompages.ClientDetails;

import com.aceinvoice.pompages.SignUp;
import com.aceinvoice.pompages.Verification;

public class Assignment extends BaseTest{

	
	
	@Test(priority=1)
	public void testcase() throws Exception {
		
		Verification verification=new Verification(driver);
		SignUp sighup=new SignUp(driver);
		BasicDetails basicdetails =new BasicDetails(driver);
		ClientDetails clientdetails=new ClientDetails(driver);
		AddProject addproject=new AddProject(driver);
		
		 
		sighup.click_Signup();
		sighup.emailAddress(TEAM_EMAIL);
		sighup.clickGetstarted();
		sighup.enterPassword(TEAM_PASSWORD);
		sighup.clickContinue();
	
		
		basicdetails.verifyBasicDetails("Basic details");
		basicdetails.verifySubDetails("Add your details and preferences.");
		basicdetails.enterFirstName(TEAM_FIRSTNAME);
		basicdetails.enterLastName(TEAM_LASTNAME);
		basicdetails.checkTermsAndConditions();
		basicdetails.checkForNotification();
		basicdetails.clickContinue();
		basicdetails.verifyAddCompany("Add your company");
		basicdetails.enterCompanyName(COMPANYNAME);
		basicdetails.clickContinue();
		basicdetails.successToastMessage();
		basicdetails.verifyAddYourFirstClient("Add your first client");
		
		clientdetails.clientName(CLIENT_NAME);
		clientdetails.enterSecondaryName(CLIENT_SECONDARYNAME);
		clientdetails.enterAddress1(CLIENT_ADDRESS1);
		clientdetails.enterAddress2(CLIENT_ADDRESS2);
		clientdetails.enterClientCity(CLIENT_CITY);
		clientdetails.enterClientCountry(CLIENT_COUNTRY);
		clientdetails.enterClientState(CLIENT_STATE);
		clientdetails.enterClientZip_Code(CLIENT_ZIPCODE);
		clientdetails.chooseDue_Terms().selectByVisibleText("+3 days");
		clientdetails.clickContinue();
		
		clientdetails.verifyCongratulationMessage("Congratulations, you're all set!");
		
		clientdetails.clickContinueButton();
		clientdetails.successToastMessage();
		
		verification.verifyTeamName(TEAM_FIRSTNAME+" " +TEAM_LASTNAME);
		verification.verifyTeamEmail(TEAM_EMAIL);
		
		
		clientdetails.clickClientsMenu();
		clientdetails.clickClientName();
		
		
		verification.verifyClientName(CLIENT_NAME);
		verification.verifyClientAddress1(CLIENT_ADDRESS1);
		verification.verifyClientAddress2(CLIENT_ADDRESS2);
		
		verification.verifyClientState(CLIENT_STATE);
		verification.verifyClientCountry(CLIENT_COUNTRY);
		verification.verifyClientCityAndZipcode(CLIENT_CITY+" , "+CLIENT_ZIPCODE);
		
		
		
	//Add Project
		addproject.clickTimeTracking();
		addproject.addFirstProject();
		addproject.addNewProject();
		addproject.enterProjectName(PROJECTNAME);
		addproject.chooseBillingMethod().selectByVisibleText("Hourly project rate");
		addproject.addProjectRate("1000");
		addproject.clickSubmitButton();
		
		verification.verifyProjecName(PROJECTNAME);
		verification.verifyProjecBillingMethod("Hourly Project Rate");
		
	
		addproject.clickTimeTracking();
		addproject.chooseProject().selectByVisibleText(PROJECTNAME);
		addproject.chooseTask().selectByVisibleText("QA");
		addproject.enterHours("10");
		addproject.enterNotes("Dummy note");
		addproject.addLogTime();
		addproject.successToastMessage();
		
		
		
		verification.verifyProjectName(PROJECTNAME);
		verification.verifyProjectHours("10");
		verification.verifyProjectNote("Dummy note");
		verification.verifyProjectTask("QA");
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
