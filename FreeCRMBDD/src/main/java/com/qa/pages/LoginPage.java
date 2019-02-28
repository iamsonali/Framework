package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement LoginBtn;
	
	//initilaizng the page object
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public HomePage login(String un,String pwd){
		
		username.sendKeys(un);
	
		password.sendKeys(pwd);
	
	    LoginBtn.click();
	    System.out.println("bhoo");
	return new HomePage();
	}

}
