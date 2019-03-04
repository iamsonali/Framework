package com.qa.util;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public static Properties pro;
	
	public TestBase(){
		try {
		pro= new Properties();
		
		
		 FileInputStream fis=  new FileInputStream("C:/Users/lenovo/workspace/FreeCRMBDD/src/main/java/com/qa/config/config.properties");
		 
		 pro.load(fis);
		} catch (IOException e) {
	
			e.getMessage();
		}
	}
		public static void initialization(){
			
			String browserName= pro.getProperty("browser");
			
			if(browserName.equals("chrome")){
				
				WebDriverManager.chromedriver().setup();
				
				driver= new ChromeDriver();
			
	}
			
			//This is my git commit
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			driver.manage().deleteAllCookies();
			
			driver.get(pro.getProperty("url"));
			System.out.println("Sonali code is pushed");
			
		
		
	}

}