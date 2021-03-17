package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.utility.Log;
 

public class TC504 
{
	@Test
	public void login() throws Exception
	{
		DOMConfigurator.configure("log4j.xml");
		
		Log.info("*******started execution 8 to 9 Batch***********");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Softwares  One Drive\\Chrome Driver - 89.0.4389\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		Log.info("Application Opened Successfully  8 to 9 Batch");
		
		
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		driver.findElement (By.linkText ("Logout"));
		
		
		driver.close();
		Log.info("Application close successfully  8 to 9 Batch");
		Log.info("*******End execution  8 to 9 Batch***********");
		
	}
}

