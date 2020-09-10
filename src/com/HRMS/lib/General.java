package com.HRMS.lib;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.HRMS.utility.Log;

public class General extends Global {
	//Re usable functions
	
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver","C:/Users/generic1/Desktop/SureshClassWorkspace/Selenium WebDriver Project/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		Log.info("Application Opened");	
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application closed");
		Log.info("Application Closed");
	}
	public void login() {
		driver.findElement(By.name(txt_loginame)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Completed");
		Log.info("Login completed");
			
	}
	public void logout() throws InterruptedException {
		driver.findElement(By.id(link_logout1)).click();
		Thread.sleep(3000);
		driver.findElement (By.linkText (link_logout));
		System.out.println("Logout completed");
		Log.info("Logout Opened");
		
	}
public void addEmp() {
	System.out.println("Adding new emp");
	Log.info("Application new emp");
}
public void delEmp() {
	System.out.println("Delete emp");
	Log.info("Delete emp");
			
}
}
