package VTigerTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Object_repositories.Login_page;
import genericutilities.Excel_file_utility;
import genericutilities.Java_utility;
import genericutilities.Webdriver_utility;
import genericutilities.propertyfileutlity;

public class ORG_Test {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=null;
		propertyfileutlity putil=new propertyfileutlity();
		Excel_file_utility eutil=new Excel_file_utility();
		Webdriver_utility wutil=new Webdriver_utility();
		Java_utility jutil=new Java_utility();
		//fetch browser name
		String BROWSER = putil.readdatafrompf("browser");
		System.out.println(BROWSER);
		//Launch browser
		if(BROWSER.equals("edge")) {
			 driver=new EdgeDriver();
		}
		else if(BROWSER.equals("chrome")) {
			 driver=new ChromeDriver();
		}
		else if(BROWSER.equals("firefox")) {
			 driver=new FirefoxDriver();
		}
		else {
			System.out.println("INVALID BROWSER NAME");
		}
		wutil.maximizeWindow(driver);
		wutil.waitForPageLoad(driver);
		//fetch URL
		String URL = putil.readdatafrompf("url");
		driver.get(URL);
		//Login to app
		String UN = putil.readdatafrompf("un");
		String PWD = putil.readdatafrompf("pwd");
		//Create object of Login apge POM class
		Login_page lp = new Login_page(driver);
		lp.loginToApp(UN, PWD);
		
	}





}
