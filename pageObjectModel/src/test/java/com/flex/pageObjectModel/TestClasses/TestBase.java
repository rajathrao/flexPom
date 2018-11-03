package com.flex.pageObjectModel.TestClasses;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class TestBase {
	//public static WebDriver driver = null;
	
	WebDriver driver;
	
	@BeforeTest
	public void intialzeThis( ) throws IOException {
		
		//log4j
		// aftertest you have to delete the cookies 
		
		//  =soft asseert and assert to verify the title of the fox home page 
		// assert and deliverately fail the test case 
		
		// print this assertion failed but i am in the next line 
		
		
		System.out.println("Hi you are in the before test");
		Properties prop = new Properties();
		//initiated properties class 
		
		FileInputStream fis = new FileInputStream("C:\\Users\\rajath\\eclipse-workspace\\pageObjectModel\\src\\test\\java\\Resources\\dataProvider.properties");
		prop.load(fis);
		String browserName=prop.getProperty("webBrowser");
		String urlName=prop.getProperty("URL");
		int waitTime = Integer.parseInt(prop.getProperty("implicitWaitTime"));
		
		if(browserName.contains("chromeG")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajath\\Desktop\\Selenium_Sep_Batch\\chromedriver.exe");
   		    driver = new ChromeDriver();
//
             driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);

                 driver.get(urlName);
                 
		}
		
				
		
	}
	
	@AfterTest 
	public void closeThis( ) throws IOException {
		
		driver.quit();
	
	}
	
}
	
//	 WebDriver driver;
//	 @BeforeTest
//	 public void initialize() throws IOException{
//		 
//		 //Chrome
//		 //firefox
//		 //IE 
//		 Properties prop = new Properties();
//		 //
//		 //InputStream inputStream = getClass().getClassLoader().getResourceAsStream(name)
//		 
//		 FileInputStream input = new FileInputStream("C:\\Users\\rajath\\eclipse-workspace\\pageObjectModel\\src\\test\\java\\Resources\\dataProvider.properties");
//		 
//		// final Properties prop = new Properties();
//		// prop.load(new FileInputStream("C:\\Users\\rajath\\eclipse-workspace\\pageObjectModel\\src\\test\\java\\Resources\\dataProvider.properties"));
//		 
//		 prop.load(input);
//		 String browserName = prop.getProperty("browser");
//		 String URL = prop.getProperty("URL");
//		 
//		 if(browserName.equals("chrome")) {
//			 
//			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajath\\Desktop\\Selenium_Sep_Batch\\chromedriver.exe");
//			  driver = new ChromeDriver();
//
//		         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		//To open facebook
//		         driver.get(URL);
//			 
//		
//		 }
//		 
//	
//	 
//		
//		//return driver;
//	 
//	 }
//	 
//
//
//	}


