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
	
   public FindLeadsPage(){
	   PageFactory.initElements(eventDriver, this);
   }
   
   public FindLeadsPage enterFirstName(){
	   type(enterfirstname, "Cecili");
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
}
