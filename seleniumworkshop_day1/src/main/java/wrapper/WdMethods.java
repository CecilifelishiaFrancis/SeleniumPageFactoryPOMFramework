package wrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class WdMethods extends ImplementListers {
	public WebDriver driver;
	public static EventFiringWebDriver eventDriver;
	
	
	
	public WebElement LocateElement(String how, String using){
		WebElement ele = null;
		switch(how){
		
		case("id"):
			ele=eventDriver.findElement(By.id(using));
		    break;
		
		case("name"):
			ele=eventDriver.findElement(By.name(using));
		break;
		
		case("classname"):
			ele=eventDriver.findElement(By.className(using));
		    break;
		    
		case("linktext"):
			ele=eventDriver.findElement(By.linkText(using));
		    break;
		    
		case("partiallinktext"):
			ele=eventDriver.findElement(By.partialLinkText(using));
		    break;
		    
		case("tagname"):
			ele=eventDriver.findElement(By.tagName(using));
		    break;
		    
		case("xpath"):
			ele=eventDriver.findElement(By.xpath(using));
		    break;
		    
		case("cssselector"):
			ele=eventDriver.findElement(By.cssSelector(using));
		    break;
		    
		case("type"):
			ele=eventDriver.findElement(By.xpath("//*[@type='"+using+"']"));
		    break;  
		    
		case("ng-relect-name"):
			ele=eventDriver.findElement(By.xpath("//*[@ng-relect-name='"+using+"']"));
		    break; 
		    
		    default:
		    	System.out.println("The given locator" +how+"is not correct");
		    
		}
		return ele;
		
	}
	
     public void invlokeApp(String url, String browsertype){
		
		switch(browsertype){
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\feli\\seleniumworkshop_day1\\seleniumworkshop_day1\\driver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        
	        break;
	        
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\feli\\seleniumworkshop_day1\\seleniumworkshop_day1\\driver\\geckodriver.exe");
	        driver = new FirefoxDriver();
	        break;
	        
		case "ie":
			System.setProperty("webdriver.ie.driver", "C:\\feli\\seleniumworkshop_day1\\seleniumworkshop_day1\\driver\\geckodriver.exe");
	        driver = new InternetExplorerDriver();
	        break;
	      }
		eventDriver = new EventFiringWebDriver(driver);
		ImplementListers handler = new ImplementListers();
		eventDriver.register(handler);
		eventDriver.get(url);
		eventDriver.manage().window().maximize();
		eventDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public void type(WebElement ele, String value){
		ele.sendKeys(value);
	}
	
	public void click(WebElement ele){
		ele.click();
	}
	
	public void clear(WebElement ele){
		ele.clear();
	}
	
	public void ddSelectByVisibleText(WebElement ele, String ddtext){
		Select ddvistext = new Select(ele);
		ddvistext.selectByVisibleText(ddtext);
	}
	
	public void ddSelectByIndex(WebElement ele, int indexvalue){
		Select ddindex = new Select(ele);
		ddindex.selectByIndex(indexvalue);
	}
	
	public void ddSelectByValue(WebElement ele, String ddvalue){
		Select ddval = new Select(ele);
		ddval.selectByValue(ddvalue);
	}
	
	public void switchToWindow(int index){
		Set<String> allWindowHandles = eventDriver.getWindowHandles();
		List<String> allWindows = new ArrayList<>();
		allWindows.addAll(allWindowHandles);
		eventDriver.switchTo().window(allWindows.get(index));
	}
	
	public void acceptAlert(){
		eventDriver.switchTo().alert().accept();
	}
	
	public void alertDismiss(){
		eventDriver.switchTo().alert().dismiss();
	}
	
	public void alertText(String altext){
		eventDriver.switchTo().alert().sendKeys(altext);
	}
	
	public String getAlertText(){
		String ale = eventDriver.switchTo().alert().getText();
		return ale;
		
	}
	
	public void switchFrame(WebElement frameid){
		eventDriver.switchTo().frame(frameid);
	}
	
	public boolean verifyTitle(String text){
		String ele = eventDriver.getTitle();
		if(text.contains(ele)){
			System.out.println("Matches");
			return true;
		}else{
			System.out.println("Not matches");
			return false;
		}
		
		
	}
	
	public void getAttribute(WebElement ele, String getatttext){
		ele.getAttribute(getatttext);
		}
	
	public void getText(WebElement ele){
		ele.getText();
	}
	
	public boolean verifyText(WebElement ele, String filedtext){
		String comptext = ele.getText();
		if(filedtext.contains(comptext)){
			System.out.println("True");
			return true;
		}else{
			System.out.println("False");
			return false;
		}
		
		
	}
	
	public void takeSnap(){
		
	}
	
	public void quitApp(){
		eventDriver.close();
	}
	

}
