package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyLeadsPage extends AbstractPage{
	
	@FindBy(how=How.LINK_TEXT, using="Find Leads")
	WebElement clickfindleadsbutton;
	
	public MyLeadsPage(){
		PageFactory.initElements(eventDriver, this);
	}
	
	public FindLeadsPage clickFindLeads(){
		click(clickfindleadsbutton);
		return new FindLeadsPage();
	}
	
	

}
