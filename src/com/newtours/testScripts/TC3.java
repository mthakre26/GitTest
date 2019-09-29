package com.newtours.testScripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newtours.objectRepo.ObjectRepository;
import com.newtours.pageObjects.FlightSearch;
import com.newtours.pageObjects.Login;
import com.newtours.utilities.BrowserObject;
import com.newtours.utilities.Excel;

public class TC3 {

		static WebDriver browser;
		
		@BeforeClass
		public void setUp() throws Exception {
			
			System.out.println("Bfore method execution");
			browser= BrowserObject.get(ObjectRepository.browser);
		}
	     
		@AfterClass
	    public void cleanUp() {
			
			System.out.println("After method execution");
			browser.quit();
		}
		
	   @Test(priority=1)
	   public void login() throws Exception {
		  
		browser.get(ObjectRepository.url);
	    //Login.enterUsername(browser,"batman");
		//Login.enterPassword(browser, "batman");
		ArrayList<String> list = Excel.getRowData("Sheet2", 0);
		Login.enterUsername(browser,list.get(0));
		Login.enterPassword(browser,list.get(1));
		Login.clickLogin(browser);
	    Assert.assertEquals(browser.getTitle(),"Find a Flight: Mercury Tours:");
	  }

	  @Test(priority=2)
	  public void flightSeaching() throws Exception {
		  
		 ArrayList<String> list = Excel.getRowData(ObjectRepository.sheet2,ObjectRepository.rowone);
		 FlightSearch.selectTripType(browser, list.get(0));
	     FlightSearch.selectPassenger(browser, list.get(1));
	  }
	  
	  
}
