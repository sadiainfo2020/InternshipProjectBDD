package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.MainClass;

public class CoursesPage extends MainClass{
	
	
        Actions action = new Actions(driver);
	
        // *[@id="menu-qp18"]/li[3]/a
		@FindBy(xpath = "//header/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
		WebElement clickCourses;

		// *[@id="menu-qp18"]/li[3]/a/span
		@FindBy(xpath = "//header/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]")
		WebElement clickDownArrow;

		// *[@id="menu-qp18"]/li[3]/ul/li[1]/a
		                
		@FindBy(xpath = "//header/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]")
		WebElement clickQAEngineering;
		
		
      	public CoursesPage() {
			PageFactory.initElements(driver, this);
		}

		public String captureCoursesPageTitle() {
			return driver.getTitle();
		}

		public String captureCoursesPageUrl() {
			return driver.getCurrentUrl();
		}

		public void clickCoursesBtn() {
			clickCourses.click();
		}

		public void clickarrow() {
			action.click().build().perform();
		}

		public void QAEngineering() {
			action.click().build().perform();
//			clickQAEngineering.click();
			
			
		}
	
	

	

}
