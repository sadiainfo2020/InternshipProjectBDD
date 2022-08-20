package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.MainClass;

public class CoursesPage extends MainClass{
	
	

	// *[@id="menu-qp18"]/li[3]/a
		@FindBy(xpath = "//header/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
		WebElement clickCourses;

		// *[@id="menu-qp18"]/li[3]/a/span
		@FindBy(xpath = "//header/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]")
		WebElement clickDownArrow;

		// *[@id="menu-qp18"]/li[3]/ul/li[1]/a
		@FindBy(xpath = "//header/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]")
		WebElement clickQAEngineering;
		
		
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
		
		

		public CoursesPage() {
			PageFactory.initElements(driver, this);
		}

		public String capturePageTitle() {
			return driver.getTitle();
		}

		public String capturePageUrl() {
			return driver.getCurrentUrl();
		}

		public void clickCoursesBtn() {
			clickCourses.click();
		}

		public void clickarrow() {
			clickDownArrow.click();
		}

		public void QAEngineering() {
			clickQAEngineering.click();
		}



	

}
