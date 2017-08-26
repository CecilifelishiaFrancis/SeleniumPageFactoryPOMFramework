package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditLeadPage extends AbstractPage {
	
	@FindBy(how=How.XPATH, using="//*[@id='updateLeadForm_companyName']")
	WebElement changecompanyname;
	
	@FindBy(how=How.XPATH, using="//input[@name='submitButton']")
	WebElement clickupdatebutton;
	
	@FindBy(how=How.XPATH, using="//*[@id='viewLead_companyName_sp']")
	WebElement verifycompanytext;
	
	public EditLeadPage(){
		PageFactory.initElements(eventDriver, this);
	}
	
	public EditLeadPage changeCompanyName(String companyname){
		type(changecompanyname, companyname);
		return new EditLeadPage();
	}
	
	public ViewLeadPage clickUpdateButton(){
		click(clickupdatebutton);
		return new ViewLeadPage();
	}
	
	public ViewLeadPage verifyCompanyText(){
		verifyText(verifycompanytext, "CTS (14898)");
		return new ViewLeadPage();
	}

}
