package com.newtours.testScripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newtours.objectRepo.ObjectRepository;
import com.newtours.pageObjects.Login;
import com.newtours.utilities.BrowserObject;
import com.newtours.utilities.Excel;

public class TC001 {
	static WebDriver browser;
	
	@BeforeMethod
	public void setUp() throws Exception {
		
		System.out.println("Bfore method execution");
		browser= BrowserObject.get(ObjectRepository.browser);
	}
 
	@AfterMethod 
    public void cleanUp() {
		
		System.out.println("After method execution");
		browser.quit();
	}
	
  @Test
  public void login() throws Exception {
	  
	browser.get(ObjectRepository.url);
    //Login.enterUsername(browser,"batman");
	//Login.enterPassword(browser, "batman");
	ArrayList<String> list = Excel.getRowData("Sheet2", 1);
	Login.enterUsername(browser,list.get(0));
	Login.enterPassword(browser,list.get(1));
	Login.clickLogin(browser);
    Assert.assertEquals(browser.getTitle(),"Find a Flight: Mercury Tours:");
  }
  
  @Test
  public void invalidlogin() throws Exception {
	  
	browser.get(ObjectRepository.url);
    //Login.enterUsername(browser,"batman");
	//Login.enterPassword(browser, "batmajkhfsfn");
	ArrayList<String> list = Excel.getRowData("Sheet2", 1);
	Login.enterUsername(browser,list.get(0));
	Login.enterPassword(browser,list.get(1));
	Login.clickLogin(browser);
    Assert.assertEquals(browser.getTitle(),"Sign-On: Mercury Tour ");
}
  
}