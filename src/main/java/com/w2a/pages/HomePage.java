package com.w2a.pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class HomePage extends Page {

	public void goToSupport() {
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/a[2]")).click();
	}

	public void goToSignUp() {
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/a[5]")).click();
	}

	public LoginPage goToLogin() {
		click("loginlink_XPATH");
		return new LoginPage();
	}

	public void goToZohoEdu() {

	}

	public void goToLearnMore() {

	}

	public void validateFooterLinks() {

	}

}
