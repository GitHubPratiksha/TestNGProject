package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignUpPageObjectModel;
import Resources.baseClass;

public class verifySignup extends baseClass {

	
	
	
	
	@Test
	public void signup() throws IOException, InterruptedException {
		
		
		LoginPageObject obj1 = new LoginPageObject(driver); 
		obj1.tryForFree().click();
		
		SignUpPageObjectModel spo= new SignUpPageObjectModel(driver);
		
		Thread.sleep(3000);
		spo.FirstName().sendKeys("Pratiksha");
		spo.lastname().sendKeys("Dixit");
		spo.jobTitle().sendKeys("Software Tester");
		spo.email().sendKeys("test@test.com");
		spo.phone().sendKeys("8978546325");
		
		//employee dropdown
		WebElement emp= spo.selectEmp();
		Select employeeDD = new Select(emp);
		employeeDD.selectByIndex(2);
		
	
		spo.company().sendKeys("CG Group");
		
		//country drop down
		WebElement co= spo.selectCountry();
		Select country= new Select(co);
		country.selectByVisibleText("Georgia");
		
		//Agree Checkbox
		spo.agree().click();
		
		//Yes I would check box
		//Thread.sleep(3000);
		//spo.yesIwould().click();
		
		
		
		}
	
	
	

}
