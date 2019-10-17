package org.mummz.test;

import org.mumz.test.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public void lanuch(String url) {
		Hook.driver.get(url);
	}
	public static WebElement iddd(WebElement e,String d) {
		Hook.driver.findElement(By.id(d));
		return e;
		

	}
	 public static WebElement xpaaath(WebElement e,String path) {
		Hook.driver.findElement(By.xpath(path));
		return e;
	}
	 
	public static void sendse(WebElement e,String val) {
		e.sendKeys(val);
	}
	public static void btn(WebElement e) {
		e.click();
	}
	
	public static void dropdwn(int a,WebElement e) {
		Select s=new Select(e);
        s.selectByIndex(a);
	}

}
