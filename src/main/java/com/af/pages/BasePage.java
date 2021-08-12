package com.af.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.af.driver.DriverManager;
import com.af.enums.WaitStrategy;
import com.af.factories.ExplicitWaitFactory;

public class BasePage {
	
	protected void click(By by,WaitStrategy waitStrategy)
	{
		WebElement element=	ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.click();
	}

	protected void sendKeys(By by,String value,WaitStrategy waitStrategy)
	{
		WebElement element=	ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.sendKeys(value);
	}

	protected String getPageTitle()
	{
		return DriverManager.getDriver().getTitle();
	}
}
