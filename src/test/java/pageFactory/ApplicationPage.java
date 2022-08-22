package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.MainClass;

public class ApplicationPage extends MainClass{
	
	

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
	
	@FindBy(xpath="//*[@id=\"menu-24ds\"]/li[3]/ul/li[1]/a")
	WebElement errmsgemailisinvalid;
	
	@FindBy(xpath="//header/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]")
	WebElement errmsgInvalidphonenumber;

	public ApplicationPage() {
		PageFactory.initElements(driver, this);
	}

	public String captureQAPageTitle() {
		return driver.getTitle();
	}
	
	public String captureQAPageUrl() {
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
	public boolean errmsg() {
		return	errmsgemailisinvalid.isDisplayed();
		 
	}
	public boolean errphonemsg() {
		return	errmsgInvalidphonenumber.isDisplayed();
	}	 

}
