package org.mumz.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;
	@Before
	public void beforeBackground() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SATHISH\\eclipse-workspace\\Mumzwrold\\src\\test\\resources\\lib\\Driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    
	}
   @After
   public void afterscenario() {
	

}


}
