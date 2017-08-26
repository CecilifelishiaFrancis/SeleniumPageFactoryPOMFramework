package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewLeadPage extends AbstractPage {
	
	@FindBy(how=How.LINK_TEXT, using="Edit")
	WebElement clickeditbutton;
	
	@FindBy(how=How.XPATH, using="//span[contains(@id,'viewLead_companyName_sp')]")
	WebElement capturecompanyname;
	
	@FindBy(how=How.LINK_TEXT, using="Delete")
	WebElement clickdeletebutton;
	
	@FindBy(how=How.XPATH, using=" (//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	WebElement capturefirstleadid;
	
	@FindBy(how=How.NAME, using="id")
	WebElement enterleadid;
	
	public ViewLeadPage(){
	  PageFactory.initElements(eventDriver, this);
	}
	
	public EditLeadPage clickEditButton(){
		click(clickeditbutton);
		return new EditLeadPage();
	}
	
	public void verifyTitlePPage(){
		verifyTitle("View Lead | opentaps CRM");
	}
	
	public ViewLeadPage captureCompanyName(){
		System.out.println(getText(capturecompanyname));
		return new ViewLeadPage();
		
	}
	
	public MyLeadsPage clickDelete(){
		   click(clickdeletebutton);
		return new MyLeadsPage();
	   }
	
	public FindLeadsPage enterLeadId(){
		   boolean leadid1= getText(capturefirstleadid);
		   type(enterleadid, "leadid1");
		return new FindLeadsPage();
		}

}
