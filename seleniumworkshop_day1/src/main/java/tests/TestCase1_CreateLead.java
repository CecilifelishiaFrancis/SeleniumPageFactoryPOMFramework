package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.ExcelDp;
import pages.LoginPage;
import wrapper.TestngAnnoataionClass;

public class TestCase1_CreateLead extends TestngAnnoataionClass{
	
	@BeforeClass
	public void setValues(){
		dataSheetName="TC001";
	}
	
	
	@Test(dataProvider="fetchdata") 

	public void createLead(String username, String password, 
			String companynamee, String firstname, String lastname, 
			String sourcedropdown, String campaindropdown, 
			String phonenum, String emailid ){
		
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickCrmsfa()
		.clickCreateLead()
		.enterCompanyName(companynamee)
		.enterfirstName(firstname)
		.enterlastname(lastname)
		.selectSourceDropDown(sourcedropdown)
		.selectCampainDropDown(campaindropdown)
		.enterPhoneNumber(phonenum)
		.enterEmailId(emailid)
		.clickCreateLeadButton()
		.captureCompanyName();
			
	}
	
	
	

}
