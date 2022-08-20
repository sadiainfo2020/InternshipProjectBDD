package step_defination;

import org.testng.Assert;

import base.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.CoursesPage;

public class CoursesTestStep extends MainClass{
	
	
	CoursesPage cp = new CoursesPage();
	
	@Given("user launch the browser")
    public void user_launch_the_browser(){
     Assert.assertEquals(driver.getTitle(), "Courses | Transfotech Academy");   
    }

    @When("user lands on the home page")
    public void user_lands_on_the_home_page(){
    Assert.assertEquals(driver.getTitle(), prop.getProperty("ExpectedCoursesPageTitle") );     
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
	

}
