package TestCases;

import java.io.IOException;
import org.openqa.selenium.By;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import Resources.baseClass;

public class verifyLogin extends baseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Test
	public void login() throws IOException {
		
		
		LoginPageObject obj= new LoginPageObject(driver);
		
		obj.enterUsername().sendKeys("Test");
		obj.password().sendKeys("test43");
		obj.login().click();
		
		
		
		
	}
	

}
