package com.cg.stepdef;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDef {

	@Given("user is on registration page")
	public void user_is_on_registration_page() {
	  
	}
	@When("user user enters details")
	public void user_user_enters_details(io.cucumber.datatable.DataTable dataTable) {
	    
		Map<String,String> map=dataTable.asMap(String.class, String.class);
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
		System.out.println(map.get("confirmpass"));
		System.out.println(map.get("mob"));
		System.out.println(map.get("comp"));
		
	}
	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	  }
	@Then("user is registerd successfully")
	public void user_is_registerd_successfully() {
	   
	}

	
}
