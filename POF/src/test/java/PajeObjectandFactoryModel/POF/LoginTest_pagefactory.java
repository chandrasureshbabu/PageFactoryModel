package PajeObjectandFactoryModel.POF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest_pagefactory {
	
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				driver.manage().window().maximize();
				
				//creating object for page class
				
				RediffLoginPageFactory rd= new RediffLoginPageFactory(driver);
				
				rd.username().sendKeys("suresh");
				rd.password().sendKeys("password");
				rd.signin().click();
				
				
	}

}
