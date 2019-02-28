package glue;

import junit.framework.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends TestBase{
	
	LoginPage loginpage;
	
	HomePage homepage;
	
	
	//WebDriver driver;
	
	
@Given("^I am on facebook login page$")
public void I_am_on_facebook_login_page()  {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
}

@When("^I enter the \"(.*)\" and \"(.*)\"$")
public void I_enter_the_and_baby(String usn, String pwd) throws Throwable {
   
	driver.findElement(By.id("email")).sendKeys(usn);
	driver.findElement(By.id("pass")).sendKeys(pwd);
  
}



@Then("^I click on login$")
public void I_click_on_login()  {
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
    
}

@Then("^I am on facebook homepage$")
public void I_am_on_facebook_homepage() {
   WebElement ele=driver.findElement(By.xpath("//span[text()='Bhoomika']"));
   Assert.assertEquals("Bhoomika", ele.getText());
}
//==============================================Page  Obj Model===============================================================
@Given("^user opens browser$")
public void user_opens_browser()  {
	
	TestBase.initialization();
    
}

@Then("^user is on login page$")
public void user_is_on_login_page() throws InterruptedException  {
	loginpage= new LoginPage();
	String title=loginpage.validateLoginPageTitle();
	Assert.assertEquals("Facebook – log in or sign up",title);
	System.out.println(title);
  Thread.sleep(5000);
}

@Then("^user enters username and password$")
public void user_enters_username_and_password(){
homepage =loginpage.login(pro.getProperty("username"),pro.getProperty("password"));

}



@Then("^home page is displayed$")
public void home_page_is_displayed()  {
    
}






}
