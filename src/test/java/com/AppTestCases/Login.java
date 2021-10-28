package com.AppTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ProjectUtilities.Browserfactory;



public class Login {

	static WebDriver driver;
	static Browserfactory browser;
	
	@BeforeSuite
	public void setupsuite(){
		browser = new Browserfactory();
	}
	
	@BeforeTest
	public void browse() {
		Browserfactory.launchbrowser("chrome", "https://www.mycontactform.com/index.php");
	}
}
