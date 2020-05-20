package com.w2a.pages;

import com.w2a.base.Page;

public class LoginPage extends Page {

	public ZohoAppPage doLogin(String email, String password) {
		type("email_CSS", email);
		click("loginnextbtn_CSS");
		type("password_CSS", password);
		click("signin_CSS");
		
		return new ZohoAppPage();
	}

	public void goToSales() {

	}
}
