package com.tests;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class AppTest{
	
	@Test
	public void testLogin() {
		
		
		System.setProperty("webdriver.gecko.driver","D:\\MercuryFlight\\resources\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.quit();		
		
		
	}
	
}
