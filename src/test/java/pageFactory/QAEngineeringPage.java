package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.MainClass;

public class QAEngineeringPage extends MainClass{

	
	@FindBy(xpath = "//*[@id=\"first_name\"]")
	WebElement Enterfirstname;

	@FindBy(xpath = "//*[@id=\"last_name\"]")
	WebElement Enterlastname;

	@FindBy(xpath = "//*[@id=\"_builder-form\"]/div/div[4]/div/div/input")
	WebElement Enteremail;

	@FindBy(xpath = "//*[@id=\"phone\"]")
	WebElement Enterphone;

	@FindBy(xpath = "//*[@id=\"state\"]")
	WebElement Enterstate;

	@FindBy(xpath = "//*[@id=\"_builder-form\"]/div/div[9]/div/div/div/button")
	WebElement clicksubmit;

	public QAEngineeringPage() {
		PageFactory.initElements(driver, this);
	}

	public String capturePageTitle() {
		return driver.getTitle();
	}

	public void Firstname(String firstname) {
		Enterfirstname.sendKeys(firstname);
	}

	public void Lastname(String lastname) {
		Enterlastname.sendKeys(lastname);
	}

	public void Email(String email) {
		Enteremail.sendKeys(email);
	}

	public void Phone(String phone) {
		Enterphone.sendKeys(phone);
	}

	public void State(String state) {
		Enterstate.sendKeys(state);
	}

	public void Clicksubmit() {
		clicksubmit.click();
	}







}
