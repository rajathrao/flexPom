package com.flex.pageObjectModel.TestClasses;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.flex.pageObjectModel.Pages.Login;

public class TestCases extends TestBase{


		// TODO Auto-generated method stub
		
		 
		 @Test(priority=0)
		 public void init() throws Exception{
			 Login foxLogin  = PageFactory.initElements(driver, Login.class);
			foxLogin.clickOnLogin();
			foxLogin.signIn();
			
			
			 
		 }
		 
		 @Test(priority= 1,dataProvider ="newdata")
		 public void enterUsernamePass(String userName, String pass) throws Exception{
			 
			 Login f  = PageFactory.initElements(driver, Login.class);
			 f.emailID.sendKeys(userName);
			 f.passCode.sendKeys(pass);
			 f.signIn2();
			 
		 }
		 
		 
		 /// exxcel sheet using apache POI 
			@DataProvider(name = "newdata")
			public Object[][] getData() {
			Object[][] data = new Object[1][2];
			data[0][0]= "rajathpanta@gmail.com";
			data[0][1] = "Flexit123";
			
			//data[0][0]= "rajathpant@gmail.com";
			//data[0][1] = "Flexit123";
			
			return data;
					
			}
			

	}


