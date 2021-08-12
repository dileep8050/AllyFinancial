package com.af.pages;

import org.openqa.selenium.By;

import com.af.enums.WaitStrategy;

public class SauceLoginPage extends BasePage {
	
	private final By textboxUsername=By.xpath("//input[@id='user-name']");
	private final By textboxpassword=By.xpath("//input[@id='password']");
	private final By buttonlogin=By.xpath("//input[@id='login-button']");
	
	public SauceLoginPage enterUsername(String username) {
		sendKeys(textboxUsername, username, WaitStrategy.PRESENCE);;
		return this;
	}
	
	public SauceLoginPage enterPassword(String password) {
		sendKeys(textboxpassword, password, WaitStrategy.PRESENCE);
		return this;
	}
	
	public SauceHomePage clickLogin()
	{
		click(buttonlogin, WaitStrategy.CLICKABLE);
		return new SauceHomePage();
	}
}
