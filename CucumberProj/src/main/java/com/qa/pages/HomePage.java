package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//span[text()='Bhoomika']")
	
	WebElement HomePageValidation;
	
	//initilaizng the page object
	
		public HomePage(){
			
			PageFactory.initElements(driver, this);

}
		
		
		
}
