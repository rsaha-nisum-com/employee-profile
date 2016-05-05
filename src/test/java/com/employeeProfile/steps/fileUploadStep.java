package com.employeeProfile.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fileUploadStep {
	@Given("^Navigate to employee profile home page$")
	public void navigates_to_employee_profile_home_page() {
		System.out.println("Test 'Given' step.");
	}

	@When("^User select employee data$")
	public void select_employee_data() {
		System.out.println("Test 'When' step.");
	}

	@Then("^Click on upload button$")
	public void click_on_upload_button() {
		System.out.println("Test 'Then' step.");
	}

}