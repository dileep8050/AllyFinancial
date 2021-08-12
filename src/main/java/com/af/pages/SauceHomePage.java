package com.af.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.af.driver.DriverManager;

public class SauceHomePage extends BasePage {
private final By cart=By.xpath("//*[@id='shopping_cart_container']/a");
	
	public WebElement getcart()
	{
		return DriverManager.getDriver().findElement(cart);
	}
	
	public String getTitle() {
		return getPageTitle();	
	}
}
