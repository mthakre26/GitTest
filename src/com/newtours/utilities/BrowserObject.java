package com.newtours.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserObject {

	static WebDriver driver;
	public static WebDriver get(String browserName) throws Exception{
	
	if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1038750\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}else if(browserName.equals("ie")){
		System.setProperty("webdriver.ie.driver", "C:\\Users\\M1038750\\Downloads\\internetexplorer_win32\\internetexplorer.exe");
		driver = new ChromeDriver();
	}else if(browserName.equals("firefox")){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\M1038750\\Downloads\\firefox_win32\\firefox.exe");
		driver = new ChromeDriver();
	}else {
		throw new Exception("Invalid browser name: " + browserName);
	}
	return driver;
	
}
}