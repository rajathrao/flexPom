package com.flex.pageObjectModel.Pages;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

public class Login {
	private static final Logger logger = Logger.getLogger(Login.class.getName());
	
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver =driver;
		
	}
	
	// using Findby to locate elements 
	
	
	@FindBy(id = "path-1")
	WebElement loginLink;
	
	@FindBy(xpath = "//button[contains(text(), 'Sign In')]")
	WebElement signInbutton;
	
	@FindBy(xpath = "//input[@type='email']")
	public WebElement emailID;
	
	
	@FindBy(xpath = "//input[@type='password']")
	public WebElement passCode;
	
	
	@FindBy(xpath = "//*[contains(text(), 'Sign In')]")
	WebElement signIn2;
	
			
	//input[@type='email']
	//input[@type='password']
	//button[@class='Account_desktopButton_c7YuN']
	
	
	
	public void clickOnLogin() {
		loginLink.click();
	}
	
	public void signIn() {
		signInbutton.click();

		
	}
	
	public void signIn2() {
		signIn2.click();

		
	}
	
	
//	public void userDetails(String username, String pass) {
//		//signInbutton.click();
//		emailID.sendKeys(username);
//		passCode.sendKeys(pass);
//	}
//	
	// some form of data driven 

	

}
