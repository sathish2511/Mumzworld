package org.mum.test;

import org.mumz.test.Hook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJO {
	public POJO() {
		PageFactory.initElements(Hook.driver, this);
	}


	@FindBy(xpath="//input[@id='search']")
	private WebElement search;
	
	@FindBy(xpath="//span[@class='icon-serach']")
	private WebElement click;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getClick() {
		return click;
	}
	
	
}
