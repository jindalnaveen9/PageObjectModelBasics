package com.w2a.pages.crm.accounts;

import com.w2a.base.Page;

public class AccountsPage extends Page{


	public CreateAccountPage goToCreateAccount() {
		click("createaccountbtn_XPATH");
		return new CreateAccountPage();
	}

	public void goToImportsAccount() {

	}
}
