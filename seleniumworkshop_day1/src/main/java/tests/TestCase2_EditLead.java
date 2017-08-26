package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.ExcelDp;
import pages.LoginPage;
import wrapper.TestngAnnoataionClass;

public class TestCase2_EditLead extends TestngAnnoataionClass{
	
	@BeforeClass
	public void setValues(){
		dataSheetName="TC002";
	}

	@Test(dataProvider="fetchdata")
	
	public void login(String username, String password, String enterfirname, String companyname){
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName(enterfirname)
		.clickFindLLeads()
		.clickFirstResult()
		.clickEditButton()
		.changeCompanyName(companyname)
		.clickUpdateButton();
		}
	
	
			




}
