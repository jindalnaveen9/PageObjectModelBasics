package com.w2a.pages;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {

	public void goToChat() {

	}

	public CRMHomePage goToCRM() {
		click("crmclick_XPATH");
		return new CRMHomePage();
	}

	public void goToSalesIQ() {

	}
}
