package com.tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
	Logger log = Logger.getLogger(LoginTest.class);
	
	
	@BeforeMethod
	public void setup(){
		log.info("****************************** Starting test cases execution  *****************************************");

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");	
		driver = new ChromeDriver(); 
		log.info("launching chrome broswer");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		log.info("entering application URL");
		log.warn("Hey this just a warning message");
		log.fatal("hey this is just fatal error message");
		log.debug("this is debug message");
	}
	
	
	@Test(priority=1)
	public void freeCrmTitleTest(){
		log.info("****************************** Lanunch google *****************************************");
		log.info("****************************** GoogleTest *****************************************");
		//String title = driver.getTitle();
		//System.out.println(title);
		log.info("login page title is--->");
		//Assert.assertEquals(title,"#1 Free CRM for Any Business: Online Customer Relationship Software");
		
		log.info("****************************** ending google test case *****************************************");
		log.info("****************************** googleTest *****************************************");

	}
	
	
	
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
		log.info("****************************** Browser is closed *****************************************");

		
	}
	
	

}
