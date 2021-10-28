package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.AppObjects.LoginPageObjects;
import com.ProjectUtilities.Browserfactory;
import com.ProjectUtilities.PropertyReader;
import com.simplecapture.Screencapture;
import com.simplifiedObjects.LoginTestObjects;

import listeners.Listenercapture;

@Listeners(listeners.Testlisteners.class)
public class LoginAppService {

		static WebDriver driver;
		static Browserfactory browser;
		static LoginPageObjects loginpage;
		static LoginTestObjects objects;
		static PropertyReader read;
	//	static Listenercapture screencapture;
		static Screencapture screen;
		@BeforeSuite
		public void setupsuite() throws IOException{
			browser = new Browserfactory();
		//	loginpage = new LoginPageObjects();
			objects= new LoginTestObjects();
			read = new PropertyReader();
		//	screencapture = new Listenercapture();
			screen = new Screencapture();
		}
		
		@BeforeTest
		public void browse() {
	//	driver=	Browserfactory.launchbrowser("chrome", "https://www.mycontactform.com/index.php");
		driver = Browserfactory.launchbrowser(read.getappanme(),read.getappurl());
		}

		@Parameters({"username","password"})
		@Test
		public void login(String username , String password) throws InterruptedException {
		//	loginpage = PageFactory.initElements(driver, LoginPageObjects.class);
		//	loginpage.getusername("tester");
		//	loginpage.getpassword("admin");
		//	loginpage.getsubmit();
			
			objects=PageFactory.initElements(driver, LoginTestObjects.class);
	//		objects.insertusername("tester").insertpassword("admin").clickonsubmit();
			objects.insertusername(username).insertpassword(password).clickonsubmit().clickonsignout();
		}	
		@AfterMethod
		public void fail_capture(ITestResult results) {
			try {
				if(ITestResult.FAILURE ==results.getStatus()) {
					screen.Screenshot(driver, "Step Fail");
				}
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}finally {
				System.out.println("failure screen captured");
			}
		}
					
		
		@AfterTest
		public void close() {
			driver.close();
		}
}	
