package Project_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateOrg {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("http://localhost:8888/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//un
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	//pwd
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	//loginbtn
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	//click on organizations
	driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	//giving Org name
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("TCS");
	//saving the file
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	String actText = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	if(actText.contains("TCS")){
	System.out.println("pass");
	}
else
{
	System.out.println("fail");
}
	WebElement admin = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
    Actions a= new Actions(driver);
    a.moveToElement(admin).perform();
    //click on signout button
    driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	
}
}

