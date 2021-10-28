package com.AppObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.simplecapture.Screencapture;


public class LoginPageObjects {

	static Screencapture screen = new Screencapture();
	static WebDriver driver;
	@FindBy(name="user")WebElement username;
	@FindBy(name="pass")WebElement password;
	@FindBy(name="btnSubmit")WebElement submit;
	@FindBy(xpath="//*[@id=\"user_bar\"]/ul/li[1]/a")WebElement signout;
	@FindBy(id="right_col_top_err")WebElement errormessage;
	
	
	public void getusername(String us) {
		username.sendKeys(us);
	}
	
	public void getpassword(String pw) {
		password.sendKeys(pw);
	}
	
	public void getsubmit()  {
		if(submit.isEnabled()) {	
		submit.click();
		System.out.println("clicked submit button");
		
		
		try {
			String message= errormessage.getText();
			System.out.println("usermessage is  " + message);
			screen.Screenshot(driver, "usermessage");
		}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
		}
	}
		else {
			System.out.println("Does not performed");
		}
		}
	
	public void getsignout() {
		if(signout.isEnabled()) {
			try {
				signout.click();
				System.out.println("Logut success");
				screen.Screenshot(driver, "logout");
			}catch(Exception ex){
				ex.getMessage();
			}
			
	}
}
}