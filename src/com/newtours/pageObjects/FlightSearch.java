package com.newtours.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightSearch {

	
	public static void selectTripType(WebDriver driver, String trip){
		
		driver.findElement(By.xpath("//input[@value='" + trip + "']")).click();
	}
	public static void selectPassenger(WebDriver driver, String pass){
		
		Select dd= new Select(driver.findElement(By.name("passCount")));
		dd.selectByVisibleText(pass);
	}
	public static void departFrom(WebDriver driver, String city){
		Select dd= new Select(driver.findElement(By.name("fromPort")));
		dd.selectByVisibleText(city);
	}
	public static void onDate(WebDriver driver, String month){
		Select dd= new Select(driver.findElement(By.name("fromMonth")));
		dd.selectByVisibleText(month);
	}
	public static void onDay(WebDriver driver, String day){
		Select dd= new Select(driver.findElement(By.name("fromDay")));
		dd.selectByVisibleText(day);
	}
	public static void toPort(WebDriver driver, String tocity){
		Select dd= new Select(driver.findElement(By.name("toPort")));
		dd.selectByVisibleText(tocity);
	}
	public static void tooDate(WebDriver driver, String tomonth){
		Select dd= new Select(driver.findElement(By.name("toMonth")));
		dd.selectByVisibleText(tomonth);
	}
	public static void tooDay(WebDriver driver, String today){
		Select dd= new Select(driver.findElement(By.name("toDay")));
		dd.selectByVisibleText(today);
	}
	public static void classtotravel(WebDriver driver, String cls){
		driver.findElement(By.xpath(".//input[@value]='" + cls + "']")).click();
	}
	public static void prefRence(WebDriver driver, String pref){
		Select dd= new Select(driver.findElement(By.name("airline")));
		dd.selectByVisibleText(pref);
	}
	public static void findFlights(WebDriver driver){
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
	}
	
}
