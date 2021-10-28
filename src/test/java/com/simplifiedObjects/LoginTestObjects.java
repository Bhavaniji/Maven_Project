package com.simplifiedObjects;

import com.AppObjects.LoginPageObjects;

public class LoginTestObjects extends LoginPageObjects {
	
	public LoginTestObjects insertusername(String user) {
		getusername(user);
		return this;
	}
	
	public LoginTestObjects insertpassword(String pass) {
		getpassword(pass);
		return this;	
	}
	
	public LoginTestObjects clickonsubmit() {
		getsubmit();
		return this;
	}
	
	public LoginTestObjects clickonsignout() {
		getsignout();
		return this;
	}

}
