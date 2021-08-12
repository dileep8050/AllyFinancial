package com.af.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.af.driver.Driver;
import com.af.enums.ConfigProperties;
import com.af.utils.PropertyUtils;

public class BaseTest {
	
	protected BaseTest() {}
	
	@BeforeMethod(alwaysRun = true)
	protected void setUp()
	{
		Driver.initDriver(PropertyUtils.get(ConfigProperties.BROWSER));
	}
	
	@AfterMethod(alwaysRun = true)
	protected void tearDown()
	{
		Driver.quitdriver();
	}

}
