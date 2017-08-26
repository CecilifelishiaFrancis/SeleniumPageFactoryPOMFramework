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
	
	public LoginPage enterUserName(String username){
		type(uName, username);
		return this;
	}
	
	public LoginPage enterPassword(String password){
		type(passWord, password);
		return this;
	}
	
	public HomePage clickLogin(){
		click(clickLoginBtn);
		return new HomePage();
	}
	
	

}
