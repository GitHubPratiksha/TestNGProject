package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjectModel   {
	
	public WebDriver driver;
	By firstname=By.xpath("//input[@name='UserFirstName']");
	 By lastname=By.xpath("//input[@name='UserLastName']");
	 By jobTitle= By.xpath("//input[@name='UserTitle']");
	 By email= By.xpath("//input[@name='UserEmail']");
	 By phone= By.xpath("//input[@name='UserPhone']");
	 By employee=By.xpath("//select[@name='CompanyEmployees']");
	 By company=By.xpath("//input[@name='CompanyName']");
	 By country=By.xpath("//select[@name='CompanyCountry']");
	 By agreeCheckbox= By.xpath("//div[@class='checkbox-ui'][1]");
	 By yesIwouldCheckbox= By.xpath("//input[@id='Lead.InfoEmail__c']");
	 
	 
	 
	 public SignUpPageObjectModel(WebDriver driver2) {
		this.driver= driver2;
	}

	public WebElement FirstName() {
		 
		 return driver.findElement(firstname);	 
}

public WebElement lastname() {
	 
	 return driver.findElement(lastname);	 
}

public WebElement jobTitle() {
	 
	 return driver.findElement(jobTitle);	 
}


public WebElement email() {
	 
	 return driver.findElement(email);	 
}

public WebElement phone() {
	 
	 return driver.findElement(phone);	 
}

public WebElement selectEmp() {
	 
	 return driver.findElement(employee);
	 
}

public WebElement company() {
	 
	 return driver.findElement(company);	 
}

public WebElement selectCountry() {
	 
	 return driver.findElement(country);	 
}

public WebElement agree() {
	 
	 return driver.findElement(agreeCheckbox);	 
}

public WebElement yesIwould() {
	 
	 return driver.findElement(yesIwouldCheckbox);	 
}




}