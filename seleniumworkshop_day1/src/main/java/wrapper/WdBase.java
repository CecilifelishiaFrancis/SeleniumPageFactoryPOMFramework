package wrapper;

import org.openqa.selenium.WebElement;

public interface WdBase {
	
	public WebElement LocateElement(String how, String using);
			
		/**
		 * This method will launch the application
		 * and load the url
		 * browser type and url needs to be send as arguments
		 * @author Cecili
		 */
	    public void invlokeApp(String url, String browsertype);
	    
	    /**
	     * This method will switch from one window to another window
	     * Window index needs to be given as an argument
	     * @author Cecili
	     */
		
		public void switchToWindow(int index);
		
		/**
		 * This method will accept an alert
		 * @author Cecili
		 */
		public void acceptAlert();
		
		/**
		 * This method will dismiss an alert
		 * @author Cecili
		 */
		public void alertDismiss();
		
		/**
		 * This method will be called when user sends text to an alert
		 * The input text needs to be given as an argument
		 * @author Cecili
		 * @param altext
		 */
		public void alertText(String altext);
		
		/**
		 * This method will get an alert text
		 * @author Cecili
		 */
		public String getAlertText();
		
		/**
		 * This method will switch from one frame to another frame
		 * frame id needs to be given as an argument
		 * @author Cecili
		 */
		public void switchFrame(WebElement frameid);
		
		/**
		 * This method will verify the page title
		 * page title needs to be given as an argument
		 * @author Cecili
		 */
		public boolean verifyTitle(String text);
		
		public void getAttribute(WebElement ele, String getatttext);
		
		public void getText(WebElement ele);
		
		public boolean verifyText(WebElement ele, String filedtext);
		
	    public void quitApp();
		

	


}
