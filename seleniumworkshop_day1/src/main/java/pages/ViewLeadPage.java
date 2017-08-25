package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewLeadPage extends AbstractPage {
	
	@FindBy(how=How.LINK_TEXT, using="Edit")
	WebElement clickeditbutton;
	
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

}
