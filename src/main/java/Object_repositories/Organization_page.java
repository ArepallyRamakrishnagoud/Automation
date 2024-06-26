package Object_repositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organization_page {
	//Declaration
		@FindBy(xpath = "//img[@alt='creat organizaton...']")
		private WebElement createorgLookUpImg;
		
		//Initialization
		public Organization_page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		public WebElement getcreateorgLookUpImg() {
			return createorgLookUpImg;
		}
		
		//Business Library
		/**
		 * this method will click on creat contact look up image
		 */
		
		public void clickoncreateorgLookUpImg()
		{
			createorgLookUpImg.click();
		}
	}