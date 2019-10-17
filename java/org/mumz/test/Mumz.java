package org.mumz.test;

import java.util.Map;

import org.mum.test.POJO;
import org.mummz.test.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Mumz extends BaseClass{
	POJO l=new POJO();


	@Given("user is in homepage")
	public void user_is_in_homepage() {
		lanuch("https://www.mumzworld.com/");  
	}

	@When("user in search textbox and searching kid Toys")
	public void user_in_search_textbox_and_searching_kid_Toys(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> onemap = dataTable.asMap(String.class,String.class);
	    sendse(l.getSearch(),onemap.get("Product1"));
	    btn(l.getClick()); 
	}

	@Then("user navigate to Toys page")
	public void user_navigate_to_Toys_page() {
		System.out.println("sucess");
	}


}
