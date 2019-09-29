package com.newtours.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	public static void enterUsername(WebDriver driver, String value){
	driver.findElement(By.name("userName")).sendKeys(value);
	}

	public static void enterPassword(WebDriver d, String pass){
	d.findElement(By.name("password")).sendKeys(pass);
	}
	
	public static void clickLogin(WebDriver driver){
		driver.findElement(By.name("login")).click();
		}
	
}
