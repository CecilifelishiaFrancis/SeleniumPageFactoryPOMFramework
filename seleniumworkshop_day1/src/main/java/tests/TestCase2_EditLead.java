package tests;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper.TestngAnnoataionClass;

public class TestCase2_EditLead extends TestngAnnoataionClass{

	@Test
	public void login(){
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName()
		.clickFindLLeads()
		.clickFirstResult()
		.clickEditButton()
		.changeCompanyName()
		.clickUpdateButton();
		
		
	}




}
