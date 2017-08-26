package wrapper;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.ExcelDp;

public class TestngAnnoataionClass extends WdMethods {
	
	public String dataSheetName;
	/*
	@BeforeSuite

	@BeforeTest
	
	@BeforeGroups*/
	
	@BeforeClass 
	public void setValues(){
		
	}
	
	@DataProvider(name="fetchdata")
	public Object[][] getData(){
		return ExcelDp.getAllSheetData(dataSheetName);
		
	}
	
	@BeforeMethod
	public void browserLaunch(){
		System.out.println("I am browser launch");
		invlokeApp("http://leaftaps.com/opentaps", "chrome"); 
	}
	
	
	
	@AfterMethod
	public void afterMethod(){
		quitApp();
	}
	
    
	@AfterClass
	public void afterClass(){
		
	}
	
	@AfterGroups
	public void afterGroups(){
		
	}
	
	@AfterTest
	public void afterTest(){
		
	}
	
	@AfterSuite
	public void afterSuite(){
		
	}
	
	
	
}
