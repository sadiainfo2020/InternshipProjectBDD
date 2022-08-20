package step_defination;

import org.junit.Assert;

import base.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageFactory.QAEngineeringPage;

public class QAEngineerTestStep extends MainClass{
	
	QAEngineeringPage qa = new QAEngineeringPage();
	
	
	@Given("user lands on QA Engineering application page")
	public void user_lands_on_qa_engineering_application_page() {
	Assert.assertEquals(driver.getTitle(), prop.getProperty("ExpectedQAEngineeringPageTitle")); 
	}
	
	@Then("user write {string} and {string}")
	public void user_write_firstname_and_lastname(String firstname, String lastname) {
    qa.Firstname(firstname);
    qa.Lastname(lastname);
	}
	
	@And("user write {string} and {string}")
	public void user_write_email_and_phone(String email, String phone) {
	qa.Email(email);
	qa.Phone(phone);
	}
	
	@Then("user select {string}")
	public void user_select_state(String state) {
	qa.State(state);
	}
	
	@And("User can click submit button")
	public void user_can_click_submit_button() {
	qa.Clicksubmit();
	}



}
