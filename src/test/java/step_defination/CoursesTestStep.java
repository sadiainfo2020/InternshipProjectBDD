package step_defination;

import org.testng.Assert;

import base.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.ApplicationPage;
import pageFactory.CoursesPage;

public class CoursesTestStep extends MainClass{
	
	
	CoursesPage cp = new CoursesPage();
	ApplicationPage ap = new ApplicationPage();
	
	@Given("user launch the browser")
    public void user_launch_the_browser(){
    Assert.assertEquals(cp.captureCoursesPageTitle(), prop.getProperty("ExpectedCoursesPageTitle")); 
    
    }

    @When("user lands on the home page")
    public void user_lands_on_the_home_page(){
    Assert.assertEquals(cp.captureCoursesPageUrl(), prop.getProperty("Expectedcoursespageurl") ); 
   
    }

    @Then("user clicks on courses feature")
    public void user_clicks_on_courses_feature(){
    cp.clickCoursesBtn();   
    }
    @And("clicks on dropdown arrow")
    public void clicks_on_dropdown_arrow(){
    cp.clickarrow();
    }

    @Then("clicks QA Engineering feature")
    public void clicks_qa_engineering_feature(){
    cp.QAEngineering();
    
    }
    
//	2
    @And("^QA Engineering application displayed$")
    public void qa_engineering_application_displayed() {
     Assert.assertEquals(ap.captureQAPageTitle(), prop.getProperty("ExpectedQaPageTitle"));

    }

    @Then("^user add valid\"([^\"]*)\"and\"([^\"]*)\"$")
    public void user_add_valid_firstname_and_lastname(String firstname, String lastname){
     ap.Firstname(firstname);   
     ap.Lastname(lastname);
    }

    @Then("^add \"([^\"]*)\"$")
    public void add_email(String email) {
     ap.Email(email);   
    }

    @And("^user add \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_add_phone_and_state(String phone, String state){
    ap.Phone(phone);    
    ap.State(state);
    }
    
    @Then("^clicks on submit button$")
    public void clicks_on_submit_button() {
     ap.Clicksubmit();  
    }
  
//  3
    @Then("^user add invalid\"([^\"]*)\"and\"([^\"]*)\"$")
    public void user_add_invalid_firstname_and_lastname(String firstname, String lastname) {
    ap.Firstname(firstname);   
    ap.Lastname(lastname);	
    }

    @And("^submit button is clickable$")
    public void submit_button_is_clickable(){
    ap.Clicksubmit();      
    }
    
//   4
    @Then("^add invalid\"([^\"]*)\"$")
    public void add_invalid_email(String email){
    ap.Email(email);   
    }
    
    @And("^submit button is not clickable$")
    public void submit_button_is_not_clickable(){
    ap.Clicksubmit();     
    }
   
    @And("^gets error message$")
    public void gets_error_message(){
     Assert.assertTrue(ap.errmsg());
    }
//    5
    
    @And("^user add invalid \"([^\"]*)\" and valid \"([^\"]*)\"$")
    public void user_add_invalid_phone_and_valid_state(String phone, String state) {
    ap.Phone(phone);    
    }
    
    @And("^gets error message under phone field$")
    public void gets_error_message_under_phone_field() {
    Assert.assertTrue(ap.errphonemsg());  
    }	 
    
}
