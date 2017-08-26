package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyHomePage extends AbstractPage{
	
	@FindBy(how=How.LINK_TEXT, using="Leads")
	WebElement clickleadslink;
	
	@FindBy(how=How.LINK_TEXT, using="Create Lead")
	WebElement clickcreatelead;
	
	public MyHomePage(){
		PageFactory.initElements(eventDriver, this);
	}
	
	public MyLeadsPage clickLeads(){
		click(clickleadslink);
		return new MyLeadsPage();
	}
	
	public CreateLeadPage clickCreateLead(){
		click(clickcreatelead);
		return new CreateLeadPage();
	}

}
