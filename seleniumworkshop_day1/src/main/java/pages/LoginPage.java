package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {
	
	
	@FindBy(how=How.ID, using="username")
	WebElement uName;
	
	@FindBy(how=How.ID, using="password")
	WebElement passWord;
	
	@FindBy(how=How.XPATH, using="//*[@id='login']/p[3]/input")
	WebElement clickLoginBtn;
	
	public LoginPage(){
		PageFactory.initElements(eventDriver, this);
	}
	
	public LoginPage enterUserName(){
		type(uName, "DemoSalesManager");
		return this;
	}
	
	public LoginPage enterPassword(){
		type(passWord, "crmsfa");
		return this;
	}
	
	public HomePage clickLogin(){
		click(clickLoginBtn);
		return new HomePage();
	}
	
	

}
