package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage extends AbstractPage {
	
	@FindBy(how=How.ID, using="createLeadForm_companyName")
	WebElement companyname;
	
	@FindBy(how=How.ID, using="createLeadForm_firstName")
	WebElement enterfirstname;
	
	@FindBy(how=How.ID, using="createLeadForm_lastName")
	WebElement enterlastname;
	
	@FindBy(how=How.ID, using="createLeadForm_dataSourceId")
	WebElement selectsourcedropdown;
	
	@FindBy(how=How.ID, using="createLeadForm_marketingCampaignId")
	WebElement selectcampaindropdown;
	
	@FindBy(how=How.ID, using="createLeadForm_primaryPhoneNumber")
	WebElement enterphonenumber;
	
	@FindBy(how=How.ID, using="createLeadForm_primaryEmail")
	WebElement enteremailid;
	
	@FindBy(how=How.CLASS_NAME, using="smallSubmit")
	WebElement clickcreateleadbutton;
	
	public CreateLeadPage(){
		PageFactory.initElements(eventDriver, this);
	}
	
	public CreateLeadPage enterCompanyName(String companynamee){
		type(companyname, companynamee);
		return new CreateLeadPage();
		}
	
	public CreateLeadPage enterfirstName(String firstname){
		type(enterfirstname, firstname);
		return new CreateLeadPage();
	}
	
	public CreateLeadPage enterlastname(String lastname){
		type(enterlastname, lastname);
		return new CreateLeadPage();
		}
	
	public CreateLeadPage selectSourceDropDown(String sourcedropdown){
		ddSelectByVisibleText(selectsourcedropdown, sourcedropdown);
		return new CreateLeadPage();
	}
	
	public CreateLeadPage selectCampainDropDown(String campaindropdown){
		ddSelectByVisibleText(selectcampaindropdown, campaindropdown);
		return new CreateLeadPage();
	}
	
	public CreateLeadPage enterPhoneNumber(String phonenum){
		type(enterphonenumber, phonenum);
		return new CreateLeadPage();
	}
	
	public CreateLeadPage enterEmailId(String emailid){
		type(enteremailid, emailid);
		return new CreateLeadPage();
	}
	
	public ViewLeadPage clickCreateLeadButton(){
		click(clickcreateleadbutton);
		return new ViewLeadPage();
		
	}

}
