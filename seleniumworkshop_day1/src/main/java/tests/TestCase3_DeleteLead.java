package tests;

import org.testng.annotations.Test;

import pages.AbstractPage;
import pages.LoginPage;
import wrapper.TestngAnnoataionClass;

public class TestCase3_DeleteLead extends TestngAnnoataionClass {
	
	@Test
	
	public void deleteLead(){
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeads()
		.clickPhone()
		.enterPhoneNum()
		.clickFindLeadBButton()
		.captureFirstLeadId()
		.clickFirstLeadId()
		.clickDelete();
		//clickFindLeads()
		
		
		
	
	}

}
