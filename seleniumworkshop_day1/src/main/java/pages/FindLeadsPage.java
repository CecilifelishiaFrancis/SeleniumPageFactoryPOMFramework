package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FindLeadsPage extends AbstractPage {
	
	@FindBy(how=How.XPATH, using="//*[@id='ext-gen248']")
	WebElement enterfirstname;
	
	@FindBy(how=How.LINK_TEXT, using="Find Leads")
	WebElement clickfindlleads;
	
	@FindBy(how=How.XPATH, using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement clickfirstresult;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Phone')]")
	WebElement clickphone;
	
	@FindBy(how=How.NAME, using="phoneNumber")
	WebElement enterphonenum;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Find Leads')]")
	WebElement clickfindleadbutton;
	
	@FindBy(how=How.XPATH, using=" (//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	WebElement capturefirstleadid;
	
	@FindBy(how=How.XPATH, using=" (//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	WebElement clickfirstleadid;
	
	@FindBy(how=How.LINK_TEXT, using="Find Leads")
	WebElement clickfindleadsbutton;
	
	@FindBy(how=How.NAME, using="id")
	WebElement enterleadid;
	
	
	public FindLeadsPage(){
	   PageFactory.initElements(eventDriver, this);
   }
   
   public FindLeadsPage enterFirstName(String editfirname){
	   type(enterfirstname, editfirname);
	return this;
   }
   
   public FindLeadsPage clickFindLLeads(){
	   click(clickfindlleads);
	   return this;
   }
   
   public ViewLeadPage clickFirstResult(){
	   click(clickfirstresult);
	   return new ViewLeadPage();
   }
   
   public FindLeadsPage clickPhone(){
	   click(clickphone);
	return new FindLeadsPage();
	}
   
   public FindLeadsPage enterPhoneNum(){
	   type(enterphonenum, "9840275029");
	return new FindLeadsPage();
   }
   
   public FindLeadsPage clickFindLeadBButton(){
	   click(clickfindleadbutton);
	return new FindLeadsPage();
   }
   
   public FindLeadsPage captureFirstLeadId(){
	   System.out.println(getText(capturefirstleadid));
	return new FindLeadsPage();
   }
   
   public ViewLeadPage clickFirstLeadId(){
	   click(clickfirstleadid);
	return new ViewLeadPage();
	}
   
   
   
   public FindLeadsPage clickFindLeads(){
		click(clickfindleadsbutton);
		return new FindLeadsPage();
	}
   
   
   
   
}
