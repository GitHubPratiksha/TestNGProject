package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	public WebDriver driver; //driver does not have scope
	public LoginPageObject(WebDriver driver2) {
		
		this.driver= driver2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
	}
	By username= By.xpath("//input[@id='username']");
	By password= By.xpath("//input[@id='password']");
	By login= By.id("Login");
	
	By tryForFree= By.id("signup_link");
	
	public WebElement enterUsername() {
		
		return driver.findElement(username);
	}
	
public WebElement password() {
		
		return driver.findElement(password);
	}

public WebElement login() {
	
	return driver.findElement(login);
}

public WebElement tryForFree() {
	
	return driver.findElement(tryForFree);
}


	
	
	
	
	
	
	
	
	
}

