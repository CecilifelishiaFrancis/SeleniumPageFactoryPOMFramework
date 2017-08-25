package wrapper;


import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplementListers implements WebDriverEventListener {

	@Override
	public void afterAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		//System.out.println("The element" +arg0 + "is modified"+arg2.toString().substring(beginIndex, endIndex));
		
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("The button/ Link is clicked" +arg0);
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateTo(String driver, WebDriver url) {
		System.out.println("The browser" +driver+"launched with URL" +url);
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		WebDriverWait wait = new WebDriverWait(arg1, 30);
		wait.until(ExpectedConditions.elementToBeClickable(arg0));
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver arg1) {
		if(throwable instanceof NoSuchElementException){
			System.out.println("The element could not be found" +throwable.getMessage());
		}else if(throwable instanceof NoSuchWindowException){
			System.out.println("The window could not be found" +throwable.getMessage());
			//System.out.println(throwable.printStackTrace();
		}else if(throwable instanceof InvalidSelectorException){
			System.out.println("The xpath value is wrong" +throwable.getMessage());
		}else if(throwable instanceof ElementNotVisibleException){
			System.out.println("Thrown to indicate that although an element is present on the DOM, it is not visible, and so is not able to be interacted with.");
		}else if(throwable instanceof NoAlertPresentException){
			System.out.println("Indicates that a user has tried to access an alert when one is not present.");
		}else if(throwable instanceof UnhandledAlertException){
			System.out.println("Unhandled alert exception");
		}else if(throwable instanceof TimeoutException){
			System.out.println("Thrown when a command does not complete in enough time.");
		}throw new RuntimeException();
		
	}

	

}
