package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wrapper.TestngAnnoataionClass;

public class HomePage extends AbstractPage {
	
	@FindBy(how=How.XPATH, using="//*[@id='label']/a")
	WebElement clickcrmsfalink;
	
	public HomePage(){
	    PageFactory.initElements(eventDriver, this);
	}
	
	public MyHomePage clickCrmsfa(){
		click(clickcrmsfalink);
		return new MyHomePage();
	}

}
